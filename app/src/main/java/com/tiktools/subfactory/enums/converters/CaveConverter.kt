package com.tiktools.subfactory.enums.converters

import androidx.room.TypeConverter
import com.tiktools.subfactory.enums.CaveType

class CaveConverter {
    @TypeConverter
    fun fromCaveEnum(value : CaveType) : String{
        return value.name
    }

    @TypeConverter
    fun toCaveEnum(value : String) : CaveType{
        return CaveType.valueOf(value)
    }
}