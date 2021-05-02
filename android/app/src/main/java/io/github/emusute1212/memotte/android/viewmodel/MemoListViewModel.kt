package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
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
    val memos: LiveData<Map<LocalDate, List<MemoEntity>>> by lazy {
        memoListUseCase.getMemos().asLiveData(Dispatchers.IO)
    }
}