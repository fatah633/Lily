package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ListElectronicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_electronic)

        val btnBack = findViewById<Button>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        val btnSweetheart = findViewById<LinearLayout>(R.id.sweetheart)
        btnSweetheart.setOnClickListener {
            val intent = Intent(this, LySweetheartActivity::class.java)
            startActivity(intent)
        }

        val btnCineseFairytale = findViewById<LinearLayout>(R.id.chinesefairytale)
        btnCineseFairytale.setOnClickListener {
            val intent = Intent(this, LyChineseFairytaleActivity::class.java)
            startActivity(intent)
        }
    }
}