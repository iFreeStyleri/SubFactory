package com.tiktools.subfactory.game.model

import androidx.annotation.DrawableRes
import com.tiktools.subfactory.R
import com.tiktools.subfactory.enums.CaveType
import com.tiktools.subfactory.game.interfaces.Card
import com.tiktools.subfactory.game.interfaces.CaveExplorer
import com.tiktools.subfactory.models.CardItem
import com.tiktools.subfactory.models.CaveItem
import com.tiktools.subfactory.models.MinerWithCave


class Cave(private var miner : MinerWithCave) : CaveExplorer {

    override val type : CaveType get() = miner.cave.caveType
    override val cards : List<CardItem> get() = miner.cards

    @DrawableRes
    override fun getImage(): Int {
        return when(type){
            CaveType.IRON ->{ R.drawable.iron_cave}
            CaveType.CARBON -> { R.drawable.carbon_back}
            CaveType.COPPER -> { R.drawable.iron_cave}
        }
    }

    override fun getAmount(): Double {
        return miner.miner.minerProduction + miner.cave.caveProduction
    }

    private fun getValue(){

    }
}