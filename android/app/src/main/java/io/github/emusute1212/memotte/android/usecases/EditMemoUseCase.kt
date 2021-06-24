package io.github.emusute1212.memotte.android.usecases

import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.data.repository.MemoRepository
import org.threeten.bp.ZonedDateTime
import javax.inject.Inject

class EditMemoUseCase @Inject constructor(
    private val memoRepository: MemoRepository
) {
    suspend fun addMemo(content: String) {
        val entity = MemoEntity(0, content, ZonedDateTime.now())
        memoRepository.addMemo(entity)
    }

    suspend fun editMemo(id: Int, content: String) {
        val entity = MemoEntity(id, content, ZonedDateTime.now())
        memoRepository.addMemo(entity)
    }

    suspend fun deleteMemo(id: Int) {
        memoRepository.deleteMemo(id)
    }
}