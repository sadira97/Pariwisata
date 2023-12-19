package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfilActivity : AppCompatActivity() {
    private lateinit var back2: ImageView
    private lateinit var btnedit: Button
    private lateinit var btnlogout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        supportActionBar?.hide()

        back2 = findViewById(R.id.back2)
        btnedit = findViewById(R.id.btnedit)
        btnlogout = findViewById(R.id.btnlogout)

        back2tokategori()
        btnedittoeditprofile()
        btnlogouttomain()
    }
    private fun back2tokategori() {
        back2.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btnedittoeditprofile() {
        btnedit.setOnClickListener{
            startActivity(Intent(this, EditProfilActivity::class.java))
        }
    }
    private fun btnlogouttomain() {
        btnlogout.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}