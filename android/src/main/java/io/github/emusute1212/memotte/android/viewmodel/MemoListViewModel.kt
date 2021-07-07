package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.usecases.MemoListUseCase
import kotlinx.coroutines.Dispatchers
import org.threeten.bp.LocalDate
import javax.inject.Inject

@HiltViewModel
class MemoListViewModel @Inject constructor(
    private val memoListUseCase: MemoListUseCase
) : ViewModel() {
    val searchText = MutableLiveData<String>()
    val memos: LiveData<Map<LocalDate, List<MemoEntity>>> by lazy {
        memoListUseCase.getMemos().asLiveData(Dispatchers.IO)
    }
    val filteredMemos = MediatorLiveData<Map<LocalDate, List<MemoEntity>>>()

    init {
        filteredMemos.addSource(memos) {
            filteredMemos.value = combineSearchMemo(memos, searchText)
        }
        filteredMemos.addSource(searchText) {
            filteredMemos.value = combineSearchMemo(memos, searchText)
        }
    }

    private fun combineSearchMemo(
        memos: LiveData<Map<LocalDate, List<MemoEntity>>>,
        searchText: LiveData<String>
    ): Map<LocalDate, List<MemoEntity>> {
        val memosValue = memos.value ?: emptyMap()
        val searchTextValue = searchText.value ?: ""
        return memoListUseCase.searchMemoByText(memosValue, searchTextValue)
    }
}