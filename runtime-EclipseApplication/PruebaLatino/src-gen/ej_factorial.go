package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var lector = bufio.NewReader(os.Stdin)

var numero float64

func factorialCiclo(num float64) float64 {
	var resultado float64
	_ = resultado
	var k float64
	_ = k
	resultado = 1.0
	for k = 2.0; k <= num; k++ {
		resultado = resultado * k
	}
	return resultado
}

func factorialRecursivo(num float64) float64 {
	if num <= 1.0 {
		return 1.0
	}
	return num * factorialRecursivo(num - 1.0)
}

func main() {
	fmt.Println("De que numero quieres el factorial")
	numero = leerNumero()
	if numero < 0.0 {
		fmt.Println("No hay factorial de un numero negativo")
	} else {
		fmt.Println(("Con ciclo " + aTexto(factorialCiclo(numero))))
		fmt.Println(("Con recursion " + aTexto(factorialRecursivo(numero))))
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
