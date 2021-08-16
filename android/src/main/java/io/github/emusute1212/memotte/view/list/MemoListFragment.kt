package io.github.emusute1212.memotte.view.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.databinding.FragmentMemoListBinding
import io.github.emusute1212.memotte.util.autoCleared
import io.github.emusute1212.memotte.viewmodel.EditMemoViewModel
import io.github.emusute1212.memotte.viewmodel.MemoListViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class MemoListFragment : Fragment() {
    private var binding: FragmentMemoListBinding by autoCleared()

    private val memoListViewModel: MemoListViewModel by activityViewModels()
    private val editMemoViewModel: EditMemoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMemoListBinding.inflate(inflater, container, false).also {
            it.memoListViewModel = memoListViewModel
            it.editMemoViewModel = editMemoViewModel
            it.lifecycleOwner = viewLifecycleOwner
        }
        observeEditMemoMessage()
        return binding.root
    }

    private fun observeEditMemoMessage() {
        editMemoViewModel.message
            .onEach { onEditMemoMessage(it) }
            .launchIn(lifecycleScope)
    }

    private fun onEditMemoMessage(
        message: EditMemoViewModel.Messenger
    ): Any = when (message) {
        EditMemoViewModel.Messenger.SubmitMemo -> {
            binding.memoList.scrollToPosition(0)
        }
        else -> Unit
    }
}