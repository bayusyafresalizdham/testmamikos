package com.apps.myapplication.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/apps/myapplication/data/source/remote/ApiInterfaces;", "", "doGetListHat", "Lretrofit2/Call;", "Lcom/apps/myapplication/data/source/remote/response/BarangResponse;", "doGetListJeans", "doGetListShirt", "app_debug"})
public abstract interface ApiInterfaces {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "list/hat")
    public abstract retrofit2.Call<com.apps.myapplication.data.source.remote.response.BarangResponse> doGetListHat();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "list/jeans")
    public abstract retrofit2.Call<com.apps.myapplication.data.source.remote.response.BarangResponse> doGetListJeans();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "list/shirt")
    public abstract retrofit2.Call<com.apps.myapplication.data.source.remote.response.BarangResponse> doGetListShirt();
}