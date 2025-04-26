package com.rodriguez.manuel.laboratoriocalificado01

// Definimos la clase 'Ejercicio02Kotlin'
class Ejercicio02Kotlin {

    // Función para verificar si una palabra es un palíndromo
    fun esPalindromo(palabra: String): Boolean {
        // Convertimos la palabra a minúsculas para que la comparación sea insensible a mayúsculas
        val palabraLower = palabra.replace(" ", "").toLowerCase()

        // Comparamos la palabra con su versión invertida
        return palabraLower == palabraLower.reversed()
    }
}

fun main() {
    // Creamos una instancia de la clase Ejercicio02Kotlin
    val ejercicio = Ejercicio02Kotlin()

    // Probamos con diferentes palabras y mostramos el resultado
    println("¿'Racecar' es palíndromo? ${ejercicio.esPalindromo("Racecar")}")  // true
    println("¿'Kotlin' es palíndromo? ${ejercicio.esPalindromo("Kotlin")}")    // false
    println("¿'A man a plan a canal Panama' es palíndromo? ${ejercicio.esPalindromo("A man a plan a canal Panama")}") // true
}
