package com.tiktools.subfactory.game.interfaces

import android.view.animation.Animation
import androidx.annotation.DrawableRes

interface Card {
    @DrawableRes
    fun getFrame() : Int
    @DrawableRes
    fun getImage() : Int
    fun getValue(value: Int) : Int
}

