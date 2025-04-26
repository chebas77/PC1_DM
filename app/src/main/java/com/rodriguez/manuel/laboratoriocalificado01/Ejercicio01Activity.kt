package com.rodriguez.manuel.laboratoriocalificado01

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var nombreEditText: EditText
    private lateinit var apellidoEditText: EditText
    private lateinit var correoEditText: EditText
    private lateinit var nombreTextView: TextView
    private lateinit var apellidoTextView: TextView
    private lateinit var correoTextView: TextView
    private lateinit var registrarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        // Conectar variables con el XML
        nombreEditText = findViewById(R.id.nombreEditText)
        apellidoEditText = findViewById(R.id.apellidoEditText)
        correoEditText = findViewById(R.id.correoEditText)
        nombreTextView = findViewById(R.id.nombreTextView)
        apellidoTextView = findViewById(R.id.apellidoTextView)
        correoTextView = findViewById(R.id.correoTextView)
        registrarButton = findViewById(R.id.registrarButton)

        // Añadir TextWatchers a los EditTexts
        nombreEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                nombreTextView.text = "Nombre: ${s.toString()}"
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        apellidoEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                apellidoTextView.text = "Apellido: ${s.toString()}"
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        correoEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                correoTextView.text = "Correo: ${s.toString()}"
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Acción del botón Registrar
        registrarButton.setOnClickListener {
            val nombre = nombreEditText.text.toString().trim()
            val apellido = apellidoEditText.text.toString().trim()
            val correo = correoEditText.text.toString().trim()

            if (nombre.isNotEmpty() && apellido.isNotEmpty() && correo.isNotEmpty()) {
                Toast.makeText(this, "Registrado: $nombre $apellido\nCorreo: $correo", Toast.LENGTH_LONG).show()

                // Limpiar los campos después de registrar
                nombreEditText.text.clear()
                apellidoEditText.text.clear()
                correoEditText.text.clear()
            } else {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}