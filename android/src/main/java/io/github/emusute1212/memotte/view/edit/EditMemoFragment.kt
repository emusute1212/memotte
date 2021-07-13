package io.github.emusute1212.memotte.view.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import io.github.emusute1212.memotte.databinding.FragmentEditMemoBinding
import io.github.emusute1212.memotte.util.autoCleared
import io.github.emusute1212.memotte.viewmodel.EditMemoViewModel

class EditMemoFragment : Fragment() {
    private var binding: FragmentEditMemoBinding by autoCleared()

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
        return binding.root
    }
}