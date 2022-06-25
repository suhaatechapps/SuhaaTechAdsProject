package com.malik.suhaatech.ads.modules.customadview

import android.content.Context
import androidx.core.content.ContextCompat
import com.malik.suhaatech.ads.modules.R

import com.malik.suhaatech.ads.modules.hDp


data class TrueStroke(
    private val zContext: Context,
    var zColor: Int = ContextCompat.getColor(
        zContext,
        R.color.colorPrimaryDark
    ),
    var zWidth: Int = 1,
) {
    init {
        zWidth = hDp(zContext, zWidth).toInt()
    }
}

