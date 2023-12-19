package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class BaksoTiaraSoloActivity : AppCompatActivity() {

    private lateinit var back13 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakso_tiara_solo)
        supportActionBar?.hide()

        back13 = findViewById(R.id.back13)
        back13towisatakuliner()

        val linkbts : TextView = findViewById(R.id.linkbts)
        linkbts.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back13towisatakuliner() {
        back13.setOnClickListener {
            startActivity(Intent(this, WisataKulinerActivity::class.java))
        }
    }
}