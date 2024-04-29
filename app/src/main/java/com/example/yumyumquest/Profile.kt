package com.example.yumyumquest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

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

        val imageView = findViewById<ImageView>(R.id.my_rep)
        imageView.setOnClickListener {
            val intent = Intent(this, MyRecipe::class.java)
            startActivity(intent)
        }
    }
}