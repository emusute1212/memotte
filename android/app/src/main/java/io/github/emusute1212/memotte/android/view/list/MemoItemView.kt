package io.github.emusute1212.memotte.android.view.list

import com.xwray.groupie.databinding.BindableItem
import io.github.emusute1212.memotte.android.R
import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.databinding.MemoItemViewBinding

class MemoItemView(
    private val memoEntity: MemoEntity
) : BindableItem<MemoItemViewBinding>(
    memoEntity.id.toLong()
) {
    override fun getLayout() = R.layout.memo_item_view
    override fun bind(viewBinding: MemoItemViewBinding, position: Int) {
        viewBinding.entity = memoEntity
    }
}