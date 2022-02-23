package com.tiktools.subfactory.DAL.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tiktools.subfactory.models.UserItem
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setUser(user : UserItem)

    @Query("SELECT * FROM UserItem WHERE id = 1")
    fun getUser() : Flow<UserItem>
}