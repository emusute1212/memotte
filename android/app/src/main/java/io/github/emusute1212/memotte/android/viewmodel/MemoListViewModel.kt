package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.android.data.repository.MemoRepository
import io.github.emusute1212.memotte.android.usecases.MemoListUseCase
import javax.inject.Inject

@HiltViewModel
class MemoListViewModel @Inject constructor(
    private val memoListUseCase: MemoListUseCase
) : ViewModel() {
}