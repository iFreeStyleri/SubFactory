package com.tiktools.subfactory.game.model

import android.view.animation.Animation
import androidx.annotation.DrawableRes
import com.tiktools.subfactory.game.interfaces.Card
import com.tiktools.subfactory.models.CardItem

class Card(private val card : CardItem) : Card{

    init{

    }

    @DrawableRes
    override fun getFrame(): Int {
        TODO("Not yet implemented")
    }

    override fun getImage(): Int {
        TODO("Not yet implemented")
    }

    override fun getValue(value: Int): Int {
        TODO("Not yet implemented")
    }

}