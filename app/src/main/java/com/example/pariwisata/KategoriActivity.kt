package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class KategoriActivity : AppCompatActivity() {

    private lateinit var btn_about: ImageView
    private lateinit var profil1: ImageView
    private lateinit var btnkategori1: Button
    private lateinit var btnkategori2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)
        supportActionBar?.hide()

        btn_about = findViewById(R.id.btn_about)
        profil1 = findViewById(R.id.profil1)
        btnkategori1 = findViewById(R.id.btnkategori1)
        btnkategori2 = findViewById(R.id.btnkategori2)

        btn_abouttoabout()
        profil1toprofile()
        btnkategori1tow_alam()
        btnkategori2tow_kuliner()

    }
    private fun btn_abouttoabout() {
        btn_about.setOnClickListener{
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
    private fun profil1toprofile() {
        profil1.setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }
    }
    private fun btnkategori1tow_alam() {
        btnkategori1.setOnClickListener {
            startActivity(Intent(this, WisataAlamActivity::class.java))
        }
    }
    private fun btnkategori2tow_kuliner() {
        btnkategori2.setOnClickListener() {
            startActivity(Intent(this, WisataKulinerActivity::class.java))
        }
    }
}