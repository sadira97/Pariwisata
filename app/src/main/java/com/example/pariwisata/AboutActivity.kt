package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    private lateinit var back4: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.hide()

        back4 = findViewById(R.id.back4)

        back4tokategori()
    }
    private fun back4tokategori() {
        back4.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
}