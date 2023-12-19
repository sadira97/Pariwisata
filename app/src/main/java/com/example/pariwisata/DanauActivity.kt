package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class DanauActivity : AppCompatActivity() {

    private lateinit var back6 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danau)
        supportActionBar?.hide()

        back6 = findViewById(R.id.back6)
        back6towisataalam()

        val linkdanau : TextView = findViewById(R.id.linkdanau)
        linkdanau.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back6towisataalam() {
        back6.setOnClickListener {
            startActivity(Intent(this, WisataAlamActivity::class.java))
        }
    }
}