package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class KawasanSaribuRumahGadangActivity : AppCompatActivity() {

    private lateinit var back9 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kawasan_saribu_rumah_gadang)
        supportActionBar?.hide()

        back9 = findViewById(R.id.back9)
        back9towisataalam()

        val linksrg : TextView = findViewById(R.id.linksrg)
        linksrg.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back9towisataalam() {
        back9.setOnClickListener {
            startActivity(Intent(this, WisataAlamActivity::class.java))
        }
    }
}