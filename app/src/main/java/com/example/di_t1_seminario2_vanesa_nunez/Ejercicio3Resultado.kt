package com.example.di_t1_seminario2_vanesa_nunez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Ejercicio3Resultado : AppCompatActivity() {

    lateinit var editonom2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3_resultado)

        var nombres = intent.getStringArrayListExtra("cadena1")

        editonom2 = findViewById(R.id.edittextnombres)

        editonom2.setText(nombres.toString())
    }
}