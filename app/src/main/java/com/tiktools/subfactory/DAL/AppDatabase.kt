package com.tiktools.subfactory.DAL

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tiktools.subfactory.DAL.DAO.MinerDAO
import com.tiktools.subfactory.DAL.DAO.UserDAO
import com.tiktools.subfactory.enums.converters.CaveConverter
import com.tiktools.subfactory.enums.converters.MinesConverter
import com.tiktools.subfactory.models.CardItem
import com.tiktools.subfactory.models.CaveItem
import com.tiktools.subfactory.models.MinerItem
import com.tiktools.subfactory.models.UserItem

@Database(
    entities = [
        MinerItem::class,
        CaveItem::class,
        UserItem::class,
        CardItem::class
               ], version = 1, exportSchema = false)
@TypeConverters(MinesConverter::class, CaveConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDAO() : UserDAO
    abstract fun minerDAO() : MinerDAO
}