package io.github.emusute1212.memotte.android.view.list

import com.xwray.groupie.databinding.BindableItem
import io.github.emusute1212.memotte.android.R
import io.github.emusute1212.memotte.android.databinding.MemoGroupItemViewBinding
import org.threeten.bp.LocalDate

class MemoGroupItemView(
    private val date: LocalDate
) : BindableItem<MemoGroupItemViewBinding>(
    date.hashCode().toLong()
) {
    override fun getLayout(): Int = R.layout.memo_group_item_view
    override fun bind(viewBinding: MemoGroupItemViewBinding, position: Int) {
        viewBinding.date = date
    }
}