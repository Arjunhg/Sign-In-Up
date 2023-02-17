package com.example.signinup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()

        val forgot = findViewById<TextView>(R.id.forgotpassword)

        forgot.setOnClickListener {
            intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}