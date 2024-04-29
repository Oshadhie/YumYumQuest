package com.example.yumyumquest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Panipuri_IN : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panipuri_in)

        val imageView = findViewById<ImageView>(R.id.back_M)
        imageView.setOnClickListener {
            val intent = Intent(this, Indian::class.java)
            startActivity(intent)
        }
    }
}