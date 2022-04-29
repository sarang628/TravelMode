// Generated by data binding compiler. Do not edit!
package com.example.travelmode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.travelmode.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNation1Binding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView imageView;

  @Bindable
  protected Integer mRes;

  @Bindable
  protected String mName;

  protected ItemNation1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.imageView = imageView;
  }

  public abstract void setRes(@Nullable Integer res);

  @Nullable
  public Integer getRes() {
    return mRes;
  }

  public abstract void setName(@Nullable String name);

  @Nullable
  public String getName() {
    return mName;
  }

  @NonNull
  public static ItemNation1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_nation1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNation1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNation1Binding>inflateInternal(inflater, R.layout.item_nation1, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNation1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_nation1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNation1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNation1Binding>inflateInternal(inflater, R.layout.item_nation1, null, false, component);
  }

  public static ItemNation1Binding bind(@NonNull View view) {
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
  public static ItemNation1Binding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNation1Binding)bind(component, view, R.layout.item_nation1);
  }
}
