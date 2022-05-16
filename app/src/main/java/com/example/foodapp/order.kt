package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class order : AppCompatActivity() {
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            val intent= Intent(this,search::class.java)
            startActivity(intent)
        }
    }
}