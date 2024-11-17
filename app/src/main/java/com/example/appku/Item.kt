package com.example.appku

import android.icu.text.CaseMap.Title
import androidx.annotation.DrawableRes

data class Item(
    val title: String,
    @DrawableRes val image: Int
)
