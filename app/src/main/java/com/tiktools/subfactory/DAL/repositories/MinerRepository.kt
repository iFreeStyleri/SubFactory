package com.tiktools.subfactory.DAL.repositories

import com.tiktools.subfactory.DAL.AppDatabase
import com.tiktools.subfactory.DAL.DAO.MinerDAO
import com.tiktools.subfactory.models.CardItem
import com.tiktools.subfactory.models.CaveItem
import com.tiktools.subfactory.models.MinerItem
import com.tiktools.subfactory.models.MinerWithCave
import kotlinx.coroutines.flow.Flow

class MinerRepository(private val dbContext : AppDatabase) {

    private val dao : MinerDAO get() = dbContext.minerDAO()

    fun getMiners() : Flow<List<MinerWithCave>> {
        return dao.getMinerWithCave()
    }

    fun insertCaves(vararg caves : CaveItem){
        dao.setCave(*caves)
    }
    fun insertMiners(vararg miners : MinerItem){
        dao.setMiner(*miners)
    }
    fun insertCards(vararg cards : CardItem){
        dao.setCard(*cards)
    }
}