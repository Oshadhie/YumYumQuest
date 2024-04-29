package com.example.yumyumquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThridScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thrid_screen)

        val btn_thrid = findViewById<Button>(R.id.btn_thrid)
        btn_thrid.setOnClickListener {
            val intent = Intent(this, Main_Home::class.java)
            startActivity(intent)
        }
    }
}