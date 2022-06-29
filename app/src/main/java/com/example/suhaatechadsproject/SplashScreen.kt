package com.example.suhaatechadsproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.suhaatechadsproject.databinding.ActivitySplashScreenBinding
import com.malik.suhaatech.ads.modules.TrueAdMobManager
import com.malik.suhaatech.ads.modules.TrueConstants
import com.malik.suhaatech.ads.modules.TrueAdManager
import com.malik.suhaatech.ads.modules.database.TrueZSPRepository
import com.malik.suhaatech.ads.modules.interfaces.TrueAdCallBackInterface

class SplashScreen : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    private var zAdMobManager: TrueAdMobManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        zAdMobManager = TrueAdMobManager(this)
        Handler(Looper.getMainLooper()).postDelayed({

            if (TrueConstants.isNetworkAvailable(this@SplashScreen) && TrueConstants.isNetworkSpeedHigh()) {
                binding.splashProgress.visibility = View.GONE
                TrueAdManager.zShowInterstitial(
                    this,
                    "ca-app-pub-3940256099942544/1033173712",
                    object : TrueAdCallBackInterface {
                        override fun onShowAdComplete() {
                            if (TrueZSPRepository.getIfAdAvailable(this@SplashScreen)) {
                                startActivity(
                                    Intent(
                                        this@SplashScreen,
                                        MainActivity::class.java
                                    )
                                )
                            } else {
                                startActivity(
                                    Intent(
                                        this@SplashScreen,
                                        MainActivity::class.java
                                    )
                                )
                            }
                        }
                    })
            } else {
                startActivity(
                    Intent(
                        this@SplashScreen,
                        MainActivity::class.java
                    )
                )
            }
        }, 4000)

        TrueAdManager.zLoadInterstitialInAdvance(
            this,
            "ca-app-pub-3940256099942544/1033173712"
        )

        TrueAdManager.zLoadSimpleNativeAdInAdvance(
            this,
            "ca-app-pub-3940256099942544/2247696110"
        )
    }

    companion object {
        private var instance: SplashScreen? = null
        fun getInstance(): SplashScreen? {
            return if (instance == null) SplashScreen().also { instance = it } else instance
        }
    }
}