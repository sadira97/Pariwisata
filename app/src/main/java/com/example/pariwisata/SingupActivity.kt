package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SingupActivity : AppCompatActivity() {

    private lateinit var buton1:Button
    private lateinit var btnloginhere : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        supportActionBar?.hide()

        buton1 = findViewById(R.id.buton1)
        btnloginhere = findViewById(R.id.btnloginhere)

        btnsignuptologin()
        btnloginheretologin()
    }
    private fun btnloginheretologin() {
        btnloginhere.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
    private fun btnsignuptologin() {
        buton1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}