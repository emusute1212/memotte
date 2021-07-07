package io.github.emusute1212.memotte.android.databinding;
import io.github.emusute1212.memotte.android.R;
import io.github.emusute1212.memotte.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMemoListBindingImpl extends FragmentMemoListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private MemoClickListenerImpl mEditMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener;
    // Inverse Binding Event Handlers

    public FragmentMemoListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentMemoListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.memoList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.memoListViewModel == variableId) {
            setMemoListViewModel((io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel) variable);
        }
        else if (BR.editMemoViewModel == variableId) {
            setEditMemoViewModel((io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMemoListViewModel(@Nullable io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel MemoListViewModel) {
        this.mMemoListViewModel = MemoListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.memoListViewModel);
        super.requestRebind();
    }
    public void setEditMemoViewModel(@Nullable io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel EditMemoViewModel) {
        this.mEditMemoViewModel = EditMemoViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.editMemoViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMemoListViewModelMemos((androidx.lifecycle.LiveData<java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>>) object, fieldId);
            case 1 :
                return onChangeMemoListViewModelFilteredMemos((androidx.lifecycle.MediatorLiveData<java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>>) object, fieldId);
            case 2 :
                return onChangeMemoListViewModelSearchText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMemoListViewModelMemos(androidx.lifecycle.LiveData<java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> MemoListViewModelMemos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMemoListViewModelFilteredMemos(androidx.lifecycle.MediatorLiveData<java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> MemoListViewModelFilteredMemos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMemoListViewModelSearchText(androidx.lifecycle.MutableLiveData<java.lang.String> MemoListViewModelSearchText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> memoListViewModelFilteredMemosGetValue = null;
        androidx.lifecycle.LiveData<java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> memoListViewModelMemos = null;
        androidx.lifecycle.MediatorLiveData<java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>>> memoListViewModelFilteredMemos = null;
        java.lang.String memoListViewModelSearchTextGetValue = null;
        int memoListViewModelSearchTextLength = 0;
        io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel memoListViewModel = mMemoListViewModel;
        java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> memoListViewModelSearchTextLengthInt0MemoListViewModelMemosMemoListViewModelFilteredMemos = null;
        java.util.Map<org.threeten.bp.LocalDate,java.util.List<io.github.emusute1212.memotte.android.data.domain.MemoEntity>> memoListViewModelMemosGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> memoListViewModelSearchText = null;
        boolean memoListViewModelSearchTextLengthInt0 = false;
        io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel editMemoViewModel = mEditMemoViewModel;
        io.github.emusute1212.memotte.android.view.list.MemoClickListener editMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener = null;

        if ((dirtyFlags & 0x3fL) != 0) {



                if (memoListViewModel != null) {
                    // read memoListViewModel.searchText
                    memoListViewModelSearchText = memoListViewModel.getSearchText();
                }
                updateLiveDataRegistration(2, memoListViewModelSearchText);
                if (editMemoViewModel != null) {
                    // read editMemoViewModel::openMemo
                    editMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener = (((mEditMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener == null) ? (mEditMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener = new MemoClickListenerImpl()) : mEditMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener).setValue(editMemoViewModel));
                }


                if (memoListViewModelSearchText != null) {
                    // read memoListViewModel.searchText.getValue()
                    memoListViewModelSearchTextGetValue = memoListViewModelSearchText.getValue();
                }


                if (memoListViewModelSearchTextGetValue != null) {
                    // read memoListViewModel.searchText.getValue().length()
                    memoListViewModelSearchTextLength = memoListViewModelSearchTextGetValue.length();
                }


                // read memoListViewModel.searchText.getValue().length() == 0
                memoListViewModelSearchTextLengthInt0 = (memoListViewModelSearchTextLength) == (0);
            if((dirtyFlags & 0x3fL) != 0) {
                if(memoListViewModelSearchTextLengthInt0) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (memoListViewModel != null) {
                    // read memoListViewModel.memos
                    memoListViewModelMemos = memoListViewModel.getMemos();
                }
                updateLiveDataRegistration(0, memoListViewModelMemos);


                if (memoListViewModelMemos != null) {
                    // read memoListViewModel.memos.getValue()
                    memoListViewModelMemosGetValue = memoListViewModelMemos.getValue();
                }
        }
        if ((dirtyFlags & 0x40L) != 0) {

                if (memoListViewModel != null) {
                    // read memoListViewModel.filteredMemos
                    memoListViewModelFilteredMemos = memoListViewModel.getFilteredMemos();
                }
                updateLiveDataRegistration(1, memoListViewModelFilteredMemos);


                if (memoListViewModelFilteredMemos != null) {
                    // read memoListViewModel.filteredMemos.getValue()
                    memoListViewModelFilteredMemosGetValue = memoListViewModelFilteredMemos.getValue();
                }
        }

        if ((dirtyFlags & 0x3fL) != 0) {

                // read memoListViewModel.searchText.getValue().length() == 0 ? memoListViewModel.memos.getValue() : memoListViewModel.filteredMemos.getValue()
                memoListViewModelSearchTextLengthInt0MemoListViewModelMemosMemoListViewModelFilteredMemos = ((memoListViewModelSearchTextLengthInt0) ? (memoListViewModelMemosGetValue) : (memoListViewModelFilteredMemosGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x3fL) != 0) {
            // api target 1

            io.github.emusute1212.memotte.android.util.bindings.RecyclerViewAdapterKt.bindMemos(this.memoList, (io.github.emusute1212.memotte.android.view.list.MemoClickListener)editMemoViewModelOpenMemoIoGithubEmusute1212MemotteAndroidViewListMemoClickListener, memoListViewModelSearchTextLengthInt0MemoListViewModelMemosMemoListViewModelFilteredMemos);
        }
    }
    // Listener Stub Implementations
    public static class MemoClickListenerImpl implements io.github.emusute1212.memotte.android.view.list.MemoClickListener{
        private io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel value;
        public MemoClickListenerImpl setValue(io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClickMemo(io.github.emusute1212.memotte.android.data.domain.MemoEntity arg0) {
            this.value.openMemo(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): memoListViewModel.memos
        flag 1 (0x2L): memoListViewModel.filteredMemos
        flag 2 (0x3L): memoListViewModel.searchText
        flag 3 (0x4L): memoListViewModel
        flag 4 (0x5L): editMemoViewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): memoListViewModel.searchText.getValue().length() == 0 ? memoListViewModel.memos.getValue() : memoListViewModel.filteredMemos.getValue()
        flag 7 (0x8L): memoListViewModel.searchText.getValue().length() == 0 ? memoListViewModel.memos.getValue() : memoListViewModel.filteredMemos.getValue()
    flag mapping end*/
    //end
}