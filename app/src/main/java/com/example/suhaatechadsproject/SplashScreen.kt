package com.example.suhaatechadsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.malik.suhaatech.ads.modules.TrueAdManager

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)

        TrueAdManager.zLoadInterstitialInAdvance(this,"ca-app-pub-3940256099942544/1033173712")
        TrueAdManager.zLoadSimpleNativeAdInAdvance(this,"ca-app-pub-3940256099942544/2247696110")
    }
}