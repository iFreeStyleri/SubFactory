package com.tiktools.subfactory.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CardItem (
    @PrimaryKey(autoGenerate = true) val cardId : Int,
    val seed : Int,
    val minerOwnerCardId : Int,
)