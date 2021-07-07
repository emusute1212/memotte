package io.github.emusute1212.memotte.android.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u0006J:\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/github/emusute1212/memotte/android/usecases/MemoListUseCase;", "", "memoRepository", "Lio/github/emusute1212/memotte/android/data/repository/MemoRepository;", "(Lio/github/emusute1212/memotte/android/data/repository/MemoRepository;)V", "getMemos", "Lkotlinx/coroutines/flow/Flow;", "", "Lorg/threeten/bp/LocalDate;", "", "Lio/github/emusute1212/memotte/android/data/domain/MemoEntity;", "searchMemoByText", "memos", "searchText", "", "android_debug"})
public final class MemoListUseCase {
    private final io.github.emusute1212.memotte.android.data.repository.MemoRepository memoRepository = null;
    
    @javax.inject.Inject()
    public MemoListUseCase(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.data.repository.MemoRepository memoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> getMemos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> searchMemoByText(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.threeten.bp.LocalDate, ? extends java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> memos, @org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
        return null;
    }
}