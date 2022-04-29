// Generated by data binding compiler. Do not edit!
package com.example.travelmode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.torang_core.data.NationItem;
import com.example.travelmode.R;
import com.example.travelmode.SelectNationViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNationBinding extends ViewDataBinding {
  @Bindable
  protected NationItem mNationItem;

  @Bindable
  protected SelectNationViewModel mViewModel;

  protected ItemNationBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setNationItem(@Nullable NationItem nationItem);

  @Nullable
  public NationItem getNationItem() {
    return mNationItem;
  }

  public abstract void setViewModel(@Nullable SelectNationViewModel viewModel);

  @Nullable
  public SelectNationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemNationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_nation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNationBinding>inflateInternal(inflater, R.layout.item_nation, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_nation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNationBinding>inflateInternal(inflater, R.layout.item_nation, null, false, component);
  }

  public static ItemNationBinding bind(@NonNull View view) {
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
  public static ItemNationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNationBinding)bind(component, view, R.layout.item_nation);
  }
}