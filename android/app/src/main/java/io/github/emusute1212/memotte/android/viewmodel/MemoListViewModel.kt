package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.android.data.repository.MemoRepository
import javax.inject.Inject

@HiltViewModel
class MemoListViewModel @Inject constructor(
    private val repository: MemoRepository
) : ViewModel() {
}