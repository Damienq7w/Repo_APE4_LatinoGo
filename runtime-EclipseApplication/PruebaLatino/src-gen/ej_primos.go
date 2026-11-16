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

var limite float64
var cantidad float64
var i float64

func esPrimo(num float64) bool {
	var divisor float64
	_ = divisor
	if num < 2.0 {
		return false
	}
	divisor = 2.0
	for divisor * divisor <= num {
		if math.Mod(num, divisor) == 0.0 {
			return false
		}
		divisor = divisor + 1.0
	}
	return true
}

func main() {
	fmt.Println("Hasta que numero busco primos")
	limite = leerNumero()
	cantidad = 0.0
	for i = 2.0; i <= limite; i++ {
		if esPrimo(i) {
			fmt.Println(aTexto(i))
			cantidad++
		}
	}
	fmt.Println(("Hay " + aTexto(cantidad) + " primos"))
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
