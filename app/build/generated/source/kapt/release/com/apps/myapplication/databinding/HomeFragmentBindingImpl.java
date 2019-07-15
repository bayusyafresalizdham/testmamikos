package com.apps.myapplication.databinding;
import com.apps.myapplication.R;
import com.apps.myapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeFragmentBindingImpl extends HomeFragmentBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeFragmentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private HomeFragmentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.support.v7.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        this.recyclerviewMain.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewModel((com.apps.myapplication.mvvm.mainhome.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.apps.myapplication.mvvm.mainhome.HomeViewModel ViewModel) {
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
                return onChangeViewModelNewList((android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>>) object, fieldId);
            case 1 :
                return onChangeViewModelShowProgress((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelNewList(android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>> ViewModelNewList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowProgress(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowProgress, int fieldId) {
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
        java.lang.Boolean viewModelShowProgressGetValue = null;
        java.util.List<com.apps.myapplication.data.source.remote.response.DataList> viewModelNewListGetValue = null;
        int viewModelShowProgressViewVISIBLEViewGONE = 0;
        android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>> viewModelNewList = null;
        com.apps.myapplication.mvvm.mainhome.HomeViewModel viewModel = mViewModel;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowProgress = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelShowProgressGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.newList
                        viewModelNewList = viewModel.getNewList();
                    }
                    updateLiveDataRegistration(0, viewModelNewList);


                    if (viewModelNewList != null) {
                        // read viewModel.newList.getValue()
                        viewModelNewListGetValue = viewModelNewList.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showProgress
                        viewModelShowProgress = viewModel.getShowProgress();
                    }
                    updateLiveDataRegistration(1, viewModelShowProgress);


                    if (viewModelShowProgress != null) {
                        // read viewModel.showProgress.getValue()
                        viewModelShowProgressGetValue = viewModelShowProgress.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.showProgress.getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewModelShowProgressGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelShowProgressGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidDatabindingViewDataBindingSafeUnboxViewModelShowProgressGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.showProgress.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowProgressViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxViewModelShowProgressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelShowProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.apps.myapplication.mvvm.mainhome.HomeBinding.setNewsList(this.recyclerviewMain, viewModelNewList);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.newList
        flag 1 (0x2L): viewModel.showProgress
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): android.databinding.ViewDataBinding.safeUnbox(viewModel.showProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.showProgress.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}