package com.example.di_t1_seminario2_vanesa_nunez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Actividad_tresenraya : AppCompatActivity() {

    private lateinit var botton1 : Button
    private lateinit var botton2 : Button
    private lateinit var botton3 : Button
    private lateinit var botton4 : Button
    private lateinit var botton5 : Button
    private lateinit var botton6 : Button
    private lateinit var botton7 : Button
    private lateinit var botton8 : Button
    private lateinit var botton9 : Button


    var boton1: Boolean = false
    var turno_ma: Boolean = false
    var boton2: Boolean = false
    var boton3: Boolean = false
    var boton4: Boolean = false
    var boton5: Boolean = false
    var boton6: Boolean = false
    var boton7: Boolean = false
    var boton8: Boolean = false
    var boton9: Boolean = false
    var partida_fin: Boolean = false
    private lateinit var boton_reinicio : Button
    private lateinit var texto : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_tresenraya)

        botton1 = findViewById<Button>(R.id.button1)
        botton2 = findViewById<Button>(R.id.button2)
        botton3 = findViewById<Button>(R.id.button3)
        botton4 = findViewById<Button>(R.id.button4)
        botton5 = findViewById<Button>(R.id.button5)
        botton6 = findViewById<Button>(R.id.button6)
        botton7 = findViewById<Button>(R.id.button7)
        botton8 = findViewById<Button>(R.id.button8)
        botton9 = findViewById<Button>(R.id.button9)
        boton_reinicio = findViewById<Button>(R.id.button_volver)
        texto  = findViewById<TextView>(R.id.textView)
        
        botton1.setOnClickListener {
            if(partida_fin!=true) {
                if (botton1.text == "") {
                    botton1.text = "X"
                    boton1 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }

        }
        botton2.setOnClickListener {
            if(partida_fin!=true) {
                if (botton2.text == "") {
                    botton2.text = "X"
                    boton2 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton3.setOnClickListener {
            if (partida_fin != true) {
                if (botton3.text == "") {
                    botton3.text = "X"
                    boton3 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton4.setOnClickListener {
            if (partida_fin != true) {
                if (botton4.text == "") {
                    botton4.text = "X"
                    boton4 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton5.setOnClickListener {
            if (partida_fin != true) {
                if (botton5.text == "") {
                    botton5.text = "X"
                    boton5 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton6.setOnClickListener {
            if (partida_fin != true) {
                if (botton6.text == "") {
                    botton6.text = "X"
                    boton6 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton7.setOnClickListener {
            if (partida_fin != true) {
                if (botton7.text == "") {
                    botton7.text = "X"
                    boton7 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton8.setOnClickListener {
            if (partida_fin != true) {
                if (botton8.text == "") {
                    botton8.text = "X"
                    boton8 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }
        botton9.setOnClickListener {
            if (partida_fin != true) {
                if (botton9.text == "") {
                    botton9.text = "X"
                    boton9 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina(turno_ma)
                }
            }
        }

        boton_reinicio.setOnClickListener{
            recreate()
        }

        }

    
    fun comprobarResultado(){
        if (botton1.text == "X" && botton2.text == "X" && botton3.text == "X" || botton4.text == "X" && botton5.text == "X" && botton6.text == "X" || botton7.text == "X" && botton8.text == "X" && botton9.text == "X" ||
            botton1.text == "X" && botton5.text == "X" && botton9.text == "X" || botton3.text == "X" && botton5.text == "X" && botton7.text == "X" ||
            botton1.text == "X" && botton4.text == "X" && botton7.text == "X" || botton2.text == "X" && botton5.text == "X" && botton8.text == "X" || botton3.text == "X" && botton6.text == "X" && botton9.text == "X"){
            texto.text="Has ganado"
            partida_fin=true
        }
        else if (botton1.text == "O" && botton2.text == "O" && botton3.text == "O" || botton4.text == "O" && botton5.text == "O" && botton6.text == "O" || botton7.text == "O" && botton8.text == "O" && botton9.text == "O" ||
            botton1.text == "O" && botton5.text == "O" && botton9.text == "O" || botton3.text == "O" && botton5.text == "O" && botton7.text == "O" ||
            botton1.text == "O" && botton4.text == "O" && botton7.text == "O" || botton2.text == "O" && botton5.text == "O" && botton8.text == "O" || botton3.text == "O" && botton6.text == "O" && botton9.text == "O"){
            println("Has perdido")
            texto.text="Has perdido"
            partida_fin=true
        }
    }

    fun turno_maquina(boolean: Boolean) {
        if (partida_fin != true) {
            if (boton1 == false) {
                botton1.text = "O"
                boton1 = true
                comprobarResultado()
            } else if (boton2 == false) {
                botton2.text = "O"
                boton2 = true
                comprobarResultado()
            } else if (boton3 == false) {
                botton3.text = "O"
                boton3 = true
                comprobarResultado()
            } else if (boton4 == false) {
                botton4.text = "O"
                boton4 = true
                comprobarResultado()
            } else if (boton5 == false) {
                botton5.text = "O"
                boton5 = true
                comprobarResultado()
            } else if (boton6 == false) {
                botton6.text = "O"
                boton6 = true
                comprobarResultado()
            } else if (boton7 == false) {
                botton7.text = "O"
                boton7 = true
                comprobarResultado()
            } else if (boton8 == false) {
                botton8.text = "O"
                boton8 = true
                comprobarResultado()
            } else if (boton9 == false) {
                botton9.text = "O"
                boton9 = true
                comprobarResultado()
            }
            /*comprobarResultado()*/
        }
    }

}
