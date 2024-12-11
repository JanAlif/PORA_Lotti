package com.example.pora_lottie

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.pora_lottie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Button animation logic
        binding.lottieButton.setOnClickListener {
            // Play the button animation
            binding.lottieButton.playAnimation()

            // After button animation ends, show the transition animation
            binding.lottieButton.addAnimatorListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator) {}

                override fun onAnimationEnd(animation: Animator) {
                    // Start the transition animation
                    binding.transitionLottie.visibility = View.VISIBLE
                    binding.transitionLottie.playAnimation()

                    // Navigate to the next activity after the transition animation ends
                    binding.transitionLottie.addAnimatorListener(object : Animator.AnimatorListener {
                        override fun onAnimationStart(animation: Animator) {}

                        override fun onAnimationEnd(animation: Animator) {
                            startActivity(Intent(this@MainActivity, ExampleActivity::class.java))
                            finish() // Optionally finish this activity
                        }

                        override fun onAnimationCancel(animation: Animator) {}

                        override fun onAnimationRepeat(animation: Animator) {}
                    })
                }

                override fun onAnimationCancel(animation: Animator) {}

                override fun onAnimationRepeat(animation: Animator) {}
            })
        }
    }
}