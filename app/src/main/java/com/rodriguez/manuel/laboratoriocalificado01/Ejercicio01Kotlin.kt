package com.rodriguez.manuel.laboratoriocalificado01

class Ejercicio01Kotlin {

    // Función principal que determinará el número mayor de tres números
    fun encontrarMayor(numero1: Int, numero2: Int, numero3: Int): Int {
        // Inicializamos una variable 'mayor' con el valor de 'numero1'
        var mayor = numero1

        // Comparamos si 'numero2' es mayor que 'mayor' actual
        if (numero2 > mayor) {
            mayor = numero2  // Si es mayor, actualizamos 'mayor' a 'numero2'
        }

        // Comparamos si 'numero3' es mayor que el 'mayor' actual
        if (numero3 > mayor) {
            mayor = numero3  // Si es mayor, actualizamos 'mayor' a 'numero3'
        }

        // Devolvemos el número más grande de los tres
        return mayor
    }
}
fun main() {
    // Creamos una instancia de la clase Ejercicio01Kotlin
    val ejercicio = Ejercicio01Kotlin()

    // Llamamos a la función encontrarMayor con los valores 5, 12, 3
    println(ejercicio.encontrarMayor(5, 12, 3))  // Debería imprimir 12

    // Llamamos a la función encontrarMayor con los valores 9, 4, 9
    println(ejercicio.encontrarMayor(9, 4, 9))   // Debería imprimir 9
}