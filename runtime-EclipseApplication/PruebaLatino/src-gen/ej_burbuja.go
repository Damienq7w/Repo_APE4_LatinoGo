package main

import (
	"fmt"
	"strconv"
)

var numeros []float64
var total float64
var auxiliar float64
var j float64
var pasada float64

func main() {
	numeros = []float64{5.0, 2.0, 9.0, 1.0, 7.0, 3.0}
	total = 6.0
	fmt.Println(("Antes " + aTexto(numeros)))
	for pasada = 0.0; pasada < total - 1.0; pasada++ {
		for j = 0.0; j < total - 1.0 - pasada; j++ {
			if numeros[int(j)] > numeros[int(j + 1.0)] {
				auxiliar = numeros[int(j)]
				numeros[int(j)] = numeros[int(j + 1.0)]
				numeros[int(j + 1.0)] = auxiliar
			}
		}
	}
	fmt.Println(("Despues " + aTexto(numeros)))
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
