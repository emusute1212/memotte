package io.github.emusute1212.memotte.android.data.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import io.github.emusute1212.memotte.android.data.databases.converter.LocalDateConverter
import io.github.emusute1212.memotte.android.data.databases.dao.MemoDao
import io.github.emusute1212.memotte.android.data.domain.MemoLocalDbEntity

@Database(entities = [MemoLocalDbEntity::class], version = 1)
@TypeConverters(LocalDateConverter::class)
abstract class MemoDatabase : RoomDatabase() {
    abstract fun userDao(): MemoDao
}