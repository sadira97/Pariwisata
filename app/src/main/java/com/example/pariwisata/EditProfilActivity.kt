package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EditProfilActivity : AppCompatActivity() {
    private lateinit var back3: ImageView
    private lateinit var btnupdate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profil)
        supportActionBar?.hide()

        back3 = findViewById(R.id.back3)
        btnupdate = findViewById(R.id.btnupdate)

        back3tokategori()
        btnupdatetoprofile()
    }
    private fun back3tokategori() {
        back3.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btnupdatetoprofile() {
        btnupdate.setOnClickListener{
            startActivity(Intent(this, ProfilActivity::class.java))
        }
    }
}