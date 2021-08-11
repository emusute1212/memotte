package io.github.emusute1212.memotte.util.bindings

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("onGetFocus")
fun View.onGetFocus(listener: OnGetFocusListener) {
    setOnFocusChangeListener { _, hasFocus ->
        if(hasFocus.not()) return@setOnFocusChangeListener
        listener.onGetFocus()
    }
}

fun interface OnGetFocusListener{
    fun onGetFocus()
}