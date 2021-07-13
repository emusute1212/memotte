package io.github.emusute1212.memotte.data.databases.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import io.github.emusute1212.memotte.data.domain.MemoLocalDbEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MemoDao {
    @Query("SELECT * FROM memos")
    fun getAll(): Flow<List<MemoLocalDbEntity>>

    @Insert
    suspend fun insert(memo: MemoLocalDbEntity)

    @Update
    suspend fun update(memo: MemoLocalDbEntity)

    @Query("DELETE FROM memos WHERE id = :id")
    suspend fun delete(id: Int)
}