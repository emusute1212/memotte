package io.github.emusute1212.memotte.android.view.list

import io.github.emusute1212.memotte.android.data.domain.MemoEntity

fun interface MemoClickListener {
    fun onClickMemo(memoEntity: MemoEntity)
}