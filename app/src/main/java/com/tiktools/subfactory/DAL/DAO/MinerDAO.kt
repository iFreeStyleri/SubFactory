package com.tiktools.subfactory.DAL.DAO

import androidx.room.*
import com.tiktools.subfactory.enums.converters.CaveConverter
import com.tiktools.subfactory.enums.converters.MinesConverter
import com.tiktools.subfactory.models.CardItem
import com.tiktools.subfactory.models.CaveItem
import com.tiktools.subfactory.models.MinerItem
import com.tiktools.subfactory.models.MinerWithCave
import kotlinx.coroutines.flow.Flow

@Dao
interface MinerDAO {
     @Transaction
     @Query("SELECT * FROM MinerItem")
     fun getMinerWithCave() : Flow<List<MinerWithCave>>

     @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun setMiner(vararg miner: MinerItem)

     @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun setCave(vararg cave: CaveItem)

     @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun setCard(vararg card : CardItem)
}