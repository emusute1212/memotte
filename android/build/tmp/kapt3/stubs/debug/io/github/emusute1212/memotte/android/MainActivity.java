package io.github.emusute1212.memotte.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\f\u0010\u0019\u001a\u00020\u0011*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lio/github/emusute1212/memotte/android/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lio/github/emusute1212/memotte/android/databinding/ActivityMainBinding;", "editMemoViewModel", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel;", "getEditMemoViewModel", "()Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel;", "editMemoViewModel$delegate", "Lkotlin/Lazy;", "memoListViewModel", "Lio/github/emusute1212/memotte/android/viewmodel/MemoListViewModel;", "getMemoListViewModel", "()Lio/github/emusute1212/memotte/android/viewmodel/MemoListViewModel;", "memoListViewModel$delegate", "closeIme", "", "observeMessage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessage", "message", "Lio/github/emusute1212/memotte/android/viewmodel/EditMemoViewModel$Messenger;", "init", "android_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.github.emusute1212.memotte.android.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy memoListViewModel$delegate = null;
    private final kotlin.Lazy editMemoViewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel getMemoListViewModel() {
        return null;
    }
    
    private final io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel getEditMemoViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init(io.github.emusute1212.memotte.android.databinding.ActivityMainBinding $this$init) {
    }
    
    private final void observeMessage() {
    }
    
    private final void onMessage(io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel.Messenger message) {
    }
    
    private final void closeIme() {
    }
}