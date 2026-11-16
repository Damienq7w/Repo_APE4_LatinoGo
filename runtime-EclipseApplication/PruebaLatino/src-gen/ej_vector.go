package main

import (
	"fmt"
	"strconv"
)

var notas []float64
var total float64
var mayor float64
var menor float64
var suma float64
var i float64
var promedio float64

func main() {
	notas = []float64{7.0, 9.5, 4.0, 8.0, 10.0, 6.5}
	total = 6.0
	mayor = notas[0]
	menor = notas[0]
	suma = 0.0
	for i = 0.0; i < total; i++ {
		suma = suma + notas[int(i)]
		if notas[int(i)] > mayor {
			mayor = notas[int(i)]
		}
		if notas[int(i)] < menor {
			menor = notas[int(i)]
		}
	}
	promedio = suma / total
	fmt.Println(("Notas " + aTexto(notas)))
	fmt.Println(("Mayor " + aTexto(mayor)))
	fmt.Println(("Menor " + aTexto(menor)))
	fmt.Println(("Suma " + aTexto(suma)))
	fmt.Println(("Promedio " + aTexto(promedio)))
	if promedio >= 7.0 {
		fmt.Println("El curso aprueba")
	} else {
		fmt.Println("El curso no aprueba")
	}
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
