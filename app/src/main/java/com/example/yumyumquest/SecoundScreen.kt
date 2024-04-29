package com.example.yumyumquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecoundScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound_screen)

        val btn_second = findViewById<Button>(R.id.btn_second)
        btn_second.setOnClickListener {
            val intent = Intent(this, ThridScreen::class.java)
            startActivity(intent)
        }
    }
}