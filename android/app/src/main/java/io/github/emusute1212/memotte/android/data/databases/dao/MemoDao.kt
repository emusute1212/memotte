package io.github.emusute1212.memotte.android.data.databases.dao

import androidx.room.*
import io.github.emusute1212.memotte.android.data.domain.MemoLocalDbEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MemoDao {
    @Query("SELECT * FROM memos")
    suspend fun getAll(): Flow<List<MemoLocalDbEntity>>

    @Insert
    suspend fun insert(users: MemoLocalDbEntity)

    @Update
    fun update(memo: MemoLocalDbEntity)

    @Delete
    fun delete(memo: MemoLocalDbEntity)
}