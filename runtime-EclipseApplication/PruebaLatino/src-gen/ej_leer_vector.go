package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var lector = bufio.NewReader(os.Stdin)

var datos []float64
var total float64
var dato float64
var i float64
var mayor float64
var suma float64

func main() {
	datos = []float64{0.0, 0.0, 0.0, 0.0, 0.0}
	total = 5.0
	for i = 0.0; i < total; i++ {
		fmt.Println(("Numero " + aTexto((i + 1.0))))
		dato = leerNumero()
		datos[int(i)] = dato
	}
	mayor = datos[0]
	suma = 0.0
	for i = 0.0; i < total; i++ {
		suma = suma + datos[int(i)]
		if datos[int(i)] > mayor {
			mayor = datos[int(i)]
		}
	}
	fmt.Println(("Vector " + aTexto(datos)))
	fmt.Println(("Mayor " + aTexto(mayor)))
	fmt.Println(("Promedio " + aTexto((suma / total))))
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
	}
	return fmt.Sprint(v)
}
