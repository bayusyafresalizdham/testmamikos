package com.apps.myapplication.base;

import java.lang.System;

/**
 * Created by irfanirawansukirman on 26/01/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J*\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/apps/myapplication/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "mActiviy", "getMActiviy", "()Landroid/support/v7/app/AppCompatActivity;", "setMActiviy", "(Landroid/support/v7/app/AppCompatActivity;)V", "addFragment", "", "containerViewId", "", "fragment", "Landroid/support/v4/app/Fragment;", "fragmentTag", "", "attachBaseContext", "newBase", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "backStackStateName", "app_release"})
public class BaseActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.app.AppCompatActivity mActiviy;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.app.AppCompatActivity getMActiviy() {
        return null;
    }
    
    public final void setMActiviy(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    public final void addFragment(@android.support.annotation.IdRes()
    int containerViewId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    public final void replaceFragment(@android.support.annotation.IdRes()
    int containerViewId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag, @org.jetbrains.annotations.NotNull()
    @android.support.annotation.Nullable()
    java.lang.String backStackStateName) {
    }
    
    public BaseActivity() {
        super();
    }
}