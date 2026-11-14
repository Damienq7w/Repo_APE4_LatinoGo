# APE4 LatinoGo: traductor de Latino a Go

Proyecto de la guía **APE MDS 4. Ingeniería dirigida por modelos - Desarrollo metamodelo** de la asignatura Modelamiento y Diseño de Software (Universidad Técnica de Ambato, Tercero B).

Traductor del lenguaje de programación **Latino** (sintaxis en español, tipado dinámico, archivos `.lat`) al lenguaje **Go**, construido con ingeniería dirigida por modelos:

```
Metamodelo Ecore  →  Restricciones OCL  →  Sintaxis Xtext  →  Transformación Xtend  →  Programa Go
```

## Integrantes

- Cunalata Mendoza Damian Alexander
- Lucero Urresta Karol Sulamith
- Silva Camuendo Luis Alexander
- Tacuri Santillan Monica Sara

Docente: Ing. Leonardo Torres, Mg.

## Estructura del repositorio

| Carpeta | Contenido |
|---|---|
| `APE4/LatinoGo` | Metamodelo `model/latino.ecore` con las restricciones OCL, `latino.genmodel` y el diagrama `latino.aird` |
| `APE4/LatinoGo.edit`, `APE4/LatinoGo.editor` | Código generado por EMF para el editor del modelo |
| `APE4/uta.latino` | Gramática `Latino.xtext`, flujo `GenerateLatino.mwe2` y generador `LatinoGenerator.xtend` |
| `APE4/uta.latino.ide`, `.ui`, `.tests`, `.ui.tests` | Infraestructura de Xtext: editor con colores y errores |
| `runtime-EclipseApplication/PruebaLatino` | Programas de prueba `prueba.lat` y `errores.lat`, y el Go generado `src-gen/prueba.go` |
| `Informe` | Informe de la guía práctica |

## Sentencias de Latino que se traducen

| Latino | Go |
|---|---|
| `edad = 20` | `edad = 20.0` (todas las variables se declaran con su tipo deducido) |
| `escribir("Hola " .. nombre)` | `fmt.Println(...)` |
| `edad = leer()`, `anumero(leer())`, `acadena(leer())` | lectura de teclado con `bufio` |
| `si ... osi ... sino ... fin` | `if ... else if ... else` |
| `numeros = [3, 1, 4]`, `numeros[0]`, `numeros[1] = 5` | `[]float64{...}`, `numeros[int(i)]` |
| `mientras cond ... fin` | `for cond { }` |
| `desde (i = 0; i < 10; i++) ... fin` | `for i = 0.0; i < 10.0; i++ { }` |
| `repetir ... hasta cond` | `for` que ejecuta el cuerpo al menos una vez |
| `para i en rango(10) ... fin` | `for i = 0.0; i < 10.0; i += 1.0 { }` |
| `romper`, `continuar` | `break`, `continue` (con etiqueta si están dentro de un `elegir`) |
| `elegir x caso 1: ... otro: ... fin` | `switch x { case 1.0: ... default: ... }` |
| `funcion sumar(a, b) retorno a + b fin` | `func sumar(a float64, b float64) float64 { ... }` |

## Validaciones OCL

El metamodelo tiene 47 restricciones OCL que muestran errores en español dentro del editor, por ejemplo:

- usar una variable que no existe;
- mezclar textos o lógicos con `+ - * / %`;
- condiciones que no son verdaderas o falsas (`si 5`);
- una variable que cambia de tipo;
- `romper` fuera de un ciclo;
- llamar a una función que no existe o con menos valores de los que pide;
- usar como nombre una palabra reservada de Latino o de Go.

Un programa con errores no genera código Go.

## Requisitos

- **Eclipse Modeling Tools** con Xtext 2.44 instalado.
- **Go 1.27** o superior, para ejecutar el programa generado.

## Cómo probarlo

1. Clonar el repositorio.
2. En Eclipse Modeling Tools ir a **File → Import → General → Existing Projects into Workspace**, elegir la carpeta `APE4` y marcar los 8 proyectos.
3. Clic derecho en `APE4/LatinoGo/model/latino.genmodel` → **Generate All**.
4. Clic derecho en `uta.latino/src/uta/latino/GenerateLatino.mwe2` → **Run As → MWE2 Workflow**.
5. Clic derecho en `uta.latino` → **Run As → Eclipse Application**. Se abre una segunda instancia de Eclipse.
6. En la segunda instancia, importar `runtime-EclipseApplication/PruebaLatino` y abrir:
   - `prueba.lat`: 0 errores; al guardar se genera `src-gen/prueba.go`;
   - `errores.lat`: 52 errores, uno por cada caso inválido.
7. Ejecutar el programa generado:

```bash
cd runtime-EclipseApplication/PruebaLatino/src-gen
go run prueba.go
```

Entradas de ejemplo, una por línea: `Ana`, `20`, `Ambato`, `5`, `1`, `si`.

## Ejemplo

```
funcion factorial(n)
    si n <= 1
        retorno 1
    fin
    retorno n * factorial(n - 1)
fin

numeros = [3, 1, 4]
suma = 0
desde (i = 0; i < 3; i++)
    suma = suma + numeros[i]
fin
escribir("Suma " .. suma)
escribir(factorial(5))
```

## Limitaciones conocidas

- Las expresiones se guardan como texto en el modelo y se validan con OCL.
- Una variable global tiene un solo tipo en todo el programa.
- No se implementan `+=`, la longitud de listas (en Latino es de librería), clases ni diccionarios.
- La prioridad de `..`, `&&` y `||` no es igual a la de Latino; se recomienda usar paréntesis.
