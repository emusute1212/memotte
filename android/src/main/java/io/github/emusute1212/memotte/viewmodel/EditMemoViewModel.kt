package io.github.emusute1212.memotte.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.data.domain.MemoEntity
import io.github.emusute1212.memotte.usecases.EditMemoUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import javax.inject.Inject

@HiltViewModel
class EditMemoViewModel @Inject constructor(
    private val editMemoUseCase: EditMemoUseCase
) : ViewModel() {
    private var id = MutableStateFlow(INITIALIZE_ID)
    val content = MutableStateFlow("")
    private val _message = MutableSharedFlow<Messenger>()
    val message: SharedFlow<Messenger>
        get() = _message
    val isEditing: StateFlow<Boolean> = id.map {
        it != INITIALIZE_ID
    }.stateIn(viewModelScope, SharingStarted.Lazily, false)
    private val submitMemoLock = Mutex()

    fun onClickMemo(memoEntity: MemoEntity) {
        viewModelScope.launch(Dispatchers.Main) {
            id.value = memoEntity.id
            content.value = memoEntity.content
            _message.emit(Messenger.OpenMemo)
        }
    }

    fun onSubmitMemo() {
        viewModelScope.launch {
            _message.emit(Messenger.SubmitMemo)
        }
    }

    fun onDeleteMemo() {
        viewModelScope.launch {
            editMemoUseCase.deleteMemo(id.value)
            reset()
            _message.emit(Messenger.DeleteMemo)
        }
    }

    fun onClickMemoEditText(){
        viewModelScope.launch {
            _message.emit(Messenger.ClickEditText)
        }
    }

    suspend fun submitMemo() = submitMemoLock.withLock(Dispatchers.IO) {
        val nonNullContent = content.value.takeIf {
            it.isNotEmpty()
        } ?: return
        if (isEditing.value) {
            editMemoUseCase.editMemo(id.value, nonNullContent)
        } else {
            editMemoUseCase.addMemo(nonNullContent)
        }
        reset()
    }

    private fun reset() {
        id.value = INITIALIZE_ID
        content.value = ""
    }

    sealed interface Messenger {
        object OpenMemo : Messenger
        object SubmitMemo : Messenger
        object DeleteMemo : Messenger
        object ClickEditText: Messenger
    }

    companion object {
        private const val INITIALIZE_ID = -1
    }
}