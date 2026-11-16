package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var lector = bufio.NewReader(os.Stdin)

var terminos float64
var anterior float64
var actual float64
var siguiente float64
var i float64

func main() {
	fmt.Println("Cuantos terminos quieres")
	terminos = leerNumero()
	anterior = 0.0
	actual = 1.0
	for i = 0.0; i < terminos; i++ {
		fmt.Println(aTexto(anterior))
		siguiente = anterior + actual
		anterior = actual
		actual = siguiente
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
