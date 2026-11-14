/*
 * Generador que convierte un programa Latino .lat en un programa Go .go
 */
package uta.latino.generator

import java.util.List
import java.util.Map
import java.util.Set
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import latino.Asignacion
import latino.AsignacionIndice
import latino.Caso
import latino.Ciclo
import latino.CicloCondicion
import latino.Condicional
import latino.Continuar
import latino.Conversion
import latino.Definicion
import latino.Desde
import latino.Elegir
import latino.Funcion
import latino.Imprimir
import latino.Incremento
import latino.Leer
import latino.Lista
import latino.Llamada
import latino.Mientras
import latino.OperadorPaso
import latino.Osi
import latino.Para
import latino.Programa
import latino.Repetir
import latino.Retorno
import latino.Romper
import latino.Sentencia
import latino.Variable
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class LatinoGenerator extends AbstractGenerator {

	// Se llenan mientras se arma el main y dicen que imports y funciones de ayuda hacen falta
	var Map<String, String> tipos
	var boolean usaTexto
	var boolean usaModulo
	// Nombres de las variables del programa principal, son las globales
	var Set<String> principales
	// Ciclos que necesitan etiqueta porque un romper sale de ellos desde dentro de un elegir
	var Map<EObject, String> etiquetas

	// Crea el .go con el mismo nombre del .lat, prueba.lat da prueba.go
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val programa = resource.contents.filter(Programa).head
		if (programa === null) return
		val nombreArchivo = resource.URI.trimFileExtension.lastSegment
		fsa.generateFile(nombreArchivo + '.go', compilar(programa))
	}

	// Programa 

	// Arma el programa de Go. Latino no declara variables pero Go si,
	// asi que las del programa principal se declaran arriba, fuera del main, con su tipo.
	// Asi las funciones tambien las pueden usar. Despues van las funciones y el main con las sentencias.
	// Al final van las funciones de ayuda y arriba solo los imports que se usan.
	def CharSequence compilar(Programa p) {
		val definiciones = p.eAllContents.filter(Definicion).toList
		val funciones = p.sentencias.filter(Funcion).toList
		val principal = p.sentencias.filter[!(it instanceof Funcion)].toList
		tipos = newHashMap
		usaTexto = false
		usaModulo = false
		etiquetas = newHashMap
		for (r : p.eAllContents.filter(Romper).toList) {
			if (pasaPorElegir(r)) {
				val ciclo = cicloDe(r)
				if (ciclo !== null && !etiquetas.containsKey(ciclo)) etiquetas.put(ciclo, 'ciclo' + (etiquetas.size + 1))
			}
		}
		principales = nombresDe(principal)
		for (n : principales) {
			tipos.put(n, tipoGo(n, p, definiciones, newHashSet))
		}
		// Los parametros y las locales de cada funcion tienen su propio tipo, con la clave funcion/nombre.
		// Cada funcion guarda tambien el tipo que devuelve, vacio si no devuelve nada
		for (f : funciones) {
			for (n : f.parametros.map[nombre] + localesDe(f)) {
				tipos.put(f.nombre + '/' + n, tipoGo(f.nombre + '/' + n, p, definiciones, newHashSet))
			}
			tipos.put(f.nombre, tipoRetorno(f, p, definiciones, newHashSet))
		}
		val usaLeer = definiciones.exists[it instanceof Leer]
		val usaEscribir = p.eAllContents.exists[it instanceof Imprimir]
		// Las funciones se arman aqui, antes de decidir los imports, porque tambien pueden usar % o ..
		val textoFunciones = <CharSequence>newArrayList
		for (f : funciones) {
			textoFunciones.add(funcionGo(f))
		}
		val cuerpo = '''
			«FOR s : principal»
				«sentencia(s)»
			«ENDFOR»
		'''
		val paquetes = newArrayList
		if (usaLeer) paquetes.add('bufio')
		if (usaEscribir || usaTexto || usaLeer) paquetes.add('fmt')
		if (usaModulo) paquetes.add('math')
		if (usaLeer) paquetes.add('os')
		if (usaTexto || usaLeer) paquetes.add('strconv')
		if (usaLeer) paquetes.add('strings')
		return '''
			package main
			«IF paquetes.size == 1»

			import "«paquetes.head»"
			«ELSEIF paquetes.size > 1»

			import (
				«FOR q : paquetes»
					"«q»"
				«ENDFOR»
			)
			«ENDIF»
			«IF usaLeer»

			var lector = bufio.NewReader(os.Stdin)
			«ENDIF»
			«IF !principales.empty»

			«FOR n : principales»
				var «n» «tipos.get(n)»
			«ENDFOR»
			«ENDIF»
			«FOR f : textoFunciones»

			«f»
			«ENDFOR»

			func main() {
				«cuerpo»
			}
			«IF usaLeer»

			func leerTexto() string {
				linea, _ := lector.ReadString('\n')
				return strings.TrimSpace(strings.TrimPrefix(linea, "\xef\xbb\xbf"))
			}

			func leerNumero() float64 {
				texto := leerTexto()
				numero, err := strconv.ParseFloat(texto, 64)
				if err != nil {
					fmt.Println("Se esperaba un numero y se leyo " + texto)
					os.Exit(1)
				}
				return numero
			}
			«ENDIF»
			«IF usaTexto»

			func aTexto(v any) string {
				switch x := v.(type) {
				case float64:
					return strconv.FormatFloat(x, 'g', 16, 64)
				case bool:
					if x {
						return "verdadero"
					}
					return "falso"
				«IF tipos.containsValue('[]float64')»
				case []float64:
					s := "["
					for i, e := range x {
						if i > 0 {
							s += ", "
						}
						s += aTexto(e)
					}
					return s + "]"
				«ENDIF»
				«IF tipos.containsValue('[]bool')»
				case []bool:
					s := "["
					for i, e := range x {
						if i > 0 {
							s += ", "
						}
						s += aTexto(e)
					}
					return s + "]"
				«ENDIF»
				«IF tipos.containsValue('[]string')»
				case []string:
					s := "["
					for i, e := range x {
						if i > 0 {
							s += ", "
						}
						comilla := "\""
						for _, r := range e {
							if r == '"' {
								comilla = "'"
							}
						}
						s += comilla + e + comilla
					}
					return s + "]"
				«ENDIF»
				}
				return fmt.Sprint(v)
			}
			«ENDIF»
		'''
	}

	// Una funcion de Latino pasa a una func de Go fuera del main. Cada parametro lleva el tipo de lo que recibe
	// y las variables que solo se usan dentro de la funcion se declaran ahi, con su "_ = x"
	def CharSequence funcionGo(Funcion f) {
		val devuelve = tipos.get(f.nombre)
		'''
			func «f.nombre»(«f.parametros.map[nombre + ' ' + tipos.get(f.nombre + '/' + nombre)].join(', ')»)«IF !devuelve.empty» «devuelve»«ENDIF» {
				«FOR n : localesDe(f)»
					var «n» «tipos.get(f.nombre + '/' + n)»
					_ = «n»
				«ENDFOR»
				«FOR s : f.cuerpo»
					«sentencia(s)»
				«ENDFOR»
				«IF !devuelve.empty && !terminaConRetorno(f.cuerpo)»
					return «ceroGo(devuelve)»
				«ENDIF»
			}'''
	}

	// Las variables que solo son de la funcion, las que se definen dentro y no son globales ni parametros
	def List<String> localesDe(Funcion f) {
		nombresDe(f.cuerpo).filter[!principales.contains(it) && !f.parametros.exists[p | p.nombre == it]].toList
	}

	// Los nombres de variables que se definen en estas sentencias o dentro de ellas
	def Set<String> nombresDe(List<? extends Sentencia> sentencias) {
		val nombres = newLinkedHashSet
		for (s : sentencias) {
			for (o : #[s as EObject] + s.eAllContents.toList) {
				if (o instanceof Definicion && !(o instanceof Funcion)) nombres.add((o as Definicion).nombre)
				if (o instanceof Variable) nombres.add(o.nombre)
			}
		}
		nombres.remove(null)
		return nombres
	}

	// Go pide un return al final si la funcion devuelve algo. Esto mira si el ultimo paso ya devuelve siempre,
	// un retorno, un si con sino o un elegir con otro donde todos los caminos terminan en retorno
	def boolean terminaConRetorno(List<Sentencia> l) {
		if (l.empty) return false
		val u = l.last
		switch u {
			Retorno: true
			Condicional: !u.sino.empty && terminaConRetorno(u.entonces) && u.osis.forall[terminaConRetorno(sentencias)] && terminaConRetorno(u.sino)
			Elegir: !u.defecto.empty && u.casos.forall[terminaConRetorno(sentencias)] && terminaConRetorno(u.defecto)
			default: false
		}
	}

	// El valor que se devuelve si la funcion llega al final sin retorno
	def String ceroGo(String tipo) {
		switch tipo {
			case 'string': '""'
			case 'bool': 'false'
			case 'float64': '0'
			default: 'nil'
		}
	}

	// ===== Sentencias =====
	// Un metodo por cada tipo de sentencia. Se llaman entre si,
	// por eso un si dentro de otro si funciona sin limite.

	def dispatch CharSequence sentencia(Asignacion a) '''«a.nombre» = «traducir(a.valor)»'''

	// anumero lee un numero y acadena un texto, sin conversion se lee segun el tipo de la variable
	def dispatch CharSequence sentencia(Leer l) {
		val numero = l.conversion == Conversion.NUMERO
			|| (l.conversion == Conversion.NINGUNA && tipos.get(clave(l.nombre, funcionDe(l))) == 'float64')
		'''«l.nombre» = «IF numero»leerNumero()«ELSE»leerTexto()«ENDIF»'''
	}

	// La lista pasa a un slice de Go con el tipo de sus elementos, [1, 2] da []float64{1.0, 2.0}
	def dispatch CharSequence sentencia(Lista l) '''«l.nombre» = «tipos.get(clave(l.nombre, funcionDe(l)))»{«l.elementos.map[traducir(it)].join(', ')»}'''

	// v[i] = x cambia un elemento, el indice pasa a int porque Go no deja usar float64
	def dispatch CharSequence sentencia(AsignacionIndice a) '''«a.lista»[«indiceGo(a.indice)»] = «traducir(a.valor)»'''

	// El si pasa a if, cada osi a else if en el mismo orden y el sino a else
	def dispatch CharSequence sentencia(Condicional c) '''
		if «traducir(c.condicion)» {
			«FOR s : c.entonces»
				«sentencia(s)»
			«ENDFOR»
		}«FOR o : c.osis» else if «traducir(o.condicion)» {
			«FOR s : o.sentencias»
				«sentencia(s)»
			«ENDFOR»
		}«ENDFOR»«IF !c.sino.empty» else {
			«FOR s : c.sino»
				«sentencia(s)»
			«ENDFOR»
		}«ENDIF»'''

	// mientras pasa a un for con solo la condicion
	def dispatch CharSequence sentencia(Mientras m) '''
		«etiqueta(m)»for «traducir(m.condicion)» {
			«FOR s : m.cuerpo»
				«sentencia(s)»
			«ENDFOR»
		}'''

	// repetir hace el cuerpo una vez y despues mira la condicion. primeraVuelta hace eso en el mismo for,
	// asi un continuar tambien pasa por la condicion y el ciclo puede terminar
	def dispatch CharSequence sentencia(Repetir r) '''
		«etiqueta(r)»for primeraVuelta := true; primeraVuelta || !(«traducir(r.condicion)»); primeraVuelta = false {
			«FOR s : r.cuerpo»
				«sentencia(s)»
			«ENDFOR»
		}'''

	// desde pasa al for de Go con sus tres partes
	def dispatch CharSequence sentencia(Desde d) '''
		«etiqueta(d)»for «sentencia(d.inicio)»; «traducir(d.condicion)»; «sentencia(d.paso)» {
			«FOR s : d.cuerpo»
				«sentencia(s)»
			«ENDFOR»
		}'''

	// para i en rango arma el for, sin inicio empieza en 0 y sin paso suma 1
	// si el paso es negativo cuenta hacia abajo y compara con >
	def dispatch CharSequence sentencia(Para c) {
		val l = c.limites
		val v = c.variable.nombre
		val inicio = if (l.size > 1) traducir(l.get(0)) else '0.0'
		val fin = if (l.size > 1) traducir(l.get(1)) else traducir(l.get(0))
		val paso = if (l.size > 2) traducir(l.get(2)) else '1.0'
		val compara = if (l.size > 2 && l.get(2).trim.startsWith('-')) '>' else '<'
		'''
			«etiqueta(c)»for «v» = «inicio»; «v» «compara» «fin»; «v» += «paso» {
				«FOR s : c.cuerpo»
					«sentencia(s)»
				«ENDFOR»
			}'''
	}

	// i++ e i-- quedan igual en Go
	def dispatch CharSequence sentencia(Incremento i) '''«i.nombre»«IF i.operador == OperadorPaso.MENOS»--«ELSE»++«ENDIF»'''

	// En Go un break dentro de switch solo sale del switch, en Latino romper sale del ciclo.
	// Por eso si hay un elegir en medio se sale con la etiqueta del ciclo
	def dispatch CharSequence sentencia(Romper r) '''break«IF pasaPorElegir(r)» «etiquetas.get(cicloDe(r))»«ENDIF»'''

	def dispatch CharSequence sentencia(Continuar c) '''continue'''

	// elegir pasa a switch, varios caso seguidos van en un solo case y otro pasa a default.
	// Go tampoco pasa al caso siguiente, igual que Latino
	def dispatch CharSequence sentencia(Elegir e) '''
		switch «traducir(e.expresion)» {
		«FOR c : e.casos»
			case «c.valores.map[traducir(it)].join(', ')»:
				«FOR s : c.sentencias»
					«sentencia(s)»
				«ENDFOR»
		«ENDFOR»
		«IF !e.defecto.empty»
			default:
				«FOR s : e.defecto»
					«sentencia(s)»
				«ENDFOR»
		«ENDIF»
		}'''

	// El ciclo mas cercano que contiene a o, null si no hay
	def EObject cicloDe(EObject o) {
		var x = o.eContainer
		while (x !== null && !(x instanceof Ciclo)) x = x.eContainer
		return x
	}

	// Dice si entre o y su ciclo hay un elegir
	def boolean pasaPorElegir(EObject o) {
		var x = o.eContainer
		while (x !== null && !(x instanceof Ciclo)) {
			if (x instanceof Elegir) return true
			x = x.eContainer
		}
		return false
	}

	// Pone la etiqueta delante del for solo si algun romper la usa, Go no deja etiquetas sin usar
	def String etiqueta(EObject ciclo) {
		if (etiquetas.containsKey(ciclo)) return etiquetas.get(ciclo) + ': '
		return ''
	}

	// retorno pasa a return
	def dispatch CharSequence sentencia(Retorno r) '''return «traducir(r.valor)»'''

	// Llamar a una funcion sola queda igual en Go, cada valor se traduce aparte
	def dispatch CharSequence sentencia(Llamada l) '''«l.funcion»(«l.argumentos.map[traducir(it)].join(', ')»)'''

	// escribir muestra el valor como lo muestra Latino
	def dispatch CharSequence sentencia(Imprimir i) '''fmt.Println(«textoGo(i.mensaje)»)'''

	// ===== Tipos =====
	// Cada variable tiene una clave. Una global usa su nombre, x. Un parametro o una local de una funcion
	// usa la funcion y el nombre, suma/x, asi cada funcion tiene sus propios tipos.

	// La funcion que contiene a o, null si o esta en el programa principal
	def Funcion funcionDe(EObject o) {
		var x = o
		while (x !== null && !(x instanceof Funcion)) x = x.eContainer
		return x as Funcion
	}

	// La clave de un nombre visto desde dentro de f. Dentro de una funcion manda el parametro.
	// Como en Latino, asignar a un nombre que ya es global escribe la global, si no la variable es local
	def String clave(String nombre, Funcion f) {
		if (f === null) return nombre
		if (f.parametros.exists[it.nombre == nombre]) return f.nombre + '/' + nombre
		if (principales.contains(nombre)) return nombre
		if (nombresDe(f.cuerpo).contains(nombre)) return f.nombre + '/' + nombre
		return nombre
	}

	// El nombre que va en una clave, lo que sigue a la barra si la hay
	def String nombreDe(String clave) {
		clave.substring(clave.indexOf('/') + 1)
	}

	// La funcion de una clave, null si la clave es de una global
	def Funcion funcionDeClave(String clave, List<Definicion> defs) {
		if (!clave.contains('/')) return null
		val f = clave.substring(0, clave.indexOf('/'))
		defs.filter(Funcion).findFirst[nombre == f]
	}

	// Deduce el tipo Go de una variable mirando todo lo que se le asigna o se le lee con esa misma clave.
	// En Latino todos los numeros son decimales, por eso los numeros son float64.
	def String tipoGo(String clave, Programa p, List<Definicion> defs, Set<String> visitados) {
		visitados.add(clave)
		val nombre = nombreDe(clave)
		val f = funcionDeClave(clave, defs)
		// El nombre de una funcion vale lo que devuelve
		if (f === null) {
			val funcion = defs.filter(Funcion).findFirst[it.nombre == nombre]
			if (funcion !== null) {
				val t = tipoRetorno(funcion, p, defs, visitados)
				return if (t.empty) 'float64' else t
			}
		}
		val encontrados = newHashSet
		// Un parametro que se usa como numero es float64, si no vale lo que recibe en la llamada
		if (f !== null) {
			val i = f.parametros.map[it.nombre].indexOf(nombre)
			if (i >= 0) {
				if (seUsaComoNumero(clave, p, defs, visitados)) encontrados.add('float64')
				else encontrados.add(tipoParametro(f, i, p, defs, visitados))
			}
		}
		for (d : defs.filter[!(it instanceof Funcion) && it.nombre == nombre && clave(it.nombre, funcionDe(it)) == clave]) {
			if (d instanceof Leer) {
				encontrados.add(tipoLeer(d, clave, p, defs, visitados))
			} else if (d instanceof Asignacion) {
				if (d.valor !== null) encontrados.add(tipoValor(d.valor, funcionDe(d), p, defs, visitados))
			} else if (d instanceof Lista) {
				encontrados.add('[]' + tipoElementos(clave, p, defs, visitados))
			}
		}
		val lista = encontrados.findFirst[startsWith('[]')]
		if (lista !== null) return lista
		if (encontrados.contains('string')) return 'string'
		if (encontrados.contains('bool')) return 'bool'
		return 'float64'
	}

	// Tipo de los elementos de una lista, mira lo que tiene al crearla y lo que se le pone con v[i] = x
	def String tipoElementos(String clave, Programa p, List<Definicion> defs, Set<String> visitados) {
		val encontrados = newHashSet
		for (l : defs.filter(Lista).filter[nombre == nombreDe(clave) && clave(nombre, funcionDe(it)) == clave]) {
			for (e : l.elementos) encontrados.add(tipoValor(e, funcionDe(l), p, defs, visitados))
		}
		for (a : p.eAllContents.filter(AsignacionIndice).filter[valor !== null && clave(lista, funcionDe(it)) == clave].toList) {
			encontrados.add(tipoValor(a.valor, funcionDe(a), p, defs, visitados))
		}
		if (encontrados.contains('string')) return 'string'
		if (encontrados.contains('bool')) return 'bool'
		return 'float64'
	}

	// comparacion o verdadero/cierto/falso -> bool, texto o .. -> string y lo demas -> float64.
	// Si usa otras variables, tambien mira el tipo de esas, vistas desde la funcion donde esta el texto
	def String tipoValor(String texto, Funcion donde, Programa p, List<Definicion> defs, Set<String> visitados) {
		val v = quitarLlamadas(texto, p, defs, visitados)
		if (esLogico(v)) return 'bool'
		if (esCadena(v)) return 'string'
		for (otra : nombresEn(v)) {
			val k = clave(otra, donde)
			if (!visitados.contains(k) && conocido(otra, p, defs)) {
				// Si la otra es una lista y aqui se usa un elemento, v[0], vale el tipo del elemento
				val lista = tipoGo(k, p, defs, visitados)
				val t = if (v.matches('(?s).*\\b' + otra + ' *\\[.*')) lista.replaceFirst('^\\[\\]', '') else lista
				if (t != 'float64') return t
			}
		}
		return 'float64'
	}

	// Lo que devuelve una funcion es del tipo del valor de su primer retorno, vacio si no tiene retorno
	def String tipoRetorno(Funcion f, Programa p, List<Definicion> defs, Set<String> visitados) {
		visitados.add(f.nombre)
		val r = f.eAllContents.filter(Retorno).findFirst[valor !== null]
		if (r === null) return ''
		return tipoValor(r.valor, f, p, defs, visitados)
	}

	// El tipo de un parametro sale del valor que recibe en la primera llamada.
	// Primero mira las llamadas de fuera de la funcion y despues las de dentro, si no hay ninguna es float64
	def String tipoParametro(Funcion f, int i, Programa p, List<Definicion> defs, Set<String> visitados) {
		val llamadas = llamadasA(f, p)
		val ordenadas = llamadas.filter[!EcoreUtil.isAncestor(f, key)] + llamadas.filter[EcoreUtil.isAncestor(f, key)]
		val llamada = ordenadas.findFirst[value.size > i]
		if (llamada === null) return 'float64'
		return tipoValor(llamada.value.get(i), funcionDe(llamada.key), p, defs, visitados)
	}

	// Todas las llamadas a la funcion en orden, como sentencia sola o dentro de una expresion, con sus valores
	def List<Pair<EObject, List<String>>> llamadasA(Funcion f, Programa p) {
		val llamadas = <Pair<EObject, List<String>>>newArrayList
		for (o : p.eAllContents.toList) {
			if (o instanceof Llamada && (o as Llamada).funcion == f.nombre) llamadas.add(o -> (o as Llamada).argumentos.map[trim].toList)
			for (t : textosDe(o).filterNull) {
				for (a : argumentosEn(t, f.nombre)) llamadas.add(o -> a)
			}
		}
		return llamadas
	}

	// Busca en el texto las llamadas a una funcion y devuelve los valores de cada una
	def List<List<String>> argumentosEn(String t, String nombre) {
		val res = newArrayList
		var i = 0
		while (i < t.length) {
			val c = t.substring(i, i + 1)
			if (c == '"' || c == "'") {
				i = finCadena(t, i)
			} else if (Character.isLetter(t.charAt(i)) || c == '_') {
				var j = i
				while (j < t.length && (Character.isLetterOrDigit(t.charAt(j)) || t.charAt(j) == '_')) j = j + 1
				var k = j
				while (k < t.length && t.charAt(k) == ' ') k = k + 1
				if (t.substring(i, j) == nombre && k < t.length && t.substring(k, k + 1) == '(') {
					val fin = finParentesis(t, k)
					res.add(partirComas(t.substring(k + 1, Math.max(k + 1, fin - 1))))
				}
				i = j
			} else {
				i = i + 1
			}
		}
		return res
	}

	// Cambia cada llamada por un valor del tipo que devuelve la funcion,
	// asi f de "a" no parece un texto si f devuelve un numero
	def String quitarLlamadas(String v, Programa p, List<Definicion> defs, Set<String> visitados) {
		val sb = new StringBuilder
		var i = 0
		while (i < v.length) {
			val c = v.substring(i, i + 1)
			if (c == '"' || c == "'") {
				val fin = finCadena(v, i)
				sb.append(v.substring(i, fin))
				i = fin
			} else if (Character.isLetter(v.charAt(i)) || c == '_') {
				var j = i
				while (j < v.length && (Character.isLetterOrDigit(v.charAt(j)) || v.charAt(j) == '_')) j = j + 1
				var k = j
				while (k < v.length && v.charAt(k) == ' ') k = k + 1
				if (k < v.length && v.substring(k, k + 1) == '(') {
					val nombre = v.substring(i, j)
					val f = defs.filter(Funcion).findFirst[it.nombre == nombre]
					val t = if (f === null || visitados.contains(nombre)) 'float64' else tipoRetorno(f, p, defs, visitados)
					sb.append(if (t == 'string') '""' else if (t == 'bool') 'verdadero' else '0')
					i = finParentesis(v, k)
				} else {
					sb.append(v.substring(i, j))
					i = j
				}
			} else {
				sb.append(c)
				i = i + 1
			}
		}
		return sb.toString
	}

	// Dice si el nombre es una variable, una funcion o un parametro del programa
	def boolean conocido(String n, Programa p, List<Definicion> defs) {
		defs.exists[nombre == n] || p.eAllContents.filter(Variable).exists[nombre == n]
	}

	// anumero da float64 y acadena string. Un leer sin conversion es float64 si la variable
	// se usa como numero o si otra asignacion le da un numero, si no hay pistas es string
	def String tipoLeer(Leer l, String clave, Programa p, List<Definicion> defs, Set<String> visitados) {
		if (l.conversion == Conversion.NUMERO) return 'float64'
		if (l.conversion == Conversion.TEXTO) return 'string'
		val otraNumerica = defs.filter(Asignacion).exists [
			nombre == l.nombre && valor !== null && clave(nombre, funcionDe(it)) == clave
				&& tipoValor(valor, funcionDe(it), p, defs, visitados) == 'float64'
		]
		if (otraNumerica || seUsaComoNumero(clave, p, defs, visitados)) return 'float64'
		return 'string'
	}

	// Busca pistas de que la variable es un numero, que vaya junto a + - * / %, que se use con ++, en un rango,
	// en un elegir con casos de numeros, que se pase a una funcion que la usa como numero
	// o que se compare con < > <= >= == != contra un numero o una variable numerica.
	// Solo cuentan los textos donde el nombre tiene esta misma clave
	def boolean seUsaComoNumero(String clave, Programa p, List<Definicion> defs, Set<String> visitados) {
		val nombre = nombreDe(clave)
		// i++ o usarla en un rango tambien dice que es numero
		if (p.eAllContents.filter(Incremento).exists[it.nombre == nombre && clave(it.nombre, funcionDe(it)) == clave]) return true
		if (p.eAllContents.filter(Para).exists[limites.exists[nombresEn(it).contains(nombre)] && clave(nombre, funcionDe(it)) == clave]) return true
		// Si se elige por ella y algun caso es un numero tambien es numero
		if (p.eAllContents.filter(Elegir).exists[expresion?.trim == nombre && clave(nombre, funcionDe(it)) == clave
			&& casos.exists[valores.exists[matches('[0-9].*')]]]) return true
		// Si se pasa sola a una funcion que usa ese parametro como numero tambien es numero
		for (f : defs.filter(Funcion)) {
			for (llamada : llamadasA(f, p)) {
				val i = llamada.value.indexOf(nombre)
				if (i >= 0 && i < f.parametros.size && clave(nombre, funcionDe(llamada.key)) == clave) {
					val parametro = f.nombre + '/' + f.parametros.get(i).nombre
					if (!visitados.contains(parametro)) {
						visitados.add(parametro)
						if (seUsaComoNumero(parametro, p, defs, visitados)) return true
					}
				}
			}
		}
		val n = '\\b' + nombre + '\\b'
		val otro = '(-? *[0-9]|[a-zA-Z_][a-zA-Z0-9_]*)'
		val cmp = ' *(<=|>=|==|!=|<|>) *'
		val comparaciones = #[Pattern.compile(n + cmp + otro), Pattern.compile('\\b' + otro + cmp + n)]
		for (o : p.eAllContents.toList) {
			val donde = funcionDe(o)
			if (clave(nombre, donde) == clave) {
				for (t : textosDe(o).filterNull.map[sinCadenas(it)]) {
					if (t.matches('.*' + n + ' *[-+*/%].*') || t.matches('.*[-+*/%] *' + n + '.*')) return true
					// Si va como indice de una lista tambien es numero
					if (t.matches('.*\\[[^\\]]*' + n + '[^\\]]*\\].*')) return true
					for (patron : comparaciones) {
						val m = patron.matcher(t)
						while (m.find) {
							val lado = if (m.group(1).matches('(<=|>=|==|!=|<|>)')) m.group(2) else m.group(1)
							if (lado.matches('-? *[0-9].*')) return true
							val k = clave(lado, donde)
							if (!visitados.contains(k) && conocido(lado, p, defs)
								&& tipoGo(k, p, defs, visitados) == 'float64') return true
						}
					}
				}
			}
		}
		return false
	}

	// Todas las expresiones del programa, valores, condiciones y mensajes
	def List<String> expresiones(Programa p) {
		p.eAllContents.toList.map[textosDe(it)].flatten.filterNull.toList
	}

	// Las expresiones que guarda cada elemento
	def List<String> textosDe(EObject o) {
		switch o {
			Asignacion: #[o.valor]
			Lista: o.elementos
			AsignacionIndice: #[o.indice, o.valor]
			Condicional: #[o.condicion]
			Osi: #[o.condicion]
			CicloCondicion: #[o.condicion]
			Para: o.limites
			Elegir: #[o.expresion]
			Caso: o.valores
			Retorno: #[o.valor]
			Llamada: o.argumentos
			Imprimir: #[o.mensaje]
			default: #[]
		}
	}

	// Tiene comparacion, && || ! o verdadero/cierto/falso?
	def boolean esLogico(String v) {
		val s = sinCadenas(v)
		s.matches('.*(==|!=|<|>|&&|\\|\\||!).*') || s.matches('.*\\b(verdadero|cierto|falso)\\b.*')
	}

	// Tiene comillas o ..?
	def boolean esCadena(String v) {
		v.contains('"') || v.contains("'") || sinCadenas(v).contains('..')
	}

	// Saca los nombres de variables que aparecen en una expresion
	def List<String> nombresEn(String v) {
		sinCadenas(v).split('[^a-zA-Z0-9_]+').filter [
			matches('[a-zA-Z_][a-zA-Z0-9_]*') && it != 'verdadero' && it != 'cierto' && it != 'falso'
		].toList
	}

	// Borra los textos entre comillas para no confundirlos con codigo
	def String sinCadenas(String v) {
		v.replaceAll('"[^"]*"', '').replaceAll("'[^']*'", '')
	}

	// ===== Expresiones =====

	// Pasa una expresion de Latino a Go.
	// a .. b se vuelve el texto de a mas el texto de b, asi 1 .. 2 da "12" y no "1 2".
	def String traducir(String texto) {
		if (texto === null) return ''
		val partes = partirConcat(texto)
		if (partes.size > 1) {
			return '(' + partes.map[comoTexto(traducirSimple(it))].join(' + ') + ')'
		}
		return traducirSimple(texto)
	}

	// Lo que se escribe o se une con .. siempre termina como texto
	def String textoGo(String texto) {
		if (texto !== null && partirConcat(texto).size > 1) return traducir(texto)
		return comoTexto(traducir(texto))
	}

	// Un texto entre comillas queda igual, lo demas pasa por aTexto,
	// que muestra numeros y logicos como Latino, 3.5, 1000000, verdadero
	def String comoTexto(String go) {
		if (go.matches('"([^"\\\\]|\\\\.)*"')) return go
		usaTexto = true
		return 'aTexto(' + go + ')'
	}

	// Corta "a .. b .. c" en [a, b, c] sin cortar dentro de comillas, parentesis ni corchetes
	def List<String> partirConcat(String t) {
		val partes = newArrayList
		var inicio = 0
		var nivel = 0
		var i = 0
		while (i < t.length) {
			val c = t.substring(i, i + 1)
			if (c == '"' || c == "'") {
				i = finCadena(t, i)
			} else if (c == '(' || c == '[') {
				nivel = nivel + 1
				i = i + 1
			} else if (c == ')' || c == ']') {
				nivel = nivel - 1
				i = i + 1
			} else if (nivel == 0 && t.startsWith('..', i)) {
				partes.add(t.substring(inicio, i).trim)
				i = i + 2
				inicio = i
			} else {
				i = i + 1
			}
		}
		partes.add(t.substring(inicio).trim)
		return partes
	}

	// Recorre la expresion letra por letra, cambia verdadero, cierto y falso por true y false,
	// 'texto' por "texto", 7 por 7.0 y vuelve a traducir lo que va entre parentesis o corchetes.
	// Los operadores && || ! == != < > + - * / se copian igual porque Go usa los mismos,
	// el % se cambia al final porque Go no lo acepta con float64.
	def String traducirSimple(String texto) {
		val sb = new StringBuilder
		var i = 0
		while (i < texto.length) {
			val c = texto.substring(i, i + 1)
			if (c == '"' || c == "'") {
				val fin = finCadena(texto, i)
				var cadena = texto.substring(i, fin)
				if (c == "'") {
					// Si el texto tenia comillas dobles dentro, se escapan para Go
					val contenido = cadena.substring(1, Math.max(1, cadena.length - 1))
					cadena = '"' + contenido.replace('"', '\\"') + '"'
				}
				sb.append(cadena)
				i = fin
			} else if (c == '(') {
				val fin = finParentesis(texto, i)
				val dentro = texto.substring(i + 1, Math.max(i + 1, fin - 1))
				if (partirConcat(dentro).size > 1) {
					// traducir ya pone los parentesis, no se ponen dos veces
					sb.append(traducir(dentro))
				} else {
					sb.append('(' + traducir(dentro) + ')')
				}
				i = fin
			} else if (Character.isLetter(texto.charAt(i)) || c == '_') {
				var j = i
				while (j < texto.length && (Character.isLetterOrDigit(texto.charAt(j)) || texto.substring(j, j + 1) == '_')) {
					j = j + 1
				}
				sb.append(palabraGo(texto.substring(i, j)))
				i = j
				// Si sigue un corchete es v[i], el indice se traduce aparte y pasa a int
				// Si sigue un parentesis es una llamada, cada valor se traduce aparte
				var k = j
				while (k < texto.length && texto.charAt(k) == ' ') k = k + 1
				if (k < texto.length && texto.substring(k, k + 1) == '[') {
					val fin = finParentesis(texto, k)
					sb.append('[' + indiceGo(texto.substring(k + 1, Math.max(k + 1, fin - 1))) + ']')
					i = fin
				} else if (k < texto.length && texto.substring(k, k + 1) == '(') {
					val fin = finParentesis(texto, k)
					sb.append('(' + partirComas(texto.substring(k + 1, Math.max(k + 1, fin - 1))).map[traducir(it)].join(', ') + ')')
					i = fin
				}
			} else if (Character.isDigit(texto.charAt(i))) {
				// Todo numero va con punto, asi 7 / 2 da 3.5 en Go igual que en Latino
				var j = i
				while (j < texto.length && Character.isDigit(texto.charAt(j))) j = j + 1
				if (j + 1 < texto.length && texto.substring(j, j + 1) == '.' &&Character.isDigit(texto.charAt(j + 1))) {
					j = j + 1
					while (j < texto.length && Character.isDigit(texto.charAt(j))) j = j + 1
					sb.append(texto.substring(i, j))
				} else {
					sb.append(texto.substring(i, j) + '.0')
				}
				i = j
			} else {
				// Evita que 5--3 o a<-1 formen -- o <- en Go, por eso mete un espacio
				if (c == '-' && (sb.toString.endsWith('-') || sb.toString.endsWith('<'))) {
					sb.append(' ')
				}
				sb.append(c)
				i = i + 1
			}
		}
		val go = sb.toString
		if (sinCadenas(go).contains('%')) return conModulo(go)
		return go
	}

	// Go no deja usar % con float64, asi que a % b pasa a math.Mod de a y b.
	// Corta la expresion en operandos y operadores sin entrar en comillas, parentesis ni corchetes
	// y junta cada cadena de * / % de izquierda a derecha, que es como lo calcula Latino.
	def String conModulo(String t) {
		val operandos = newArrayList
		val operadores = newArrayList
		var actual = new StringBuilder
		var i = 0
		while (i < t.length) {
			val c = t.substring(i, i + 1)
			val dos = if (i + 1 < t.length) t.substring(i, i + 2) else ''
			if (c == '"' || c == "'") {
				val fin = finCadena(t, i)
				actual.append(t.substring(i, fin))
				i = fin
			} else if (c == '(' || c == '[') {
				val fin = finParentesis(t, i)
				actual.append(t.substring(i, fin))
				i = fin
			} else if (#['==', '!=', '<=', '>=', '&&', '||'].contains(dos)) {
				operandos.add(actual.toString.trim)
				operadores.add(dos)
				actual = new StringBuilder
				i = i + 2
			} else if ('<>+-*/%'.contains(c) && !actual.toString.trim.empty) {
				operandos.add(actual.toString.trim)
				operadores.add(c)
				actual = new StringBuilder
				i = i + 1
			} else {
				// Un - o un ! sin nada antes es parte del operando, como en -3
				actual.append(c)
				i = i + 1
			}
		}
		operandos.add(actual.toString.trim)
		val sb = new StringBuilder
		var acumulado = operandos.head
		for (k : 0 ..< operadores.size) {
			val op = operadores.get(k)
			val siguiente = operandos.get(k + 1)
			if (op == '%') {
				usaModulo = true
				acumulado = 'math.Mod(' + acumulado + ', ' + siguiente + ')'
			} else if (op == '*' || op == '/') {
				acumulado = acumulado + ' ' + op + ' ' + siguiente
			} else {
				sb.append(acumulado + ' ' + op + ' ')
				acumulado = siguiente
			}
		}
		sb.append(acumulado)
		return sb.toString
	}

	// Corta los valores de una llamada por las comas que no estan dentro de comillas, parentesis ni corchetes
	def List<String> partirComas(String t) {
		val partes = newArrayList
		if (t.trim.empty) return partes
		var inicio = 0
		var nivel = 0
		var i = 0
		while (i < t.length) {
			val c = t.substring(i, i + 1)
			if (c == '"' || c == "'") {
				i = finCadena(t, i)
			} else {
				if (c == '(' || c == '[') nivel = nivel + 1
				if (c == ')' || c == ']') nivel = nivel - 1
				if (c == ',' && nivel == 0) {
					partes.add(t.substring(inicio, i).trim)
					inicio = i + 1
				}
				i = i + 1
			}
		}
		partes.add(t.substring(inicio).trim)
		return partes
	}

	// Devuelve la posicion que sigue al parentesis o corchete que cierra el que abre en inicio
	def int finParentesis(String t, int inicio) {
		var nivel = 0
		var j = inicio
		while (j < t.length) {
			val c = t.substring(j, j + 1)
			if (c == '"' || c == "'") {
				j = finCadena(t, j)
			} else {
				if (c == '(' || c == '[') nivel = nivel + 1
				if (c == ')' || c == ']') nivel = nivel - 1
				j = j + 1
				if (nivel == 0) return j
			}
		}
		return t.length
	}

	// Devuelve la posicion que sigue a la comilla que cierra la que abre en inicio
	def int finCadena(String t, int inicio) {
		val comilla = t.substring(inicio, inicio + 1)
		var j = inicio + 1
		while (j < t.length && t.substring(j, j + 1) != comilla) {
			if (t.substring(j, j + 1) == '\\') j = j + 2 else j = j + 1
		}
		return Math.min(j + 1, t.length)
	}

	// Go pide un int como indice, un numero solo queda igual y lo demas va dentro de int
	def String indiceGo(String indice) {
		if (indice.trim.matches('[0-9]+')) return indice.trim
		return 'int(' + traducir(indice) + ')'
	}

	// Palabras de Latino que en Go se escriben distinto
	def String palabraGo(String palabra) {
		switch palabra {
			case 'verdadero': 'true'
			case 'cierto': 'true'
			case 'falso': 'false'
			default: palabra
		}
	}
}
