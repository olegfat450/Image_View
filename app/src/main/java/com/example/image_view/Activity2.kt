package com.example.image_view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {

      private lateinit var imageTv: ImageView
      private lateinit var button: Button
           var i = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)


        imageTv = findViewById(R.id.imageTv)
        button = findViewById(R.id.button)


         imageTv.setImageResource(Photo().nature[i])

        button.setOnClickListener{ if ( i <  Photo().nature.size-1 ) imageTv.setImageResource(Photo().nature[++i])

            else startActivity(Intent(this,Activity3::class.java))
        }
    }
    }
