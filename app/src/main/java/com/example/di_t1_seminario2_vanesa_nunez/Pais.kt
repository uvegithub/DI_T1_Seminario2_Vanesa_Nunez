package com.example.di_t1_seminario2_vanesa_nunez

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Pais (var nombre: String, var habitantes: Int, var bandera:String) : Parcelable{

    override fun toString(): String {
        return nombre + " " + habitantes.toString() + " " + bandera
    }

}