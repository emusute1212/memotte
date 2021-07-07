package io.github.emusute1212.memotte.android.util

import org.threeten.bp.DayOfWeek
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter

fun LocalDate.toJapaneseString(): String {
    // 今年のデータは年を入れない
    return if (year == LocalDate.now().year) {
        format(DateTimeFormatter.ofPattern("MM月dd日"))
    } else {
        format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"))
    }
}

fun LocalDate.getJapaneseWeekName(): String {
    return when (dayOfWeek) {
        DayOfWeek.MONDAY -> "月曜日"
        DayOfWeek.TUESDAY -> "火曜日"
        DayOfWeek.WEDNESDAY -> "水曜日"
        DayOfWeek.THURSDAY -> "木曜日"
        DayOfWeek.FRIDAY -> "金曜日"
        DayOfWeek.SATURDAY -> "土曜日"
        DayOfWeek.SUNDAY -> "日曜日"
        else -> ""
    }
}