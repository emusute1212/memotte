package io.github.emusute1212.memotte.android.view.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.android.databinding.FragmentMemoListBinding
import io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel
import javax.inject.Inject

@AndroidEntryPoint
class MemoListFragment : Fragment() {
    private lateinit var binding: FragmentMemoListBinding

    private val memoListViewModel: MemoListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMemoListBinding.inflate(inflater, container, false).also {
            it.viewModel = memoListViewModel
            it.lifecycleOwner = this
        }
        return binding.root
    }
}