package io.github.emusute1212.memotte.data.databases.converter

import androidx.room.TypeConverter
import org.threeten.bp.ZonedDateTime

class ZonedDateTimeConverter {
    @TypeConverter
    fun fromZonedDateTime(value: String): ZonedDateTime {
        return ZonedDateTime.parse(value)
    }

    @TypeConverter
    fun toZonedDateTime(date: ZonedDateTime): String {
        return date.toString()
    }
}