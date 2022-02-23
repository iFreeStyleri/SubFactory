package com.tiktools.subfactory.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tiktools.subfactory.enums.CaveType


@Entity
data class CaveItem(
    @PrimaryKey(autoGenerate = true) val caveId : Int,
    val minerOwnerId : Int,
    val caveType : CaveType,
    val maxCount : Int,
    val caveProduction : Double
)