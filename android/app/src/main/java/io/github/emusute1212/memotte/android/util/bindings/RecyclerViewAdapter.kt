package io.github.emusute1212.memotte.android.util.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.view.list.MemoClickListener
import io.github.emusute1212.memotte.android.view.list.MemoGroupItem
import io.github.emusute1212.memotte.android.view.list.MemoItem
import org.threeten.bp.LocalDate

@BindingAdapter(
    value = [
        "app:onMemoClick",
        "app:bindMemos"
    ],
    requireAll = true
)
fun RecyclerView.bindMemos(
    memoClickListener: MemoClickListener,
    memos: Map<LocalDate, List<MemoEntity>>?
) {
    if (memos == null) return
    val sections = memos.map { memo ->
        Section().also { section ->
            section.setHeader(MemoGroupItem(memo.key))
            section.update(memo.value.map {
                MemoItem(it, memoClickListener)
            })
        }
    }
    if (adapter == null) {
        GroupAdapter<GroupieViewHolder>().also { groupieAdapter ->
            adapter = groupieAdapter
            groupieAdapter.update(sections)
        }
    } else {
        (adapter as GroupAdapter).update(sections)
    }
}