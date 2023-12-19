package com.example.pariwisata

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class WisataKulinerActivity : AppCompatActivity() {
    private lateinit var back6: ImageView
    private lateinit var btnsate: ImageView
    private lateinit var btnRM: ImageView
    private lateinit var btnBts: ImageView
    private lateinit var btntop: ImageView
    private lateinit var btnBmy: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_kuliner)
        supportActionBar?.hide()

        back6 = findViewById(R.id.back6)
        btnsate = findViewById(R.id.btnsate)
        btnRM = findViewById(R.id.btnRM)
        btnBts = findViewById(R.id.btnBts)
        btntop = findViewById(R.id.btntop)
        btnBmy = findViewById(R.id.btnBmy)

        back6tokategori()
        btnsatetosatepakedi()
        btnRMtorumahmakan()
        btnBtstobaksotiarasolo()
        btntoptotopchicken()
        btnBmytobaksomasyanto()

    }
    private fun back6tokategori() {
        back6.setOnClickListener{
            startActivity(Intent(this, KategoriActivity::class.java))
        }
    }
    private fun btnsatetosatepakedi() {
        btnsate.setOnClickListener{
            startActivity(Intent(this, SatePakEdiActivity::class.java))
        }
    }
    private fun btnRMtorumahmakan() {
        btnRM.setOnClickListener{
            startActivity(Intent(this, RM_SungaiKalu6Activity::class.java))
        }
    }
    private fun btnBtstobaksotiarasolo() {
        btnBts.setOnClickListener{
            startActivity(Intent(this, BaksoTiaraSoloActivity::class.java))
        }
    }
    private fun btntoptotopchicken() {
        btntop.setOnClickListener{
            startActivity(Intent(this, TopChickenBurgerActivity::class.java))
        }
    }
    private fun btnBmytobaksomasyanto() {
        btnBmy.setOnClickListener{
            startActivity(Intent(this, BaksoMasYantoActivity::class.java))
        }
    }
}