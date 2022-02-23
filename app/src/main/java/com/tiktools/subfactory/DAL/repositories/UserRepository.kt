package com.tiktools.subfactory.DAL.repositories

import com.tiktools.subfactory.DAL.AppDatabase
import com.tiktools.subfactory.DAL.DAO.UserDAO
import com.tiktools.subfactory.models.UserItem
import kotlinx.coroutines.flow.Flow

class UserRepository(private val dbContext : AppDatabase) {
    private val dao : UserDAO get() = dbContext.userDAO()

    fun getUser() : Flow<UserItem>{
        return dao.getUser()
    }

    fun setUser(user : UserItem){
        dao.setUser(user)
    }
}