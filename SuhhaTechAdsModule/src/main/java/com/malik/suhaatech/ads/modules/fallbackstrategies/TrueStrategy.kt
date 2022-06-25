package com.malik.suhaatech.ads.modules.fallbackstrategies

import com.malik.suhaatech.ads.modules.types.TrueAdPriorityType
import com.malik.suhaatech.ads.modules.types.TrueAdsType

interface TrueStrategy {
    fun zBannerStrategy(
        zGlobalPriority: TrueAdPriorityType,
        zAdsType: TrueAdsType,
    ): TrueAdPriorityType

    fun zNativeAdvancedStrategy(
        zGlobalPriority: TrueAdPriorityType,
        zAdsType: TrueAdsType,
    ): TrueAdPriorityType

    fun zInterstitialStrategy(
        zGlobalPriority: TrueAdPriorityType,
        zAdsType: TrueAdsType,
    ): TrueAdPriorityType

    fun zNativeBannerStrategy(
        zGlobalPriority: TrueAdPriorityType,
        zAdsType: TrueAdsType,
    ): TrueAdPriorityType
}