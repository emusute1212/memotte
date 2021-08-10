package io.github.emusute1212.memotte.view.edit

import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import io.github.emusute1212.memotte.databinding.FragmentEditMemoBinding
import io.github.emusute1212.memotte.util.autoCleared
import io.github.emusute1212.memotte.viewmodel.EditMemoViewModel
import io.github.emusute1212.memotte.viewmodel.MemoListViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class EditMemoFragment : Fragment() {
    private var binding: FragmentEditMemoBinding by autoCleared()


    private val memoListViewModel: MemoListViewModel by activityViewModels()
    private val editMemoViewModel: EditMemoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditMemoBinding.inflate(inflater, container, false).also {
            it.viewModel = editMemoViewModel
            it.lifecycleOwner = viewLifecycleOwner
        }
        observeMemoListMessage()
        return binding.root
    }

    private fun observeMemoListMessage() {
        memoListViewModel.message
            .onEach { onMemoListMessage(it) }
            .launchIn(lifecycleScope)
    }

    private fun onMemoListMessage(
        message: MemoListViewModel.Messenger
    ): Any = when (message) {
        MemoListViewModel.Messenger.CloseEdit -> {
            closeIme()
        }
        MemoListViewModel.Messenger.OpenEdit -> {
            openIme()
        }
        MemoListViewModel.Messenger.StartSwipeEdit -> {
            closeIme()
        }
    }

    private fun openIme() {
        binding.memoEditText.requestFocus()
        (context?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager)
            .showSoftInput(binding.memoEditText, 0)
    }

    private fun closeIme() {
        binding.memoEditText.clearFocus()
        (context?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager)
            .hideSoftInputFromWindow(binding.root.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }
}