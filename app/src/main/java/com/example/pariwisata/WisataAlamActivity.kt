package com.example.pariwisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class WisataAlamActivity : AppCompatActivity() {
    private lateinit var back5: ImageView
    private lateinit var btndanau: Button
    private lateinit var btngoa: Button
    private lateinit var btnair: Button
    private lateinit var btnkawasan: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_alam)
        supportActionBar?.hide()

        back5 = findViewById(R.id.back5)
        btndanau = findViewById(R.id.btndanau)
        btnair = findViewById(R.id.btnair)
        btngoa = findViewById(R.id.btngoa)
        btnkawasan = findViewById(R.id.btnkawasan)

        back5tokategori()
        btndanautodanau()
        btnairtoairterjun()
        btngoatogoabatukapal()
        btnkawasantokawasan()
    }
    private fun back5tokategori() {
        back5.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btndanautodanau() {
        btndanau.setOnClickListener{
            startActivity(Intent(this, DanauActivity::class.java))
        }
    }
    private fun btnairtoairterjun() {
        btnair.setOnClickListener{
            startActivity(Intent(this, AirTerjunActivity::class.java))
        }
    }
    private fun btngoatogoabatukapal() {
        btngoa.setOnClickListener{
            startActivity(Intent(this, GoaBatuKapalActivity::class.java))
        }
    }
    private fun btnkawasantokawasan() {
        btnkawasan.setOnClickListener{
            startActivity(Intent(this, KawasanSaribuRumahGadangActivity::class.java))
        }
    }
}