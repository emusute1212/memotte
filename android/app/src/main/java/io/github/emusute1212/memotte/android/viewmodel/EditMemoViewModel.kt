package io.github.emusute1212.memotte.android.viewmodel

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.usecases.EditMemoUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EditMemoViewModel @Inject constructor(
    private val editMemoUseCase: EditMemoUseCase
) : ViewModel() {
    private var id = MutableStateFlow(INITIALIZE_ID)
    val content = MutableLiveData("")
    private val _message = MutableSharedFlow<Messenger>()
    val message: SharedFlow<Messenger>
        get() = _message
    val isEditing: LiveData<Boolean>
        get() = id.asLiveData(Dispatchers.Default).map {
            it != INITIALIZE_ID
        }

    fun openMemo(memoEntity: MemoEntity) {
        viewModelScope.launch(Dispatchers.Main) {
            id.value = memoEntity.id
            content.value = memoEntity.content
            _message.emit(Messenger.OpenMemo)
        }
    }

    fun submitMemo() {
        val nonNullContent = content.value ?: return
        viewModelScope.launch {
            if (isEditing.value != false) {
                editMemoUseCase.addMemo(nonNullContent)
            } else {
                editMemoUseCase.editMemo(id.value, nonNullContent)
            }
            reset()
            _message.emit(Messenger.SubmitMemo)
        }
    }

    fun deleteMemo() {
        viewModelScope.launch {
            editMemoUseCase.deleteMemo(id.value)
            reset()
            _message.emit(Messenger.DeleteMemo)
        }
    }

    private fun reset() {
        id.value = INITIALIZE_ID
        content.value = ""
    }

    sealed interface Messenger {
        object OpenMemo : Messenger
        object SubmitMemo : Messenger
        object DeleteMemo : Messenger
    }

    companion object {
        private const val INITIALIZE_ID = -1
    }
}