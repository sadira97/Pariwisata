package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class TopChickenBurgerActivity : AppCompatActivity() {

    private lateinit var back14 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_chicken_burger)
        supportActionBar?.hide()

        back14 = findViewById(R.id.back14)
        back14towisatakuliner()

        val linktop : TextView = findViewById(R.id.linktop)
        linktop.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back14towisatakuliner() {
        back14.setOnClickListener {
            startActivity(Intent(this, WisataKulinerActivity::class.java))
        }
    }
}