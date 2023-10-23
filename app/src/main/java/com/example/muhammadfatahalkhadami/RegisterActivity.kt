package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.muhammadfatahalkhadami.databinding.ActivityLoginBinding
import com.example.muhammadfatahalkhadami.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.toLogin.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener{
            val email = binding.Email.text.toString()
            val pass = binding.Password.text.toString()
            val repass = binding.rePassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && repass.isNotEmpty()){
                if (pass == repass){
                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful){
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this, "Password is not matching!", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Empty fields are nor allowed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}