package io.github.emusute1212.memotte.android.data.domain

import java.time.LocalDate

data class MemoEntity(
    val id: Int,
    val content: String,
    val createOn: LocalDate,
)