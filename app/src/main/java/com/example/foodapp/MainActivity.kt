package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnfoody:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnfoody=findViewById(R.id.btnfoody)
        btnfoody.setOnClickListener {
            val intent= Intent(this,Foody::class.java)
            startActivity(intent)
        }
    }
}