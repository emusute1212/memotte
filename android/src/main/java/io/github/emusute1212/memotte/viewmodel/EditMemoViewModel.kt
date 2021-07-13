package io.github.emusute1212.memotte.viewmodel

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.emusute1212.memotte.data.domain.MemoEntity
import io.github.emusute1212.memotte.usecases.EditMemoUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
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
    val isEditing: LiveData<Boolean> by lazy {
        id.asLiveData(Dispatchers.Default).map {
            it != INITIALIZE_ID
        }
    }
    private val submitMemoLock = Mutex()

    fun openMemo(memoEntity: MemoEntity) {
        viewModelScope.launch(Dispatchers.Main) {
            id.value = memoEntity.id
            content.value = memoEntity.content
            _message.emit(Messenger.OpenMemo)
        }
    }

    fun submitMemo() {
        viewModelScope.launch {
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

    suspend fun onCloseEdit() = submitMemoLock.withLock(Dispatchers.IO) {
        val nonNullContent = content.value?.takeIf {
            it.isNotEmpty()
        } ?: return
        if (isEditing.value != false) {
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
    }

    companion object {
        private const val INITIALIZE_ID = -1
    }
}