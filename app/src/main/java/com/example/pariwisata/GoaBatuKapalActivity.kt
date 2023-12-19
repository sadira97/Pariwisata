package com.example.pariwisata


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class GoaBatuKapalActivity : AppCompatActivity() {

    private lateinit var back8 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goa_batu_kapal)
        supportActionBar?.hide()

        back8 = findViewById(R.id.back8)
        back8towisataalam()

        val linkgbk : TextView = findViewById(R.id.linkgbk)
        linkgbk.movementMethod = LinkMovementMethod.getInstance()
    }private fun back8towisataalam() {
        back8.setOnClickListener {
            startActivity(Intent(this, WisataAlamActivity::class.java))
        }
    }
}