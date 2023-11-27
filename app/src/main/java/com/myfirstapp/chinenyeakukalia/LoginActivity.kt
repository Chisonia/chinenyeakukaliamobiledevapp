package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

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
            val inputField: EditText = findViewById(R.id.editusername)
            val passField: EditText = findViewById(R.id.password)
            val userInputEnter: String = inputField.text.toString()
            val userPassEnter: String = passField.text.toString()
            var message = "You need to enter Username and Password"
            if (userInputEnter.isEmpty() || userPassEnter.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentLogin), message, Snackbar.LENGTH_LONG).show()
            }else {
                val l = Intent(this, HomeActivity::class.java)
                startActivity(l)
            }
        }
    }
}
