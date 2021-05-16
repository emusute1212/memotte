package io.github.emusute1212.memotte.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.emusute1212.memotte.android.databinding.FragmentMemoListBinding

class MemoListFragment :Fragment() {
    private lateinit var binding: FragmentMemoListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMemoListBinding.inflate(inflater,container,false)
        return binding.root
    }
}