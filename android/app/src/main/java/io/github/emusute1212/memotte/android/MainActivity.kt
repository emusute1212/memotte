package io.github.emusute1212.memotte.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.android.databinding.ActivityMainBinding
import io.github.emusute1212.memotte.android.view.edit.EditMemoFragment
import io.github.emusute1212.memotte.android.view.list.MemoListFragment
import io.github.emusute1212.memotte.android.view.settings.AboutAppActivity
import io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val memoListViewModel: MemoListViewModel by viewModels()

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
        appMain.toolbar.menuButton.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}