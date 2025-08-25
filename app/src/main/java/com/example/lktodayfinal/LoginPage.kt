package com.example.lktodayfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {

    private lateinit var login: Button
    private lateinit var signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        // Apply window insets to root layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LoginPage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Use correct IDs from XML
        login = findViewById(R.id.login)
        signup = findViewById(R.id.signup)

        // Login button → go to MainActivity
        login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Signup text → go to SignupPage
        signup.setOnClickListener {
            val intent = Intent(this, signupPage::class.java)
            startActivity(intent)
        }
    }
}
