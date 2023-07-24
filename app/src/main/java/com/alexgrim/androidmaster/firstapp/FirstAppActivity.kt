package com.alexgrim.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexgrim.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Al arrancar la pantalla
    }
}