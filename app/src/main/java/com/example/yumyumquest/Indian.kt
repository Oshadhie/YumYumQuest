package com.example.yumyumquest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Indian : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indian)

        val imageView = findViewById<ImageView>(R.id.back_in)
        imageView.setOnClickListener {
            val intent = Intent(this, Main_Home::class.java)
            startActivity(intent)
        }
        val imageview = findViewById<ImageView>(R.id.butterchicken)
        imageview.setOnClickListener {
            val intent = Intent(this, Butterchicken_IN::class.java)
            startActivity(intent)
        }
        val imagevIew = findViewById<ImageView>(R.id.panipuri)
        imagevIew.setOnClickListener {
            val intent = Intent(this, Panipuri_IN::class.java)
            startActivity(intent)
        }
        val imageVIew = findViewById<ImageView>(R.id.alosamosa)
        imageVIew.setOnClickListener {
            val intent = Intent(this, Alosamosa_IN::class.java)
            startActivity(intent)
        }

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.Home -> {
                    val homeIntent = Intent(this, Main_Home::class.java)
                    startActivity(homeIntent)
                    true
                }
                R.id.Favorite -> {
                    val homeIntent = Intent(this, Favorite::class.java)
                    startActivity(homeIntent)
                    true
                }
                R.id.Profile -> {
                    val browseIntent = Intent(this, Profile::class.java)
                    startActivity(browseIntent)
                    true
                }
                else -> false
            }
        }
    }
}