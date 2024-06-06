package com.example.library

import android.content.Context
import android.widget.Toast

class Toasty {
    fun simpleToast(context: Context, message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}