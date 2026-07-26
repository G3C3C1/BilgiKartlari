package com.alge.quickcard

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logoContainer = findViewById<View>(R.id.logoContainer)
        val tvAppName = findViewById<View>(R.id.tvAppName)
        val tvTagline = findViewById<View>(R.id.tvTagline)

        logoContainer.scaleX = 0.3f
        logoContainer.scaleY = 0.3f
        logoContainer.alpha = 0f

        tvAppName.alpha = 0f
        tvAppName.translationY = 40f

        tvTagline.alpha = 0f
        tvTagline.translationY = 40f

        logoContainer.animate()
            .scaleX(1f)
            .scaleY(1f)
            .alpha(1f)
            .setDuration(500)
            .setInterpolator(OvershootInterpolator(1.6f))
            .start()

        tvAppName.animate()
            .alpha(1f)
            .translationY(0f)
            .setStartDelay(350)
            .setDuration(400)
            .start()

        tvTagline.animate()
            .alpha(1f)
            .translationY(0f)
            .setStartDelay(500)
            .setDuration(400)
            .start()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 1700)
    }
}