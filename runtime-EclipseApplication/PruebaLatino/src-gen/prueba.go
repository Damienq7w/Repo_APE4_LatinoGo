package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
	"strings"
)

var lector = bufio.NewReader(os.Stdin)

var estudiante string
var nota1 float64
var nota2 float64
var minimo float64
var asistencia float64
var becado bool
var promedio float64
var letra string
var mensajeNota string
var a float64
var b float64
var x float64
var c float64
var y float64
var nombre string
var activo bool
var nombreLeido string
var edad float64
var ciudad string
var limite float64
var cantidad float64
var doble float64
var grande float64
var resto float64
var opcion float64
var respuesta string
var numeros []float64
var primero float64
var pos float64
var nombres []string
var vacia []float64
var suma float64
var i float64
var contador float64
var k float64
var r float64
var total2 float64

func sumar(s1 float64, s2 float64) float64 {
	return s1 + s2
}

func saludar(quien string) {
	fmt.Println(("Hola " + aTexto(quien)))
}

func factorial(n float64) float64 {
	if n <= 1.0 {
		return 1.0
	}
	return n * factorial(n - 1.0)
}

func mayor(p float64, q float64) float64 {
	if p > q {
		return p
	} else {
		return q
	}
}

func dobleDe(n float64) float64 {
	return n * 2.0
}

func saluda(n string) {
	fmt.Println(("Hola " + aTexto(n)))
}

