package com.example.suhaatechadsproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.suhaatechadsproject.databinding.ActivityMainBinding
import com.malik.suhaatech.ads.modules.TrueAdMobManager
import com.malik.suhaatech.ads.modules.TrueTrueAdManager
import com.malik.suhaatech.ads.modules.interfaces.TrueAdCallBackInterface

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        TrueTrueAdManager.zShowSimpleNativeAdInAdvance(
            this,
            "ca-app-pub-3940256099942544/2247696110",
            binding.nativeBannerAds
        )
    }

    companion object {
        private var instance: MainActivity? = null
        fun getInstance(): MainActivity? {
            return if (instance == null) MainActivity().also { instance = it } else instance
        }
    }
}