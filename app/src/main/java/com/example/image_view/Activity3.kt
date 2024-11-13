package com.example.image_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity3 : AppCompatActivity() {

         private lateinit var button1: Button
         private lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_3)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)


        button1.setOnClickListener{startActivity(Intent(this,MainActivity::class.java))}
        button2.setOnClickListener{finishAffinity()}



    }
}