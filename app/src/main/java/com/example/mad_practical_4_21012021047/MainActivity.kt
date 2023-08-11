package com.example.mad_practical_4_21012021047

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login_button = findViewById<View>(R.id.button)
        login_button.setOnClickListener {
            intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

        var signUp_button = findViewById<View>(R.id.button2)
        signUp_button.setOnClickListener {
            intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }
    }
}