package com.myfirstapp.chinenyeakukalia
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinButton: Button = findViewById(R.id.join)
        joinButton.setOnClickListener {

            val i = Intent(this, CreateAccountActivity2::class.java)

            startActivity(i)
        }
    }
}
