package io.github.emusute1212.memotte.android.util.bindings

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import io.github.emusute1212.memotte.android.util.getJapaneseWeekName
import io.github.emusute1212.memotte.android.util.toJapaneseString
import org.threeten.bp.LocalDate

@SuppressLint("SetTextI18n")
@BindingAdapter("app:setDateText")
fun TextView.setDateText(date: LocalDate) {
    text = "${date.toJapaneseString()} ${date.getJapaneseWeekName()}"
}