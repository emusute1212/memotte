package io.github.emusute1212.memotte.android.data.repository

import androidx.annotation.WorkerThread
import io.github.emusute1212.memotte.android.data.databases.MemoDatabase
import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.data.domain.toMemoEntity
import io.github.emusute1212.memotte.android.data.domain.toMemoLocalDbEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MemoRepository @Inject constructor(
    private val database: MemoDatabase
) {
    @WorkerThread
    suspend fun loadMemos(): Flow<List<MemoEntity>> {
        return database.userDao().getAll().map { memos ->
            memos.map {
                it.toMemoEntity()
            }
        }
    }

    @WorkerThread
    suspend fun addMemo(memoEntity: MemoEntity) {
        return database.userDao().insert(memoEntity.toMemoLocalDbEntity())
    }

    @WorkerThread
    suspend fun updateMemo(memoEntity: MemoEntity) {
        return database.userDao().update(memoEntity.toMemoLocalDbEntity())
    }

    @WorkerThread
    suspend fun deleteMemo(memoEntity: MemoEntity) {
        database.userDao().delete(memoEntity.toMemoLocalDbEntity())
    }
}