package io.github.emusute1212.memotte.view.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.util.Linkify
import androidx.appcompat.app.AppCompatActivity
import io.github.emusute1212.memotte.android.databinding.ActivityAboutAppBinding

class AboutAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        ActivityAboutAppBinding.inflate(layoutInflater)
            .apply {
                setContentView(this.root)
                init()
            }
    }

    private fun ActivityAboutAppBinding.init() {
        appVersion.text = packageManager
            .getPackageInfo(packageName, 0)
            .versionName

        Linkify.addLinks(
            appAuthor,
            PATTERN,
            MY_PAGE_URL,
            null
        ) { _, _ ->
            MY_PAGE_URL
        }
    }

    companion object {
        private const val MY_PAGE_URL = "https://www.emusute.com/"
        private val PATTERN = "Yosuke Miyanishi".toPattern()

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