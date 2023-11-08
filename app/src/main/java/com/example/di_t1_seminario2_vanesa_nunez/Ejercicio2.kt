package com.example.di_t1_seminario2_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Ejercicio2 : AppCompatActivity() {

    lateinit var editonume : EditText
    lateinit var editotexto : EditText
    lateinit var boton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        editonume = findViewById<EditText>(R.id.edittextnum)
        editotexto = findViewById<EditText>(R.id.edittext)
        boton = findViewById<Button>(R.id.botonpasardatos)



        boton.setOnClickListener {

            var intent = Intent(this, Ejercicio2Resultado::class.java)


            var numqueingreso = editonume.text.toString()
            Log.v("numeroAntes", numqueingreso)

            intent.putExtra("numero", numqueingreso.toInt())


            val textoqueingreso=editotexto.text.toString()
            intent.putExtra("texto", textoqueingreso  )


            startActivity(intent)
        }

    }


}