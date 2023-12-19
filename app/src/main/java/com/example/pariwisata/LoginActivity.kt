package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var buton2: Button
    private lateinit var txt_signup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        buton2 = findViewById(R.id.buton2)
        txt_signup = findViewById(R.id.txt_signup)

        btntokategoripage()
        btntosignuppage()
    }

    private fun btntosignuppage() {
        txt_signup.setOnClickListener {
            startActivity(Intent(this, SingupActivity::class.java))
        }
    }

    private fun btntokategoripage() {
        buton2.setOnClickListener {
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }


}