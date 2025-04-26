package com.rodriguez.manuel.laboratoriocalificado01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio02Activity : AppCompatActivity() {

    private lateinit var palabraEditText: EditText
    private lateinit var verificarButton: Button
    private lateinit var resultadoPalindromoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio02)

        // Inicializar vistas
        palabraEditText = findViewById(R.id.editTextPalabra)
        verificarButton = findViewById(R.id.btnVerificar)
        resultadoPalindromoTextView = findViewById(R.id.textViewResultado)

        // Crear instancia de Ejercicio02Kotlin
        val ejercicio02 = Ejercicio02Kotlin()

        // Configurar el botón para verificar si la palabra es un palíndromo
        verificarButton.setOnClickListener {
            val palabra = palabraEditText.text.toString()

            if (palabra.isNotEmpty()) {
                val esPalindromo = ejercicio02.esPalindromo(palabra)
                resultadoPalindromoTextView.text = if (esPalindromo) {
                    "¡La palabra '$palabra' es un palíndromo!"
                } else {
                    "La palabra '$palabra' no es un palíndromo."
                }
            } else {
                resultadoPalindromoTextView.text = "Por favor ingrese una palabra."
            }
        }
    }
}