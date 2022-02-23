package com.tiktools.subfactory.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

data class UtilsItem(
    @PrimaryKey(autoGenerate = true) val id : Int,
    val endSearch : Date,
    )
