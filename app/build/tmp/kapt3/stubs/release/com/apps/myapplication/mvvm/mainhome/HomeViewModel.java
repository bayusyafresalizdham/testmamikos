package com.apps.myapplication.mvvm.mainhome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e\u00a8\u0006)"}, d2 = {"Lcom/apps/myapplication/mvvm/mainhome/HomeViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "context", "Landroid/app/Application;", "activity", "Landroid/app/Activity;", "(Landroid/app/Application;Landroid/app/Activity;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "mactivity", "getMactivity", "()Landroid/app/Activity;", "setMactivity", "(Landroid/app/Activity;)V", "mcontext", "getMcontext", "()Landroid/app/Application;", "setMcontext", "(Landroid/app/Application;)V", "newList", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/apps/myapplication/data/source/remote/response/DataList;", "getNewList", "()Landroid/arch/lifecycle/MutableLiveData;", "setNewList", "(Landroid/arch/lifecycle/MutableLiveData;)V", "showProgress", "", "getShowProgress", "setShowProgress", "getNews", "", "kategori", "", "start", "Companion", "app_release"})
public final class HomeViewModel extends android.arch.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>> newList;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showProgress;
    @org.jetbrains.annotations.NotNull()
    private android.app.Application mcontext;
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity mactivity;
    private int count;
    public static final com.apps.myapplication.mvvm.mainhome.HomeViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>> getNewList() {
        return null;
    }
    
    public final void setNewList(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<com.apps.myapplication.data.source.remote.response.DataList>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgress() {
        return null;
    }
    
    public final void setShowProgress(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getMcontext() {
        return null;
    }
    
    public final void setMcontext(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getMactivity() {
        return null;
    }
    
    public final void setMactivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    java.lang.String kategori) {
    }
    
    public final void getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String kategori) {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/apps/myapplication/mvvm/mainhome/HomeViewModel$Companion;", "", "()V", "openDetailNews", "Lcom/apps/myapplication/data/source/remote/response/BarangResponse;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.apps.myapplication.data.source.remote.response.BarangResponse openDetailNews() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}