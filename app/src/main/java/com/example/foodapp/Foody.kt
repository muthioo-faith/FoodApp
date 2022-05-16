package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Foody : AppCompatActivity() {
    lateinit var btnlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foody)
        btnlogin=findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val intent= Intent(this,order::class.java)
            startActivity(intent)
        }
    }
}