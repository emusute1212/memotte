package io.github.emusute1212.memotte.view.list

import com.xwray.groupie.databinding.BindableItem
import io.github.emusute1212.memotte.R
import io.github.emusute1212.memotte.data.domain.MemoEntity
import io.github.emusute1212.memotte.databinding.MemoItemViewBinding

class MemoItem(
    private val memoEntity: MemoEntity,
    private val memoClickListener: MemoClickListener
) : BindableItem<MemoItemViewBinding>(
    memoEntity.id.toLong()
) {
    override fun getLayout() = R.layout.memo_item_view
    override fun bind(viewBinding: MemoItemViewBinding, position: Int) {
        viewBinding.entity = memoEntity
        viewBinding.memoClickListener = memoClickListener
    }
}