package com.tiktools.subfactory.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class MaterialItem(
    @PrimaryKey(autoGenerate = true) val id : Int,
    val material : String,
    val amount : Long,
    val maxAmount : Long,
    val perPrice : Long
)
