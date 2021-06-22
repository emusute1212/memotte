package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.android.usecases.EditMemoUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EditMemoViewModel @Inject constructor(
    private val editMemoUseCase: EditMemoUseCase
) : ViewModel() {
    private var id = INITIALIZE_ID
    val content = MutableLiveData("")

    fun submitMemo() {
        val nonNullContent = content.value ?: return
        viewModelScope.launch {
            if (id == INITIALIZE_ID) {
                editMemoUseCase.addMemo(nonNullContent)
            } else {
                editMemoUseCase.editMemo(id, nonNullContent)
            }
            id = INITIALIZE_ID
        }
    }

    companion object {
        private const val INITIALIZE_ID = -1
    }
}