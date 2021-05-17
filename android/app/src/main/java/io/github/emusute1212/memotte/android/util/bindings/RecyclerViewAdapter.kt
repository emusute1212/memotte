package io.github.emusute1212.memotte.android.util.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import io.github.emusute1212.memotte.android.data.domain.MemoEntity
import io.github.emusute1212.memotte.android.view.list.MemoGroupItemView
import io.github.emusute1212.memotte.android.view.list.MemoItemView
import org.threeten.bp.LocalDate

@BindingAdapter("app:bindMemos")
fun RecyclerView.bindMemos(memos: Map<LocalDate, List<MemoEntity>>?) {
    if (memos == null) return
    val sections = memos.map { memo ->
        Section().also { section ->
            section.setHeader(MemoGroupItemView(memo.key))
            section.update(memo.value.map {
                MemoItemView(it)
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