package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.android.usecases.EditMemoUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EditMemoViewModel @Inject constructor(
    private val editMemoUseCase: EditMemoUseCase
) : ViewModel() {
    private var id = INITIALIZE_ID
    val content = MutableLiveData("")
    private val _message = MutableSharedFlow<Messenger>()
    val message: SharedFlow<Messenger>
        get() = _message

    fun submitMemo() {
        val nonNullContent = content.value ?: return
        viewModelScope.launch {
            if (id == INITIALIZE_ID) {
                editMemoUseCase.addMemo(nonNullContent)
            } else {
                editMemoUseCase.editMemo(id, nonNullContent)
            }
            reset()
            _message.emit(Messenger.SubmitMemo)
        }
    }

    fun deleteMemo() {
        viewModelScope.launch {
            editMemoUseCase.deleteMemo(id)
            reset()
            _message.emit(Messenger.DeleteMemo)
        }
    }

    private fun reset() {
        id = INITIALIZE_ID
        content.value = ""
    }

    sealed interface Messenger {
        object SubmitMemo : Messenger
        object DeleteMemo : Messenger
    }

    companion object {
        private const val INITIALIZE_ID = -1
    }
}