package io.github.emusute1212.memotte

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.view.GravityCompat
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.databinding.ActivityMainBinding
import io.github.emusute1212.memotte.util.SimpleTransitionListener
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
        observeMessage()
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

        // アニメーションが始まるときにIMEを閉じるようにする
        appMain.rootContent.setTransitionListener(object : SimpleTransitionListener {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
                closeIme()
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                if (currentId == R.id.edit_open_end) return
                lifecycleScope.launch {
                    editMemoViewModel.onCloseEdit()
                }
            }
        })
    }

    private fun observeMessage() {
        editMemoViewModel.message
            .onEach { onMessage(it) }
            .launchIn(lifecycleScope)
    }

    private fun onMessage(
        message: EditMemoViewModel.Messenger
    ) = when (message) {
        EditMemoViewModel.Messenger.DeleteMemo -> {
            closeIme()
            binding.appMain.rootContent.transitionToStart()
        }
        EditMemoViewModel.Messenger.OpenMemo -> {
            binding.appMain.rootContent.transitionToEnd()
        }
        EditMemoViewModel.Messenger.SubmitMemo -> {
            binding.appMain.rootContent.transitionToStart()
        }
    }

    private fun closeIme() {
        (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
            .hideSoftInputFromWindow(binding.root.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        binding.root.requestFocus()
    }
}