package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var lector = bufio.NewReader(os.Stdin)

var n2 float64
var j float64
var m float64
var d float64
var cantidad float64
var doble float64
var opcion float64
var respuesta string
var numeros []float64

func triple(numeros float64) float64 {
	return numeros * 3.0
}

func main() {
	n2 = 0.0
	for ultimaVuelta := false; !ultimaVuelta; {
		ultimaVuelta = n2 >= 3.0
		n2 = n2 + 1.0
		if n2 == 2.0 {
			continue
		}
		fmt.Println(aTexto(n2))
	}
	for j = 0.0; j < 10.0; j += 1.0 {
		if j == 2.0 {
			continue
		}
		if j > 4.0 {
			break
		}
		fmt.Println(aTexto(j))
	}
	for m = 6.0; m > 0.0; m += -2.0 {
		fmt.Println(aTexto(m))
	}
	ciclo1: for d = 1.0; d < 9.0; d += 1.0 {
		switch d {
		case 1.0:
			fmt.Println("lunes")
		case 6.0, 7.0:
			fmt.Println("fin de semana")
			break ciclo1
		default:
			fmt.Println(("dia " + aTexto(d)))
		}
	}
	cantidad = leerNumero()
	doble = cantidad * 2.0
	fmt.Println(aTexto(doble))
	opcion = leerNumero()
	if opcion == 1.0 {
		fmt.Println("Elegiste la opcion uno")
	}
	respuesta = leerTexto()
	if respuesta != "no" {
		fmt.Println("Seguimos")
	}
	numeros = []float64{3.0, 40.0, 4.0}
	fmt.Println(aTexto(triple(5.0)))
	fmt.Println(aTexto(numeros))
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
