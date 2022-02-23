package com.tiktools.subfactory.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation


data class MinerWithCave(
    @Embedded val miner: MinerItem,
    @Relation( parentColumn = "minerId", entityColumn = "minerOwnerId")
    val cave : CaveItem,
    @Relation( parentColumn = "minerId", entityColumn = "minerOwnerCardId")
    val cards : List<CardItem>
)