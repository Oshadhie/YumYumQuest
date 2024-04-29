package com.example.yumyumquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FristScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frist_screen)

        val btn_frist = findViewById<Button>(R.id.btn_frist)
        btn_frist.setOnClickListener {
            val intent = Intent(this, SecoundScreen::class.java)
            startActivity(intent)
        }
    }
}