package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class CreateAccountActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account2)

        val signButton: Button = findViewById(R.id.signUp)
        signButton.setOnClickListener {
            val enterEmailInput: EditText = findViewById(R.id.Enteremail)
            val createUsernameInput: EditText = findViewById(R.id.createusername)
            val createPasswordInput: EditText = findViewById(R.id.createpassword)
            val enterEmailField: String = enterEmailInput.text.toString()
            val createPasswordField: String = createPasswordInput.text.toString()
            val createUsernameField: String = createUsernameInput.text.toString()
            val message = "You need to enter Email, Username and Password"
            if (enterEmailField.isEmpty() || createPasswordField.isEmpty() || createUsernameField.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentCreate), message, Snackbar.LENGTH_LONG).show()
            } else {
                val c = Intent(this, LoginActivity::class.java)
                startActivity(c)
            }
            val alreadyHButton: Button = findViewById(R.id.hAccount)
            alreadyHButton.setOnClickListener {

                val i = Intent(this, LoginActivity::class.java)

                startActivity(i)
            }
        }
    }
}