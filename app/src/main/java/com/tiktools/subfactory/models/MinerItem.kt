package com.tiktools.subfactory.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tiktools.subfactory.enums.MinesType

@Entity
data class MinerItem(
    @PrimaryKey(autoGenerate = true) val minerId : Int,
    @ColumnInfo(name = "amount") val minerProduction : Double,
    @ColumnInfo(name = "caveAmount") val caveAmount : Int,
    @ColumnInfo(name = "minesType") val minesType: MinesType
)
