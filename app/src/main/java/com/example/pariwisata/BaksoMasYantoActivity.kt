package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class BaksoMasYantoActivity : AppCompatActivity() {

    private lateinit var back15 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakso_mas_yanto)
        supportActionBar?.hide()

        back15 = findViewById(R.id.back15)
        back15towisatakuliner()

        val linkbmy : TextView = findViewById(R.id.linkbmy)
        linkbmy.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back15towisatakuliner() {
        back15.setOnClickListener {
            startActivity(Intent(this, WisataKulinerActivity::class.java))
        }
    }
}