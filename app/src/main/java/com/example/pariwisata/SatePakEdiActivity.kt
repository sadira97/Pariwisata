package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class SatePakEdiActivity : AppCompatActivity() {
    private lateinit var back11 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sate_pak_edi)
        supportActionBar?.hide()

        back11 = findViewById(R.id.back11)
        back11towisatakuliner()

        val linkspe : TextView = findViewById(R.id.linkspe)
        linkspe.movementMethod = LinkMovementMethod.getInstance()

        val link2spe : TextView = findViewById(R.id.link2spe)
        link2spe.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back11towisatakuliner() {
        back11.setOnClickListener {
            startActivity(Intent(this, WisataKulinerActivity::class.java))
        }
    }
}