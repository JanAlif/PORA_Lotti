package com.example.pora_lottie

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.pora_lottie.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.splashAnimation.playAnimation() // Start Lottie animation explicitly (optional)

        // Delay for the duration of the Lottie animation
        Handler(Looper.getMainLooper()).postDelayed({
            // Start MainActivity after the animation finishes
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Finish SplashActivity so it's removed from the back stack
        }, 3000) // 3000ms = 3 seconds
    }
}