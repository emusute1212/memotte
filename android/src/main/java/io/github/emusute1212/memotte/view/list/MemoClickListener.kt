package io.github.emusute1212.memotte.view.list

import io.github.emusute1212.memotte.data.domain.MemoEntity

fun interface MemoClickListener {
    fun onClickMemo(memoEntity: MemoEntity)
}