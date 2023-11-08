package com.example.di_t1_seminario2_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

class Ejercicio2Resultado : AppCompatActivity() {

    lateinit var editonume2 : EditText
    lateinit var editotexto2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_resultado)

        var numDeLaOtraActividad = intent.getIntExtra("numero",0)
        var textoDeLaOtraActividad = intent.getStringExtra("texto")

        Log.v("numero",numDeLaOtraActividad.toString())

//        intent.getStringArrayListExtra()

        editonume2 = findViewById(R.id.edittextnum2)
        editotexto2 = findViewById(R.id.edittext2)



        editonume2.setText(numDeLaOtraActividad.toString())
        editotexto2.setText(textoDeLaOtraActividad.toString())
    }

}