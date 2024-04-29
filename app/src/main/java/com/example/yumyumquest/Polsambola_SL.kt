package com.example.yumyumquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Polsambola_SL : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polsambola_sl)

        val imageView = findViewById<ImageView>(R.id.back_P)
        imageView.setOnClickListener {
            val intent = Intent(this, Srilankan::class.java)
            startActivity(intent)
        }
    }
}