package com.tiktools.subfactory.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class UserItem (
    @PrimaryKey(autoGenerate = true) val id : Int,
    val coins : Long,
    val expLvl : Int,
    val exp : Long
        )