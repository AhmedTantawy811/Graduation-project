package com.example.graduationproject.Ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.graduationproject.R
import com.example.graduationproject.Ui.onBoarding.OnBoardingActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,OnBoardingActivity ::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }

}