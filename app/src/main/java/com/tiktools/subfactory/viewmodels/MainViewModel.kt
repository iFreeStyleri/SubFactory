package com.tiktools.subfactory.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.tiktools.subfactory.DAL.AppDatabase
import com.tiktools.subfactory.enums.converters.CaveConverter
import com.tiktools.subfactory.enums.converters.MinesConverter

class MainViewModel : ViewModel() {
    lateinit var appDb : AppDatabase
    fun init(context : Context){
        appDb = Room.databaseBuilder(context, AppDatabase::class.java, "subFactory")
            .build()
    }
}