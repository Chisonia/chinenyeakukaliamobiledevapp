package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset)
        val resetButton: Button = findViewById(R.id.resetPassword)
        resetButton.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)

            startActivity(i)
        }
        val backButton: Button = findViewById(R.id.back)
        backButton.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)

            startActivity(i)
        }
    }
}