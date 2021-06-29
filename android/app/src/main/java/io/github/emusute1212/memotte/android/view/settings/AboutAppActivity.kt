package io.github.emusute1212.memotte.android.view.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.emusute1212.memotte.android.R

class AboutAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        private fun createIntent(context: Context): Intent {
            return Intent(context, AboutAppActivity::class.java)
        }

        fun startActivity(context: Context) {
            createIntent(context).also {
                context.startActivity(it)
            }
        }
    }
}