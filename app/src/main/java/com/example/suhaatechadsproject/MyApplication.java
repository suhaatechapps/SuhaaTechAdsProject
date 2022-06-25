package com.example.suhaatechadsproject;

import android.app.Application;

import com.malik.suhaatech.ads.modules.TrueAdManager;
import com.malik.suhaatech.ads.modules.TrueConstants;
import com.malik.suhaatech.ads.modules.adlimits.TrueAntiAdLimit;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        TrueAdManager.INSTANCE.zInitializeAds(this);

        if (TrueConstants.INSTANCE.isNetworkAvailable(TrueAdManager.context) &&
                TrueConstants.INSTANCE.isNetworkSpeedHigh()) {
            TrueAntiAdLimit.getInstance()
                    .init(this, "https://suhaatech.com/AdsId/charging_animation_final_hkdsjsdhjgkdhsgjksdh.json");
        }
    }
}
