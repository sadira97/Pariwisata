package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class KebunTehLikiActivity : AppCompatActivity() {

    private lateinit var back10 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kebun_teh_liki)
        supportActionBar?.hide()

        back10 = findViewById(R.id.back10)
        back10towisataalam()

        val linkktl : TextView = findViewById(R.id.linkktl)
        linkktl.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back10towisataalam() {
        back10.setOnClickListener {
            startActivity(Intent(this, WisataAlamActivity::class.java))
        }
    }
}