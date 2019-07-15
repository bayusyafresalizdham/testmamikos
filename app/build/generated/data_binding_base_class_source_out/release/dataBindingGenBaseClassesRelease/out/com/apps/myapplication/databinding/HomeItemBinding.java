package com.apps.myapplication.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apps.myapplication.data.source.remote.response.DataList;
import com.apps.myapplication.mvvm.mainhome.HomeItemUserActionListener;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeItemBinding extends ViewDataBinding {
  @Bindable
  protected HomeItemUserActionListener mUserActionListener;

  @Bindable
  protected DataList mItem;

  protected HomeItemBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setUserActionListener(@Nullable HomeItemUserActionListener userActionListener);

  @Nullable
  public HomeItemUserActionListener getUserActionListener() {
    return mUserActionListener;
  }

  public abstract void setItem(@Nullable DataList item);

  @Nullable
  public DataList getItem() {
    return mItem;
  }

  @NonNull
  public static HomeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeItemBinding>inflateInternal(inflater, com.apps.myapplication.R.layout.home_item, root, attachToRoot, component);
  }

  @NonNull
  public static HomeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HomeItemBinding>inflateInternal(inflater, com.apps.myapplication.R.layout.home_item, null, false, component);
  }

  public static HomeItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static HomeItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (HomeItemBinding)bind(component, view, com.apps.myapplication.R.layout.home_item);
  }
}
