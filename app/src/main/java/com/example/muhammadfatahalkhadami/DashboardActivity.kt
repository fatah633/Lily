package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import de.hdodenhof.circleimageview.CircleImageView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnInfo = findViewById<Button>(R.id.info)
        btnInfo.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        val btnSett = findViewById<Button>(R.id.settings)
        btnSett.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val btnPfp = findViewById<CircleImageView>(R.id.profile_image)
        btnPfp.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val btnElec = findViewById<LinearLayout>(R.id.Elec)
        btnElec.setOnClickListener {
            val intent = Intent(this, ListElectronicActivity::class.java)
            startActivity(intent)
        }

        val btnPop = findViewById<LinearLayout>(R.id.Pop)
        btnPop.setOnClickListener {
            val intent = Intent(this, ListPopActivity::class.java)
            startActivity(intent)
        }

        val btnRock = findViewById<LinearLayout>(R.id.Rock)
        btnRock.setOnClickListener {
            val intent = Intent(this, ListRockActivity::class.java)
            startActivity(intent)
        }
    }
}