package com.example.di_t1_seminario2_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun iniciarActividad (view : View){
        val intent = Intent(this, Actividad_tresenraya::class.java)
        startActivity(intent)
    }
}