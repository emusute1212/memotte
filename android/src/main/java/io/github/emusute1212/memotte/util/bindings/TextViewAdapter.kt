package io.github.emusute1212.memotte.util.bindings

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import io.github.emusute1212.memotte.util.getJapaneseWeekName
import io.github.emusute1212.memotte.util.toJapaneseString
import org.threeten.bp.LocalDate

@SuppressLint("SetTextI18n")
@BindingAdapter("setDateText")
fun TextView.setDateText(date: LocalDate) {
    text = "${date.toJapaneseString()} ${date.getJapaneseWeekName()}"
}