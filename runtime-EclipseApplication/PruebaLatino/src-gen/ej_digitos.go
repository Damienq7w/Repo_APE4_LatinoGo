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

func sumaDigitos(num float64) float64 {
	var acumulado float64
	_ = acumulado
	var digito float64
	_ = digito
	acumulado = 0.0
	for num > 0.0 {
		digito = math.Mod(num, 10.0)
		acumulado = acumulado + digito
		num = (num - digito) / 10.0
	}
	return acumulado
}

func cuentaDigitos(num float64) float64 {
	var contador float64
	_ = contador
	contador = 1.0
	for num >= 10.0 {
		contador = contador + 1.0
		num = (num - math.Mod(num, 10.0)) / 10.0
	}
	return contador
}

func esPerfecto(num float64) bool {
	var sumaDivisores float64
	_ = sumaDivisores
	var d float64
	_ = d
	sumaDivisores = 0.0
	for d = 1.0; d < num; d++ {
		if math.Mod(num, d) == 0.0 {
			sumaDivisores = sumaDivisores + d
		}
	}
	return sumaDivisores == num && num > 0.0
}

func main() {
	fmt.Println("Escribe un numero entero positivo")
	numero = leerNumero()
	fmt.Println(("Tiene " + aTexto(cuentaDigitos(numero)) + " digitos"))
	fmt.Println(("Sus digitos suman " + aTexto(sumaDigitos(numero))))
	if esPerfecto(numero) {
		fmt.Println((aTexto(numero) + " es perfecto"))
	} else {
		fmt.Println((aTexto(numero) + " no es perfecto"))
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
