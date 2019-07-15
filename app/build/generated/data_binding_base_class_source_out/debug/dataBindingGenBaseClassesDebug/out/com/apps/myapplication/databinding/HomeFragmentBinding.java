package com.apps.myapplication.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apps.myapplication.mvvm.mainhome.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerviewMain;

  @Bindable
  protected HomeViewModel mViewModel;

  protected HomeFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerviewMain) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerviewMain = recyclerviewMain;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeFragmentBinding>inflateInternal(inflater, com.apps.myapplication.R.layout.home_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HomeFragmentBinding>inflateInternal(inflater, com.apps.myapplication.R.layout.home_fragment, null, false, component);
  }

  public static HomeFragmentBinding bind(@NonNull View view) {
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
  public static HomeFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (HomeFragmentBinding)bind(component, view, com.apps.myapplication.R.layout.home_fragment);
  }
}
