package io.github.emusute1212.memotte.android.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&\'B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0011\u0010\u001f\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u001eH\u0002J\u0006\u0010%\u001a\u00020\u001eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel;", "Landroidx/lifecycle/ViewModel;", "editMemoUseCase", "Lio/github/emusute1212/memotte/android/usecases/EditMemoUseCase;", "(Lio/github/emusute1212/memotte/android/usecases/EditMemoUseCase;)V", "_message", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger;", "content", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getContent", "()Landroidx/lifecycle/MutableLiveData;", "id", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isEditing", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isEditing$delegate", "Lkotlin/Lazy;", "message", "Lkotlinx/coroutines/flow/SharedFlow;", "getMessage", "()Lkotlinx/coroutines/flow/SharedFlow;", "submitMemoLock", "Lkotlinx/coroutines/sync/Mutex;", "deleteMemo", "", "onCloseEdit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openMemo", "memoEntity", "Lio/github/emusute1212/memotte/android/data/domain/MemoEntity;", "reset", "submitMemo", "Companion", "Messenger", "android_debug"})
public final class EditMemoViewModel extends androidx.lifecycle.ViewModel {
    private final io.github.emusute1212.memotte.android.usecases.EditMemoUseCase editMemoUseCase = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> id;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> content = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger> _message = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy isEditing$delegate = null;
    private final kotlinx.coroutines.sync.Mutex submitMemoLock = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Companion Companion = null;
    private static final int INITIALIZE_ID = -1;
    
    @javax.inject.Inject()
    public EditMemoViewModel(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.usecases.EditMemoUseCase editMemoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEditing() {
        return null;
    }
    
    public final void openMemo(@org.jetbrains.annotations.NotNull()
    io.github.emusute1212.memotte.android.data.domain.MemoEntity memoEntity) {
    }
    
    public final void submitMemo() {
    }
    
    public final void deleteMemo() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object onCloseEdit(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    private final void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger;", "", "DeleteMemo", "OpenMemo", "SubmitMemo", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger$OpenMemo;", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger$SubmitMemo;", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger$DeleteMemo;", "android_debug"})
    public static abstract interface Messenger {
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger$OpenMemo;", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger;", "()V", "android_debug"})
        public static final class OpenMemo implements io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger {
            @org.jetbrains.annotations.NotNull()
            public static final io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger.OpenMemo INSTANCE = null;
            
            private OpenMemo() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger$SubmitMemo;", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger;", "()V", "android_debug"})
        public static final class SubmitMemo implements io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger {
            @org.jetbrains.annotations.NotNull()
            public static final io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger.SubmitMemo INSTANCE = null;
            
            private SubmitMemo() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger$DeleteMemo;", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger;", "()V", "android_debug"})
        public static final class DeleteMemo implements io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger {
            @org.jetbrains.annotations.NotNull()
            public static final io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger.DeleteMemo INSTANCE = null;
            
            private DeleteMemo() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Companion;", "", "()V", "INITIALIZE_ID", "", "android_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}