package io.github.emusute1212.memotte.android.data.domain

import org.threeten.bp.ZonedDateTime


data class MemoEntity(
    val id: Int,
    val content: String,
    val createOn: ZonedDateTime,
)