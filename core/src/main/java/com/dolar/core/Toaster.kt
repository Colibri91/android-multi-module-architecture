package com.dolar.core

import android.content.Context
import android.widget.Toast

/**
 * Created by R. Mert Dolar on 26.07.2022.
 */
class Toaster {

    fun show(context : Context){
        Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()
    }
}