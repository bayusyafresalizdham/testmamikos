package com.apps.myapplication.databinding;
import com.apps.myapplication.R;
import com.apps.myapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailFragmentBindingImpl extends DetailFragmentBinding implements com.apps.myapplication.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailFragmentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DetailFragmentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.apps.myapplication.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.handler == variableId) {
            setHandler((com.apps.myapplication.mvvm.maindetail.DetailViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.apps.myapplication.mvvm.maindetail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.apps.myapplication.mvvm.maindetail.DetailViewModel Handler) {
        this.mHandler = Handler;
    }
    public void setViewModel(@Nullable com.apps.myapplication.mvvm.maindetail.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUrlToImage((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelDescription((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelName((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelBrand((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPrice((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUrlToImage(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewModelUrlToImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDescription(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewModelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelName(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBrand(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewModelBrand, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrice(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String viewModelDescriptionGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewModelUrlToImage = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewModelDescription = null;
        java.lang.String viewModelNameGetValue = null;
        java.lang.String viewModelUrlToImageGetValue = null;
        java.lang.String viewModelPriceGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewModelName = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewModelBrand = null;
        com.apps.myapplication.mvvm.maindetail.DetailViewModel viewModel = mViewModel;
        java.lang.String viewModelBrandGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewModelPrice = null;

        if ((dirtyFlags & 0xdfL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.urlToImage
                        viewModelUrlToImage = viewModel.getUrlToImage();
                    }
                    updateLiveDataRegistration(0, viewModelUrlToImage);


                    if (viewModelUrlToImage != null) {
                        // read viewModel.urlToImage.getValue()
                        viewModelUrlToImageGetValue = viewModelUrlToImage.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.description
                        viewModelDescription = viewModel.getDescription();
                    }
                    updateLiveDataRegistration(1, viewModelDescription);


                    if (viewModelDescription != null) {
                        // read viewModel.description.getValue()
                        viewModelDescriptionGetValue = viewModelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.getName();
                    }
                    updateLiveDataRegistration(2, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel.name.getValue()
                        viewModelNameGetValue = viewModelName.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.brand
                        viewModelBrand = viewModel.getBrand();
                    }
                    updateLiveDataRegistration(3, viewModelBrand);


                    if (viewModelBrand != null) {
                        // read viewModel.brand.getValue()
                        viewModelBrandGetValue = viewModelBrand.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.price
                        viewModelPrice = viewModel.getPrice();
                    }
                    updateLiveDataRegistration(4, viewModelPrice);


                    if (viewModelPrice != null) {
                        // read viewModel.price.getValue()
                        viewModelPriceGetValue = viewModelPrice.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            com.apps.myapplication.mvvm.mainhome.HomeBinding.setImageSource(this.mboundView1, viewModelUrlToImageGetValue);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelNameGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelPriceGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelBrandGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelDescriptionGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.apps.myapplication.mvvm.maindetail.DetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClickFinish();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.urlToImage
        flag 1 (0x2L): viewModel.description
        flag 2 (0x3L): viewModel.name
        flag 3 (0x4L): viewModel.brand
        flag 4 (0x5L): viewModel.price
        flag 5 (0x6L): handler
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}