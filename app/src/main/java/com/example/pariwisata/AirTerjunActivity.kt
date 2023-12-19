package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import android.widget.ImageView

class AirTerjunActivity : AppCompatActivity() {

    private lateinit var back7 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_terjun)
        supportActionBar?.hide()

        back7 = findViewById(R.id.back7)
        back7towisataalam()

        val linkat : TextView = findViewById(R.id.linkat)
        linkat.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back7towisataalam() {
        back7.setOnClickListener {
            startActivity(Intent(this, WisataAlamActivity::class.java))
        }
    }
}