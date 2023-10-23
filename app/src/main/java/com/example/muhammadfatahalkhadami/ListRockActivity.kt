package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ListRockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_rock)

        val btnBack = findViewById<Button>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        val btnSweetheart = findViewById<LinearLayout>(R.id.mia)
        btnSweetheart.setOnClickListener {
            val intent = Intent(this, LyMiaActivity::class.java)
            startActivity(intent)
        }
    }
}