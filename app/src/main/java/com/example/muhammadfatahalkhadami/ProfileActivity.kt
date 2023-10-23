package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val user = Firebase.auth.currentUser
        user?.let {
            val email = it.email
            val emailVerified = it.isEmailVerified
        }
        setContentView(R.layout.activity_profile)

        val btnBack = findViewById<Button>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}