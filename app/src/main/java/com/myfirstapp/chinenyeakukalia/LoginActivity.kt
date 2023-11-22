package com.myfirstapp.chinenyeakukalia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        create

        var i = Intent(this, CreateAccountActivity2:class.java)

        startActivities(i)
    }
}