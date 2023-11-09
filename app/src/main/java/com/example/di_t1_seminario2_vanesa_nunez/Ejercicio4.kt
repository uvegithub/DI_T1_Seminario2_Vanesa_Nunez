package com.example.di_t1_seminario2_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ejercicio4 : AppCompatActivity() {

    lateinit var espa : Button
    lateinit var fran : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        espa = findViewById<Button>(R.id.botonespana)
        fran = findViewById<Button>(R.id.botonfrancia)

        var intento = Intent(this, Ejercicio4Resultado::class.java)

        espa.setOnClickListener {
            intento.putExtra("Espana",Pais("ESPANA", 4000000, "es"))
            startActivity(intento)
        }

        fran.setOnClickListener {
            intento.putExtra("Francia",Pais("FRANCIA", 5000000, "fr"))
            startActivity(intento)
        }
    }
}