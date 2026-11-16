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

var numero float64
var fila float64

func main() {
	fmt.Println("De que numero quieres la tabla")
	numero = leerNumero()
	if math.Mod(numero, 2.0) == 0.0 {
		fmt.Println((aTexto(numero) + " es par"))
	} else {
		fmt.Println((aTexto(numero) + " es impar"))
	}
	fila = 1.0
	for fila <= 10.0 {
		fmt.Println((aTexto(numero) + " x " + aTexto(fila) + " = " + aTexto(numero * fila)))
		fila++
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
