package com.apps.myapplication.databinding;
import com.apps.myapplication.R;
import com.apps.myapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeItemBindingImpl extends HomeItemBinding implements com.apps.myapplication.generated.callback.OnClickListener.Listener {

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
    private final android.support.v7.widget.CardView mboundView1;
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
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private HomeItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.v7.widget.CardView) bindings[1];
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
        mCallback2 = new com.apps.myapplication.generated.callback.OnClickListener(this, 1);
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
        if (BR.item == variableId) {
            setItem((com.apps.myapplication.data.source.remote.response.DataList) variable);
        }
        else if (BR.userActionListener == variableId) {
            setUserActionListener((com.apps.myapplication.mvvm.mainhome.HomeItemUserActionListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.apps.myapplication.data.source.remote.response.DataList Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setUserActionListener(@Nullable com.apps.myapplication.mvvm.mainhome.HomeItemUserActionListener UserActionListener) {
        this.mUserActionListener = UserActionListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userActionListener);
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
        java.lang.String itemName = null;
        java.lang.String itemImageUrl = null;
        com.apps.myapplication.data.source.remote.response.DataList item = mItem;
        java.lang.String itemBrand = null;
        java.lang.String itemDescription = null;
        com.apps.myapplication.mvvm.mainhome.HomeItemUserActionListener userActionListener = mUserActionListener;
        java.lang.String itemPrice = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.name
                    itemName = item.getName();
                    // read item.image_url
                    itemImageUrl = item.getImage_url();
                    // read item.brand
                    itemBrand = item.getBrand();
                    // read item.description
                    itemDescription = item.getDescription();
                    // read item.price
                    itemPrice = item.getPrice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.apps.myapplication.mvvm.mainhome.HomeBinding.setImageSource(this.mboundView2, itemImageUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemBrand);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, itemPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.apps.myapplication.data.source.remote.response.DataList item = mItem;
        // userActionListener
        com.apps.myapplication.mvvm.mainhome.HomeItemUserActionListener userActionListener = mUserActionListener;
        // userActionListener != null
        boolean userActionListenerJavaLangObjectNull = false;



        userActionListenerJavaLangObjectNull = (userActionListener) != (null);
        if (userActionListenerJavaLangObjectNull) {



            userActionListener.onNewsClicked(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): userActionListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}