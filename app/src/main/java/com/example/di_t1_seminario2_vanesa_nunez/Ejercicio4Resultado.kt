package com.example.di_t1_seminario2_vanesa_nunez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Ejercicio4Resultado : AppCompatActivity() {

    lateinit var contenido : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4_resultado)

        var paises = intent.getParcelableExtra<Pais>("Espana")
        var paises2 = intent.getParcelableExtra<Pais>("Francia")

        contenido = findViewById(R.id.textillo)


        var t1 = paises.toString()
        var t2 =  paises2.toString()
        Log.v("pais1", t1)
        Log.v("pais2", t2)



        contenido.setText("Pais 1: " + t2 + " "+ " Pais 2: "+t1)


    }
}