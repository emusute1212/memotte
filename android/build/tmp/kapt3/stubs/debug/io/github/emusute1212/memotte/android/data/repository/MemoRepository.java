package io.github.emusute1212.memotte.android.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u0007J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lio/github/emusute1212/memotte/android/data/repository/MemoRepository;", "", "database", "Lio/github/emusute1212/memotte/android/data/databases/MemoDatabase;", "(Lio/github/emusute1212/memotte/android/data/databases/MemoDatabase;)V", "addMemo", "", "memoEntity", "Lio/github/emusute1212/memotte/android/data/domain/MemoEntity;", "(Lio/github/emusute1212/memotte/android/data/domain/MemoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMemo", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMemos", "Lkotlinx/coroutines/flow/Flow;", "", "updateMemo", "android_debug"})
@javax.inject.Singleton()
public final class MemoRepository {
    private final io.github.emusute1212.memotte.android.data.databases.MemoDatabase database = null;
    
    @javax.inject.Inject()
    public MemoRepository(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.data.databases.MemoDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public final kotlinx.coroutines.flow.Flow<java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> loadMemos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object addMemo(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.data.domain.MemoEntity memoEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object updateMemo(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.data.domain.MemoEntity memoEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object deleteMemo(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
}