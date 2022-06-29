package com.malik.suhaatech.ads.modules.callbacks

import android.app.Activity
import android.util.Log
import com.malik.suhaatech.ads.modules.TrueError
import com.malik.suhaatech.ads.modules.types.TrueAdsType

abstract class TrueInterCallbacks() {
    var TAG = "TrueInterCallbackss"
    open fun zOnAdFailedToLoad(
        zAdType: TrueAdsType,
        zError: TrueError,
        zActivity: Activity? = null
    ) {

    }

    open fun zOnAddLoaded(
        zAdType: TrueAdsType
    ) {
        Log.d(TAG, "zOnAddLoaded: ")
    }

    open fun zOnAdFailedToShowFullContent(
        zAdType: TrueAdsType,
        zError: TrueError
    ) {
    }

    open fun zOnAddShowed(
        zAdType: TrueAdsType
    ) {
    }

    open fun zOnAddDismissed(
        zAdType: TrueAdsType
    ) {

        Log.d(TAG, "zOnAddDismissed: ")
    }

    open fun zOnAdTimedOut(
        zAdType: TrueAdsType
    ) {

    }
}