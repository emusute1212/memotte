package io.github.emusute1212.memotte.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.android.view.edit.EditMemoFragment
import io.github.emusute1212.memotte.android.view.list.MemoListFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val memoListFragment = MemoListFragment()
        val editMemoFragment = EditMemoFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.memo_list_fragment, memoListFragment)
            .add(R.id.edit_fragment, editMemoFragment)
            .commit()
        setContentView(R.layout.activity_main)
    }
}