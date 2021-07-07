package io.github.emusute1212.memotte.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JH\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u001e\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0002R)\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0019"}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/MemoListViewModel;", "Landroidx/lifecycle/ViewModel;", "memoListUseCase", "Lio/github/emusute1212/memotte/android/usecases/MemoListUseCase;", "(Lio/github/emusute1212/memotte/android/usecases/MemoListUseCase;)V", "filteredMemos", "Landroidx/lifecycle/MediatorLiveData;", "", "Lorg/threeten/bp/LocalDate;", "", "Lio/github/emusute1212/memotte/android/data/domain/MemoEntity;", "getFilteredMemos", "()Landroidx/lifecycle/MediatorLiveData;", "memos", "Landroidx/lifecycle/LiveData;", "getMemos", "()Landroidx/lifecycle/LiveData;", "memos$delegate", "Lkotlin/Lazy;", "searchText", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchText", "()Landroidx/lifecycle/MutableLiveData;", "combineSearchMemo", "android_debug"})
public final class MemoListViewModel extends androidx.lifecycle.ViewModel {
    private final io.github.emusute1212.memotte.android.usecases.MemoListUseCase memoListUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchText = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy memos$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> filteredMemos = null;
    
    @javax.inject.Inject()
    public MemoListViewModel(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.usecases.MemoListUseCase memoListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> getMemos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> getFilteredMemos() {
        return null;
    }
    
    private final java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> combineSearchMemo(androidx.lifecycle.LiveData<java.util.Map<org.threeten.bp.LocalDate, java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> memos, androidx.lifecycle.LiveData<java.lang.String> searchText) {
        return null;
    }
}