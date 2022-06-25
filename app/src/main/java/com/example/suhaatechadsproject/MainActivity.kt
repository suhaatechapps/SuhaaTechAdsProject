package com.example.suhaatechadsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.suhaatechadsproject.databinding.ActivityMainBinding
import com.malik.suhaatech.ads.modules.TrueAdManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        TrueAdManager.zShowSimpleNativeBanner(
            binding.nativeBannerAds,
            "ca-app-pub-3940256099942544/2247696110",
        )
        TrueAdManager.zShowInterstitialInAdvance(this)
    }

}