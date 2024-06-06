package com.example.toasty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast=Toasty()
        toast.simpleToast(this,"This is my dependency")
    }
}