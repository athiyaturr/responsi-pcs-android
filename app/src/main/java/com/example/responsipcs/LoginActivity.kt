package com.example.responsipcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById(R.id.btnLogin) as Button
        val txtEmail = findViewById(R.id.txtEmail) as TextInputEditText
        val txtPassword = findViewById(R.id.txtPassword) as TextInputEditText

        //instance text
        val txtForgotPassword: TextView = findViewById(R.id.textView)
        val txtLinkRegister: TextView = findViewById(R.id.textView2)

        //event saat textview forgot password di-klik
        txtForgotPassword.setOnClickListener {
            val intentRegister = Intent(
                this@LoginActivity,
                RecoveryActivity::class.java
            )
            startActivity(intentRegister)
        }

        //event saat textview register di-klik
        txtLinkRegister.setOnClickListener {
            val intentRegister = Intent(
                this@LoginActivity,
                RegisterActivity::class.java
            )
            startActivity(intentRegister)
        }

        //event button login
        btnLogin.setOnClickListener {

            val email = txtEmail.text.toString().trim()
            val password = txtPassword.text.toString().trim()

            val intentLogin = Intent(
                this@LoginActivity,
                HomeActivity::class.java
            )
            startActivity(intentLogin)
        }
    }
}