func main() {
	estudiante = "Ana"
	nota1 = 8.5
	nota2 = 6.0
	minimo = 7.0
	asistencia = 90.0
	becado = true
	promedio = (nota1 + nota2) / 2.0
	fmt.Println(("Estudiante: " + aTexto(estudiante)))
	fmt.Println(("Promedio: " + aTexto(promedio)))
	if nota1 >= minimo && nota2 >= minimo {
		fmt.Println("Aprobo ambas notas")
	} else {
		fmt.Println("Reprobo al menos una nota")
		if promedio >= minimo {
			fmt.Println("Pero el promedio le alcanza")
		} else {
			fmt.Println("Y el promedio no le alcanza")
		}
	}
	if (asistencia >= 80.0 && becado == true) || nota1 > 9.0 {
		fmt.Println("Mantiene la beca")
		asistencia = asistencia + 1.0
	} else {
		fmt.Println("Pierde la beca")
	}
	if !becado {
		fmt.Println("Debe pagar matricula")
	}
	if asistencia >= 95.0 {
		fmt.Println("Asistencia excelente")
	} else if asistencia >= 80.0 {
		fmt.Println("Asistencia suficiente")
	} else {
		fmt.Println("Asistencia baja")
	}
	if promedio >= 9.0 {
		letra = "A"
	} else if promedio >= 8.0 {
		letra = "B"
	} else if promedio >= 7.0 {
		letra = "C"
	} else {
		letra = "D"
	}
	fmt.Println(("Calificacion: " + aTexto(letra)))
	if nota1 > 9.0 {
		fmt.Println("Nota 1 sobresaliente")
	} else if nota1 > 8.0 {
		mensajeNota = "Nota 1 muy buena"
		fmt.Println(aTexto(mensajeNota))
	}
	if becado {
		if promedio >= 9.0 {
			fmt.Println("Beca completa")
		} else if promedio >= 7.0 {
			fmt.Println("Media beca")
		} else {
			fmt.Println("Beca en revision")
		}
	} else if asistencia >= 80.0 {
		fmt.Println("Puede pedir beca")
	}
	a = 10.0
	b = 4.0
	fmt.Println(("Total " + aTexto((a - b))))
	x = -5.0
	c = a - -3.0
	fmt.Println("El texto a - b no se calcula")
	x = 5.0
	y = 7.0
	x = y
	nombre = "Ana"
	if nombre == "Ana" {
		fmt.Println("Hola Ana")
	}
	activo = true
	if activo == true {
		fmt.Println("Esta activo")
	}
	if becado {
		fmt.Println("Tiene beca")
	}
	if !becado {
		fmt.Println("No tiene beca")
	}
	nombreLeido = leerTexto()
	edad = leerNumero()
	ciudad = leerTexto()
	limite = 18.0
	if edad >= limite {
		fmt.Println((aTexto(nombreLeido) + " es mayor de edad y vive en " + aTexto(ciudad)))
	}
	cantidad = leerNumero()
	doble = cantidad * 2.0
	fmt.Println(aTexto(doble))
	grande = 1000000.0
	fmt.Println(aTexto(grande))
	fmt.Println(aTexto(7.0 / 2.0))
	resto = math.Mod(10.0, 3.0)
	fmt.Println(("Resto " + aTexto(resto)))
	opcion = leerNumero()
	if opcion == 1.0 {
		fmt.Println("Elegiste la opcion uno")
	}
	respuesta = leerTexto()
	if respuesta != "no" {
		fmt.Println("Seguimos")
	}
	numeros = []float64{3.0, 1.0, 4.0}
	numeros[1] = 5.0
	fmt.Println(aTexto(numeros))
	primero = numeros[0]
	fmt.Println(("Primero " + aTexto(primero)))
	fmt.Println(aTexto(numeros[int(0.0 + 2.0)] * 2.0))
	pos = 2.0
	numeros[int(pos - 1.0)] = numeros[int(pos)] * 10.0
	fmt.Println(aTexto(numeros))
	nombres = []string{"Ana", "Luis"}
	nombres[0] = "Eva"
	fmt.Println((aTexto(nombres[1]) + " y " + aTexto(nombres[0])))
	fmt.Println(aTexto(nombres))
	vacia = []float64{}
	suma = 0.0
	for i = 0.0; i < 3.0; i++ {
		suma = suma + numeros[int(i)]
	}
	fmt.Println(("Suma " + aTexto(suma)))
	contador = 3.0
	for contador > 0.0 {
		fmt.Println(("Faltan " + aTexto(contador)))
		contador = contador - 1.0
	}
	k = 0.0
	for ultimaVuelta := false; !ultimaVuelta; {
		ultimaVuelta = k >= 6.0
		k = k + 2.0
	}
	fmt.Println(("k vale " + aTexto(k)))
	i = 0.0
	for ultimaVuelta := false; !ultimaVuelta; {
		ultimaVuelta = i >= 3.0
		fmt.Println(("vuelta " + aTexto(i)))
		i = i + 1.0
	}
	fmt.Println(("fin " + aTexto(i)))
	for r = 3.0; r > 0.0; r-- {
		fmt.Println(aTexto(r))
	}
	switch ciudad {
	case "Ambato":
		fmt.Println("Sierra centro")
	case "Quito", "Cuenca":
		fmt.Println("Sierra")
	default:
		fmt.Println("Otra ciudad")
	}
	total2 = sumar(2.0, 3.0)
	fmt.Println(("Suma " + aTexto(sumar(total2, 1.0))))
	sumar(1.0, 1.0)
	saludar("Luis")
	saludar(nombreLeido)
	fmt.Println(aTexto(factorial(5.0)))
	fmt.Println(aTexto(mayor(numeros[0], numeros[2]) * 2.0))
	fmt.Println(("El mayor es " + aTexto(mayor(7.0, 4.0))))
	fmt.Println(aTexto(dobleDe(4.0)))
	saluda("Ana")
}

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

func aTexto(v any) string {
	switch x := v.(type) {
	case float64:
		return strconv.FormatFloat(x, 'g', 16, 64)
	case bool:
		if x {
			return "verdadero"
		}
		return "falso"
	case []float64:
		s := "["
		for i, e := range x {
			if i > 0 {
				s += ", "
			}
			s += aTexto(e)
		}
		return s + "]"
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
	}
	return fmt.Sprint(v)
}
