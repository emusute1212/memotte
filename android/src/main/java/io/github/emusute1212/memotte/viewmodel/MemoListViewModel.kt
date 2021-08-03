package io.github.emusute1212.memotte.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.data.domain.MemoEntity
import io.github.emusute1212.memotte.usecases.MemoListUseCase
import kotlinx.coroutines.flow.*
import org.threeten.bp.LocalDate
import javax.inject.Inject

@HiltViewModel
class MemoListViewModel @Inject constructor(
    private val memoListUseCase: MemoListUseCase
) : ViewModel() {
    val searchText = MutableStateFlow("")
    val memos: StateFlow<Map<LocalDate, List<MemoEntity>>> =
        memoListUseCase.getMemos().stateIn(viewModelScope, SharingStarted.Lazily, emptyMap())

    val filteredMemos: StateFlow<Map<LocalDate, List<MemoEntity>>> =
        memos.combine(searchText) { memosValue, searchTextValue ->
            memoListUseCase.searchMemoByText(memosValue, searchTextValue)
        }.stateIn(viewModelScope, SharingStarted.Lazily, emptyMap())
}