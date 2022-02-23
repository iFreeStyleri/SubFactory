package com.tiktools.subfactory.enums.converters

import androidx.room.TypeConverter
import com.tiktools.subfactory.enums.MinesType

class MinesConverter {
    @TypeConverter
    fun fromMineEnum(value : MinesType) : String{
        return value.name
    }
    @TypeConverter
    fun toMineEnum(value : String) : MinesType{
        return MinesType.valueOf(value)
    }
}