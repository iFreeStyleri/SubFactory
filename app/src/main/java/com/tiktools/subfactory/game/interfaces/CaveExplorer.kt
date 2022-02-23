package com.tiktools.subfactory.game.interfaces

import androidx.annotation.DrawableRes
import com.tiktools.subfactory.enums.CaveType
import com.tiktools.subfactory.models.CardItem


interface CaveExplorer {
    val cards : List<CardItem>
    val type : CaveType

    @DrawableRes
    fun getImage() : Int
    fun getAmount() : Double
}