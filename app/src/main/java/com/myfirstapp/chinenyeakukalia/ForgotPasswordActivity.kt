package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.myfirstapp.chinenyeakukalia.R.id.rememberPass

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgort_password)

        val remPassButton: Button = findViewById(rememberPass)
        remPassButton.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)

            startActivity(i)
        }
        val resetPassButton: Button = findViewById(R.id.resetPassword)
        resetPassButton.setOnClickListener {

            val i = Intent(this, ResetActivity::class.java)

            startActivity(i)
        }
    }
}