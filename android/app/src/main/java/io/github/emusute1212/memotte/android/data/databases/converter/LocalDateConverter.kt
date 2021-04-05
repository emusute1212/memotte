package io.github.emusute1212.memotte.android.data.databases.converter

import androidx.room.TypeConverter
import org.threeten.bp.LocalDate

class LocalDateConverter {
    @TypeConverter
    fun fromLocalDate(value: String): LocalDate {
        return LocalDate.parse(value)
    }

    @TypeConverter
    fun toLocalDate(date: LocalDate): String {
        return date.toString()
    }
}