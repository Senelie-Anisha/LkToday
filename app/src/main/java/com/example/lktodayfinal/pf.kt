package com.example.lktodayfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pf : AppCompatActivity() {

    private lateinit var back: ImageView
    lateinit var logoutBtn: Button

    private lateinit var settings: ImageView
    private lateinit var set_txt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pf)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pf)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        back = findViewById(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        logoutBtn = findViewById(R.id.logoutBtn)
        logoutBtn.setOnClickListener{
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }

        // Button click → go to LoginPage
        settings = findViewById(R.id.settings)
        settings.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }

        set_txt = findViewById(R.id.set_txt)
        set_txt.setOnClickListener {
            val intent = Intent(this, set_txt::class.java)
            startActivity(intent)
        }
    }
}