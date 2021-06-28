package io.github.emusute1212.memotte.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import dagger.hilt.android.AndroidEntryPoint
import io.github.emusute1212.memotte.android.databinding.ActivityMainBinding
import io.github.emusute1212.memotte.android.view.edit.EditMemoFragment
import io.github.emusute1212.memotte.android.view.list.MemoListFragment
import io.github.emusute1212.memotte.android.view.settings.AboutAppActivity


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

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
                setContentView(this.root)
                init()
            }
    }

    private fun ActivityMainBinding.init() {
//        drawerLayout.openDrawer(GravityCompat.START)
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.about_app -> {
                    AboutAppActivity.startActivity(this@MainActivity)
                }
                R.id.license -> {
                    TODO("license")
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            return@setNavigationItemSelectedListener true
        }
    }
}