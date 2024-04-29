package com.example.yumyumquest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FishCurry : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fish_curry)

        val imageView = findViewById<ImageView>(R.id.back_M)
        imageView.setOnClickListener {
            val intent = Intent(this, Srilankan::class.java)
            startActivity(intent)
        }
    }
}