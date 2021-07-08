package io.github.emusute1212.memotte.view.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.databinding.FragmentMemoListBinding
import io.github.emusute1212.memotte.viewmodel.EditMemoViewModel
import io.github.emusute1212.memotte.viewmodel.MemoListViewModel

@AndroidEntryPoint
class MemoListFragment : Fragment() {
    private lateinit var binding: FragmentMemoListBinding

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
        return binding.root
    }
}