package io.github.emusute1212.memotte

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.databinding.ActivityMainBinding
import io.github.emusute1212.memotte.view.edit.EditMemoFragment
import io.github.emusute1212.memotte.view.list.MemoListFragment
import io.github.emusute1212.memotte.view.settings.AboutAppActivity
import io.github.emusute1212.memotte.viewmodel.EditMemoViewModel
import io.github.emusute1212.memotte.viewmodel.MemoListViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val memoListViewModel: MemoListViewModel by viewModels()
    private val editMemoViewModel: EditMemoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val memoListFragment = MemoListFragment()
        val editMemoFragment = EditMemoFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.memo_list_fragment, memoListFragment)
            .add(R.id.edit_fragment, editMemoFragment)
            .commit()
        binding = ActivityMainBinding.inflate(layoutInflater)
            .apply {
                this.viewModel = memoListViewModel
                this.lifecycleOwner = this@MainActivity
                setContentView(this.root)
                init()
            }
        observeEditMemoMessage()
        observeMemoListMessage()
    }

    private fun ActivityMainBinding.init() {
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.about_app -> {
                    AboutAppActivity.startActivity(this@MainActivity)
                }
                R.id.license -> {
                    Intent(this@MainActivity, OssLicensesMenuActivity::class.java).also { intent ->
                        startActivity(intent)
                    }
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            return@setNavigationItemSelectedListener true
        }

        appMain.menuButton.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
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
            lifecycleScope.launch {
                editMemoViewModel.submitMemo()
            }
        }
        else -> Unit
    }

    private fun observeEditMemoMessage() {
        editMemoViewModel.message
            .onEach { onEditMemoMessage(it) }
            .launchIn(lifecycleScope)
    }

    private fun onEditMemoMessage(
        message: EditMemoViewModel.Messenger
    ): Any = when (message) {
        EditMemoViewModel.Messenger.DeleteMemo -> {
            binding.appMain.rootContent.transitionToStart()
        }
        EditMemoViewModel.Messenger.OpenMemo -> {
            binding.appMain.rootContent.transitionToEnd()
        }
        EditMemoViewModel.Messenger.SubmitMemo -> {
            binding.appMain.rootContent.transitionToStart()
        }
    }
}