package io.github.emusute1212.memotte.android.databinding;
import io.github.emusute1212.memotte.android.R;
import io.github.emusute1212.memotte.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AppMainBindingImpl extends AppMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(1, 
            new String[] {"header"},
            new int[] {2},
            new int[] {io.github.emusute1212.memotte.android.R.layout.header});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.content, 3);
        sViewsWithIds.put(R.id.app_bar, 4);
        sViewsWithIds.put(R.id.memo_list_fragment, 5);
        sViewsWithIds.put(R.id.negative_margin, 6);
        sViewsWithIds.put(R.id.touch_block_view, 7);
        sViewsWithIds.put(R.id.edit_fragment_top_negative_margin, 8);
        sViewsWithIds.put(R.id.edit_fragment, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AppMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private AppMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[3]
            , (androidx.fragment.app.FragmentContainerView) bindings[9]
            , (android.widget.Space) bindings[8]
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            , (android.widget.Space) bindings[6]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0]
            , (io.github.emusute1212.memotte.android.databinding.HeaderBinding) bindings[2]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[1]
            , (android.view.View) bindings[7]
            );
        this.rootContent.setTag(null);
        setContainedBinding(this.toolbar);
        this.toolbarLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        toolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbar((io.github.emusute1212.memotte.android.databinding.HeaderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbar(io.github.emusute1212.memotte.android.databinding.HeaderBinding Toolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        io.github.emusute1212.memotte.android.viewmodel.MemoListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.toolbar.setViewModel(viewModel);
        }
        executeBindingsOn(toolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbar
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}