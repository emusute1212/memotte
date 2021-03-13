package io.github.emusute1212.memotte.android.data.dao

import androidx.room.*
import io.github.emusute1212.memotte.android.data.domain.MemoLocalDbEntity

@Dao
interface MemoDao {
    @Query("SELECT * FROM memos")
    suspend fun getAll(): List<MemoLocalDbEntity>

    @Insert
    suspend fun insert(users: MemoLocalDbEntity)

    @Update
    fun update(memo: MemoLocalDbEntity)

    @Delete
    fun delete(memo: MemoLocalDbEntity)
}