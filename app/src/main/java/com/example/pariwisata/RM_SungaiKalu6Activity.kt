package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class RM_SungaiKalu6Activity : AppCompatActivity() {

    private lateinit var back12 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rm_sungai_kalu6)
        supportActionBar?.hide()

        back12 = findViewById(R.id.back12)
        back12towisatakuliner()

        val linkrsk : TextView = findViewById(R.id.linkrsk)
        linkrsk.movementMethod = LinkMovementMethod.getInstance()
    }
    private fun back12towisatakuliner() {
        back12.setOnClickListener {
            startActivity(Intent(this, WisataKulinerActivity::class.java))
        }
    }
}