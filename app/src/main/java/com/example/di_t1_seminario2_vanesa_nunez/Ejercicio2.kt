package com.example.di_t1_seminario2_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Ejercicio2 : AppCompatActivity() {

    lateinit var editonume : EditText
    lateinit var editotexto : EditText
    lateinit var boton : Button

    lateinit var intent: Intent



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        editonume = findViewById<EditText>(R.id.edittextnum)
        editotexto = findViewById<EditText>(R.id.edittext)


        intent = Intent(this, Ejercicio2Resultado::class.java)


        val numqueingreso=editonume.text.toString()
        intent.putExtra("numero", 8 )

        val textoqueingreso=editotexto.text.toString()
        intent.putExtra("texto", "vanesa" )


        boton = findViewById<Button>(R.id.botonpasardatos)

        boton.setOnClickListener {
            startActivity(intent)
        }

    }


}