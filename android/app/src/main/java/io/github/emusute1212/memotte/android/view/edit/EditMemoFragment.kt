package io.github.emusute1212.memotte.android.view.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import io.github.emusute1212.memotte.android.databinding.FragmentEditMemoBinding
import io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel

class EditMemoFragment : Fragment() {
    private lateinit var binding: FragmentEditMemoBinding

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