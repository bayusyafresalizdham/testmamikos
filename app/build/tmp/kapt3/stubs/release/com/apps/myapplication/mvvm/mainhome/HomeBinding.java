package com.apps.myapplication.mvvm.mainhome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J&\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/apps/myapplication/mvvm/mainhome/HomeBinding;", "", "()V", "setImageSource", "", "imageView", "Landroid/widget/ImageView;", "urlSource", "", "setNewsList", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "movies", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/apps/myapplication/data/source/remote/response/DataList;", "app_release"})
public final class HomeBinding {
    public static final com.apps.myapplication.mvvm.mainhome.HomeBinding INSTANCE = null;
    
    @android.databinding.BindingAdapter(value = {"app:newsList"})
    public static final void setNewsList(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>> movies) {
    }
    
    @android.databinding.BindingAdapter(value = {"app:imageSource"})
    public static final void setImageSource(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String urlSource) {
    }
    
    private HomeBinding() {
        super();
    }
}