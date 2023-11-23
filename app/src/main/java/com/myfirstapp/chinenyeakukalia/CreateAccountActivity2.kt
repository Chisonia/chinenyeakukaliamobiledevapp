package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CreateAccountActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account2)

        val signButton: Button = findViewById(R.id.signUp)
        signButton.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)

            startActivity(i)
        }
        val alreadyHButton: Button = findViewById(R.id.hAccount)
        alreadyHButton.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)

            startActivity(i)
        }
    }
}