package com.rodriguez.manuel.laboratoriocalificado01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var numero1EditText: EditText
    private lateinit var numero2EditText: EditText
    private lateinit var numero3EditText: EditText
    private lateinit var calcularButton: Button
    private lateinit var resultadoTextView: TextView
    private lateinit var irAEjercicio02Button: Button
    private lateinit var irAEjercicio01Button: Button // <-- Declarar el botón para ir a Ejercicio01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1EditText = findViewById(R.id.numero1EditText)
        numero2EditText = findViewById(R.id.numero2EditText)
        numero3EditText = findViewById(R.id.numero3EditText)
        calcularButton = findViewById(R.id.calcularButton)
        resultadoTextView = findViewById(R.id.resultadoTextView)
        irAEjercicio02Button = findViewById(R.id.irAEjercicio02Button)
        irAEjercicio01Button = findViewById(R.id.irAEjercicio01Button) // <-- Inicializar el botón

        val ejercicio = Ejercicio01Kotlin()

        calcularButton.setOnClickListener {
            try {
                val num1 = numero1EditText.text.toString().toInt()
                val num2 = numero2EditText.text.toString().toInt()
                val num3 = numero3EditText.text.toString().toInt()

                val mayor = ejercicio.encontrarMayor(num1, num2, num3)

                resultadoTextView.text = "El número mayor es: $mayor"
            } catch (e: NumberFormatException) {
                resultadoTextView.text = "Error: Por favor, ingrese números válidos"
            }
        }

        irAEjercicio02Button.setOnClickListener {
            val intent = Intent(this, Ejercicio02Activity::class.java)
            startActivity(intent)
        }

        // Redirigir al Ejercicio01Activity
        irAEjercicio01Button.setOnClickListener {
            val intent = Intent(this@MainActivity, Ejercicio01Activity::class.java)
            startActivity(intent)
        }
    }
}
