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

var a float64
var b float64
var opcion float64

func mcd(x float64, y float64) float64 {
	var resto float64
	_ = resto
	for y != 0.0 {
		resto = math.Mod(x, y)
		x = y
		y = resto
	}
	return x
}

func main() {
	fmt.Println("Primer numero")
	a = leerNumero()
	fmt.Println("Segundo numero")
	b = leerNumero()
	fmt.Println("1 sumar, 2 restar, 3 multiplicar, 4 dividir, 5 mcd")
	opcion = leerNumero()
	switch opcion {
	case 1.0:
		fmt.Println(("Suma " + aTexto(a + b)))
	case 2.0:
		fmt.Println(("Resta " + aTexto(a - b)))
	case 3.0:
		fmt.Println(("Producto " + aTexto(a * b)))
	case 4.0:
		if b == 0.0 {
			fmt.Println("No se puede dividir para cero")
		} else {
			fmt.Println(("Division " + aTexto(a / b)))
		}
	case 5.0:
		fmt.Println(("MCD " + aTexto(mcd(a, b))))
	default:
		fmt.Println("Opcion no valida")
	}
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
	}
	return fmt.Sprint(v)
}
