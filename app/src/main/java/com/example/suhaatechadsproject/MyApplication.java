package com.example.suhaatechadsproject;

import android.app.Application;

import com.malik.suhaatech.ads.modules.TrueTrueAdManager;
import com.malik.suhaatech.ads.modules.TrueConstants;
import com.malik.suhaatech.ads.modules.adlimits.TrueAntiAdLimit;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        TrueTrueAdManager.INSTANCE.zInitializeAds(this);
        try {
            if (TrueConstants.INSTANCE.isNetworkAvailable(TrueTrueAdManager.context) &&
                    TrueConstants.INSTANCE.isNetworkSpeedHigh()) {
                TrueAntiAdLimit.getInstance()
                        .init(this, "https://suhaatech.com/AdsId/testads.json");
            }
        } catch (Exception ignored) {
        }
    }
}
