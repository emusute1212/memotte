package io.github.emusute1212.memotte.android.usecases

import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.data.repository.MemoRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MemoListUseCase @Inject constructor(
    private val memoRepository: MemoRepository
) {
    suspend fun getMemos(): Flow<List<MemoEntity>> {
        return memoRepository.loadMemos()
    }
}