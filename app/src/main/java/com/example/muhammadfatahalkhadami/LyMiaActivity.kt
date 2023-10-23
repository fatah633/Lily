package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LyMiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ly_mia)

        val btnBack = findViewById<Button>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, ListRockActivity::class.java)
            startActivity(intent)
        }
    }
}