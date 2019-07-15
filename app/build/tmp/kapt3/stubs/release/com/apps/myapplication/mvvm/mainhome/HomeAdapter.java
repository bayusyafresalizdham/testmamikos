package com.apps.myapplication.mvvm.mainhome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/apps/myapplication/mvvm/mainhome/HomeAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "news", "", "Lcom/apps/myapplication/data/source/remote/response/DataList;", "context", "Landroid/app/Activity;", "mainViewModel", "Lcom/apps/myapplication/mvvm/mainhome/HomeViewModel;", "(Ljava/util/List;Landroid/app/Activity;Lcom/apps/myapplication/mvvm/mainhome/HomeViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "replaceData", "setList", "MainItemHolder", "app_release"})
public final class HomeAdapter extends android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    private java.util.List<com.apps.myapplication.data.source.remote.response.DataList> news;
    private android.app.Activity context;
    private com.apps.myapplication.mvvm.mainhome.HomeViewModel mainViewModel;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder p0, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void replaceData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.apps.myapplication.data.source.remote.response.DataList> news) {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.apps.myapplication.data.source.remote.response.DataList> news) {
    }
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.apps.myapplication.data.source.remote.response.DataList> news, @org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    com.apps.myapplication.mvvm.mainhome.HomeViewModel mainViewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/apps/myapplication/mvvm/mainhome/HomeAdapter$MainItemHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/apps/myapplication/databinding/HomeItemBinding;", "(Lcom/apps/myapplication/databinding/HomeItemBinding;)V", "mainItemBinding", "bindItem", "", "news", "Lcom/apps/myapplication/data/source/remote/response/DataList;", "userActionListener", "Lcom/apps/myapplication/mvvm/mainhome/HomeItemUserActionListener;", "app_release"})
    public static final class MainItemHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final com.apps.myapplication.databinding.HomeItemBinding mainItemBinding = null;
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        com.apps.myapplication.data.source.remote.response.DataList news, @org.jetbrains.annotations.NotNull()
        com.apps.myapplication.mvvm.mainhome.HomeItemUserActionListener userActionListener) {
        }
        
        public MainItemHolder(@org.jetbrains.annotations.NotNull()
        com.apps.myapplication.databinding.HomeItemBinding itemView) {
            super(null);
        }
    }
}