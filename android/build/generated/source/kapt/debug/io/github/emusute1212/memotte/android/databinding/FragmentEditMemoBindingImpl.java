package io.github.emusute1212.memotte.android.databinding;
import io.github.emusute1212.memotte.android.R;
import io.github.emusute1212.memotte.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditMemoBindingImpl extends FragmentEditMemoBinding implements io.github.emusute1212.memotte.android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bar, 4);
        sViewsWithIds.put(R.id.title_icon, 5);
        sViewsWithIds.put(R.id.title_label, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.content.getValue()
            //         is viewModel.content.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.content
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelContent = null;
            // viewModel.content != null
            boolean viewModelContentJavaLangObjectNull = false;
            // viewModel
            io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.content.getValue()
            java.lang.String viewModelContentGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelContent = viewModel.getContent();

                viewModelContentJavaLangObjectNull = (viewModelContent) != (null);
                if (viewModelContentJavaLangObjectNull) {




                    viewModelContent.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentEditMemoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentEditMemoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.view.View) bindings[4]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.Button) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.deleteButton.setTag(null);
        this.doneButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new io.github.emusute1212.memotte.android.generated.callback.OnClickListener(this, 2);
        mCallback1 = new io.github.emusute1212.memotte.android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsEditing((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelContent((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsEditing(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsEditing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContent(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.Boolean viewModelIsEditingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditingGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsEditing = null;
        int viewModelContentLength = 0;
        boolean viewModelContentLengthInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelContent = null;
        int viewModelIsEditingViewVISIBLEViewGONE = 0;
        int viewModelContentLengthInt0ViewINVISIBLEViewVISIBLE = 0;
        java.lang.String viewModelContentGetValue = null;
        io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEditing
                        viewModelIsEditing = viewModel.isEditing();
                    }
                    updateLiveDataRegistration(0, viewModelIsEditing);


                    if (viewModelIsEditing != null) {
                        // read viewModel.isEditing.getValue()
                        viewModelIsEditingGetValue = viewModelIsEditing.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditing.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEditingGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditing.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsEditingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.content
                        viewModelContent = viewModel.getContent();
                    }
                    updateLiveDataRegistration(1, viewModelContent);


                    if (viewModelContent != null) {
                        // read viewModel.content.getValue()
                        viewModelContentGetValue = viewModelContent.getValue();
                    }


                    if (viewModelContentGetValue != null) {
                        // read viewModel.content.getValue().length()
                        viewModelContentLength = viewModelContentGetValue.length();
                    }


                    // read viewModel.content.getValue().length() == 0
                    viewModelContentLengthInt0 = (viewModelContentLength) == (0);
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelContentLengthInt0) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.content.getValue().length() == 0 ? View.INVISIBLE : View.VISIBLE
                    viewModelContentLengthInt0ViewINVISIBLEViewVISIBLE = ((viewModelContentLengthInt0) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.deleteButton.setOnClickListener(mCallback2);
            this.doneButton.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.deleteButton.setVisibility(viewModelIsEditingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.doneButton.setVisibility(viewModelContentLengthInt0ViewINVISIBLEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelContentGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.deleteMemo();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                io.github.emusute1212.memotte.android.viewmodel.EditMemoViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.submitMemo();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isEditing
        flag 1 (0x2L): viewModel.content
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditing.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditing.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.content.getValue().length() == 0 ? View.INVISIBLE : View.VISIBLE
        flag 7 (0x8L): viewModel.content.getValue().length() == 0 ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}