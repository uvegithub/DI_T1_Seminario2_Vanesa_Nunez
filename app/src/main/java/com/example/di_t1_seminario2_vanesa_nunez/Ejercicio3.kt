package com.example.di_t1_seminario2_vanesa_nunez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class Ejercicio3 : AppCompatActivity() {

    lateinit var editonom : EditText
    lateinit var botoninser : Button
    lateinit var botonpasar : Button
    private lateinit var lista : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        lista = arrayListOf()

        editonom = findViewById<EditText>(R.id.edittextnom)
        botoninser = findViewById<Button>(R.id.botoninsertardato)
        botonpasar = findViewById<Button>(R.id.botonpasardato)

        var intento = Intent(this, Ejercicio3Resultado::class.java)

        botoninser.setOnClickListener {
                lista.add(editonom.text.toString())

        }

        botonpasar.setOnClickListener {
            intento.putExtra("cadena1", lista )
            startActivity(intento)
        }
    }
}