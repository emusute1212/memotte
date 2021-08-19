package io.github.emusute1212.memotte.usecases

import io.github.emusute1212.memotte.data.domain.MemoEntity
import io.github.emusute1212.memotte.data.repository.MemoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.threeten.bp.LocalDate
import javax.inject.Inject

class MemoListUseCase @Inject constructor(
    private val memoRepository: MemoRepository
) {
    fun getMemos(): Flow<Map<LocalDate, List<MemoEntity>>> {
        return memoRepository.loadMemos().map { memos ->
            memos.sortedByDescending {
                it.createOn
            }.groupBy(
                {
                    it.createOn.toLocalDate()
                }, {
                    it
                }
            )
        }
    }

    fun searchMemoByText(
        memos: Map<LocalDate, List<MemoEntity>>,
        searchText: String
    ): Map<LocalDate, List<MemoEntity>> {
        return memos.mapNotNull { memo ->
            memo.value.filter {
                it.content.contains(searchText)
            }.takeIf {
                it.isNotEmpty()
            }?.let {
                memo.key to it
            }
        }.toMap()
    }
}