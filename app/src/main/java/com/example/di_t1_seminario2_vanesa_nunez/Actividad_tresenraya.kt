package com.example.di_t1_seminario2_vanesa_nunez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Actividad_tresenraya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_tresenraya)

        val botton1 = findViewById<Button>(R.id.button1)
        var boton1: Boolean = false
        var turno_ma: Boolean = false
        val botton2 = findViewById<Button>(R.id.button2)
        var boton2: Boolean = false
        val botton3 = findViewById<Button>(R.id.button3)
        var boton3: Boolean = false
        val botton4 = findViewById<Button>(R.id.button4)
        var boton4: Boolean = false
        val botton5 = findViewById<Button>(R.id.button5)
        var boton5: Boolean = false
        val botton6 = findViewById<Button>(R.id.button6)
        var boton6: Boolean = false
        val botton7 = findViewById<Button>(R.id.button7)
        var boton7: Boolean = false
        val botton8 = findViewById<Button>(R.id.button8)
        var boton8: Boolean = false
        val botton9 = findViewById<Button>(R.id.button9)
        var boton9: Boolean = false

        fun turno_maquina(boolean: Boolean) {
            if (boton1 == false) {
                botton1.text = "O"
            } else if (boton2 == false) {
                botton2.text = "O"
            } else if (boton3 == false) {
                botton3.text = "O"
            } else if (boton4 == false) {
                botton4.text = "O"
            } else if (boton5 == false) {
                botton5.text = "O"
            } else if (boton6 == false) {
                botton6.text = "O"
            } else if (boton7 == false) {
                botton7.text = "O"
            } else if (boton8 == false) {
                botton8.text = "O"
            } else if (boton9 == false) {
                botton9.text = "O"
            }
        }

            if (botton1.text == "") {
                botton1.setOnClickListener {
                    botton1.text = "X"
                    boton1 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton2.text == "") {
                botton2.setOnClickListener {
                    botton2.text = "X"
                    boton2 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton3.text == "") {
                botton3.setOnClickListener {
                    botton3.text = "X"
                    boton3 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton4.text == "") {
                botton4.setOnClickListener {
                    botton4.text = "X"
                    boton4 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton5.text == "") {
                botton5.setOnClickListener {
                    botton5.text = "X"
                    boton5 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton6.text == "") {
                botton6.setOnClickListener {
                    botton6.text = "X"
                    boton6 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton7.text == "") {
                botton7.setOnClickListener {
                    botton7.text = "X"
                    boton7 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton8.text == "") {
                botton8.setOnClickListener {
                    botton8.text = "X"
                    boton8 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
            if (botton9.text == "") {
                botton9.setOnClickListener {
                    botton9.text = "X"
                    boton9 = true
                    turno_ma = true
                    turno_maquina(turno_ma)
                }
            }
    }
}