package com.example.yumyumquest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Srilankan : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_srilankan)

        val imageView = findViewById<ImageView>(R.id.back_sl)
        imageView.setOnClickListener {
            val intent = Intent(this, Main_Home::class.java)
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

        val imageview = findViewById<ImageView>(R.id.fish_curry)
        imageview.setOnClickListener {
            val intent = Intent(this, FishCurry::class.java)
            startActivity(intent)
        }
        val imagevIew = findViewById<ImageView>(R.id.panipuri)
        imagevIew.setOnClickListener {
            val intent = Intent(this, Polsambola_SL::class.java)
            startActivity(intent)
        }
        val imageVIew = findViewById<ImageView>(R.id.alosamosa)
        imageVIew.setOnClickListener {
            val intent = Intent(this, Watalappan_SL::class.java)
            startActivity(intent)
        }
    }
}