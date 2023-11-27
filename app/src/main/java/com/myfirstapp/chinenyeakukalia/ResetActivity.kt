package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class ResetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset)
        val resetButton: Button = findViewById(R.id.resetPassword)
        resetButton.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)

            startActivity(i)
        }
        val restButton: Button = findViewById(R.id.resetPassword)
        resetButton.setOnClickListener {
            val enterCodeInput: EditText = findViewById(R.id.enterCode)
            val enterNewPassInput: EditText = findViewById(R.id.newPass)
            val reTypeInput: EditText = findViewById(R.id.retypePass)
            val userCodeEnter: String = enterCodeInput.text.toString()
            val userNewPassEnter: String = enterNewPassInput.text.toString()
            val reTypePassEnter: String = reTypeInput.text.toString()
            var message = "You need to enter code and new password and retype password"
            if (userCodeEnter.isEmpty() || userNewPassEnter.isEmpty() || reTypePassEnter.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentReset), message, Snackbar.LENGTH_LONG).show()
            } else {

                val i = Intent(this, LoginActivity::class.java)

                startActivity(i)
            }
        }
    }
}