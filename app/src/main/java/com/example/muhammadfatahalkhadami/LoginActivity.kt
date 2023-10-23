package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.muhammadfatahalkhadami.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.toRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener{
            val email = binding.Email.text.toString()
            val pass = binding.Password.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent = Intent(this, DashboardActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this, "Empty fields are nor allowed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}