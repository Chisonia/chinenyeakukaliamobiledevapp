package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val createAButton: Button = findViewById(R.id.createnewaccount)
        createAButton.setOnClickListener {

            val i = Intent(this, CreateAccountActivity2::class.java)

            startActivity(i)
        }
        val forgotPassButton: Button = findViewById(R.id.forgottenpassord)
        forgotPassButton.setOnClickListener {

            val i = Intent(this, ForgotPasswordActivity::class.java)

            startActivity(i)
        }
        val loginButton: Button = findViewById(R.id.login)
        loginButton.setOnClickListener {

            val i = Intent(this, HomeActivity::class.java)

            startActivity(i)
        }
    }
}
