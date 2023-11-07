package com.example.di_t1_seminario2_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Ejercicio2Resultado : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_resultado)

        var numDeLaOtraActividad = intent.getStringExtra("numero")
        var textoDeLaOtraActividad = intent.getStringExtra("texto")


    }

}