package com.example.timescraft


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 3 seconds
        Handler().postDelayed({
            // Start Menu activity
            startActivity(Intent(this, HomeActivity::class.java))
            // Finish MainActivity
            finish()
        }, 3000)
    }
}
