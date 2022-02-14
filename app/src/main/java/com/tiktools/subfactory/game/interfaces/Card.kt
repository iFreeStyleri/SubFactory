package com.tiktools.subfactory.game.interfaces

import android.view.animation.Animation

interface Card {
    fun getAnimation() : Animation
    fun getValue(value: Int) : Int
}

