package io.github.emusute1212.memotte.android.databinding;
import io.github.emusute1212.memotte.android.R;
import io.github.emusute1212.memotte.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MemoItemViewBindingImpl extends MemoItemViewBinding implements io.github.emusute1212.memotte.android.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MemoItemViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private MemoItemViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new io.github.emusute1212.memotte.android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.memoClickListener == variableId) {
            setMemoClickListener((io.github.emusute1212.memotte.android.view.list.MemoClickListener) variable);
        }
        else if (BR.entity == variableId) {
            setEntity((io.github.emusute1212.memotte.android.data.domain.MemoEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMemoClickListener(@Nullable io.github.emusute1212.memotte.android.view.list.MemoClickListener MemoClickListener) {
        this.mMemoClickListener = MemoClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.memoClickListener);
        super.requestRebind();
    }
    public void setEntity(@Nullable io.github.emusute1212.memotte.android.data.domain.MemoEntity Entity) {
        this.mEntity = Entity;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.entity);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        io.github.emusute1212.memotte.android.view.list.MemoClickListener memoClickListener = mMemoClickListener;
        io.github.emusute1212.memotte.android.data.domain.MemoEntity entity = mEntity;
        java.lang.String entityContent = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (entity != null) {
                    // read entity.content
                    entityContent = entity.getContent();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, entityContent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // memoClickListener != null
        boolean memoClickListenerJavaLangObjectNull = false;
        // memoClickListener
        io.github.emusute1212.memotte.android.view.list.MemoClickListener memoClickListener = mMemoClickListener;
        // entity
        io.github.emusute1212.memotte.android.data.domain.MemoEntity entity = mEntity;



        memoClickListenerJavaLangObjectNull = (memoClickListener) != (null);
        if (memoClickListenerJavaLangObjectNull) {



            memoClickListener.onClickMemo(entity);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): memoClickListener
        flag 1 (0x2L): entity
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}