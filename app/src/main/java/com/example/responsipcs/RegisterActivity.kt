package com.example.responsipcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //instance text
        val txtEmail = findViewById(R.id.txtEmail) as TextInputEditText
        val txtPassword = findViewById(R.id.txtPassword) as TextInputEditText
        val txtConfirmPassword = findViewById(R.id.txtConfirmPassword) as TextInputEditText
        //instance button register
        val btnRegister = findViewById(R.id.btnRegister) as Button

        //event button save
        btnRegister.setOnClickListener {
            //declare data
            val email:String = txtEmail.text.toString().trim()
            val password:String = txtPassword.text.toString().trim()
            val confpassword:String = txtConfirmPassword.text.toString().trim()

            //show LoginActivity
            val intentLogin = Intent(this@RegisterActivity,
                HomeActivity::class.java)
            startActivity(intentLogin)
        }
    }
}