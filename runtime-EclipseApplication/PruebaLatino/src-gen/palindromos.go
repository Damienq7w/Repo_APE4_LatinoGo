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

func invertir(n float64) float64 {
	var invertido float64
	_ = invertido
	var digito float64
	_ = digito
	invertido = 0.0
	for n > 0.0 {
		digito = math.Mod(n, 10.0)
		invertido = invertido * 10.0 + digito
		n = (n - digito) / 10.0
	}
	return invertido
}

func esPalindromo(n float64) bool {
	return invertir(n) == n
}

func main() {
	fmt.Println("Hasta que numero busco palindromos")
	limite = leerNumero()
	cantidad = 0.0
	for i = 1.0; i <= limite; i++ {
		if esPalindromo(i) {
			fmt.Println(aTexto(i))
			cantidad++
		}
	}
	fmt.Println(("Entre 1 y " + aTexto(limite) + " hay " + aTexto(cantidad) + " palindromos"))
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
