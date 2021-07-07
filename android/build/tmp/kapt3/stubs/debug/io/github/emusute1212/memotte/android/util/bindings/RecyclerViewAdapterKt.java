package io.github.emusute1212.memotte.android.util.bindings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0006H\u0007\u00a8\u0006\n"}, d2 = {"bindMemos", "", "Landroidx/recyclerview/widget/RecyclerView;", "memoClickListener", "Lio/github/emusute1212/memotte/android/view/list/MemoClickListener;", "memos", "", "Lorg/threeten/bp/LocalDate;", "", "Lio/github/emusute1212/memotte/android/data/domain/MemoEntity;", "android_debug"})
public final class RecyclerViewAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:onMemoClick", "app:bindMemos"}, requireAll = true)
    public static final void bindMemos(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindMemos, @org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.view.list.MemoClickListener memoClickListener, @org.jetbrains.annotations.Nullable()
    java.util.Map<org.threeten.bp.LocalDate, ? extends java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> memos) {
    }
}