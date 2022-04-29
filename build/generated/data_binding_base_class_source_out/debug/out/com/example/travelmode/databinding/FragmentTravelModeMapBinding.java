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
import com.example.travelmode.SelectNationViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTravelModeMapBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView imageView1;

  @Bindable
  protected SelectNationViewModel mViewModel;

  protected FragmentTravelModeMapBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, ImageView imageView1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.imageView1 = imageView1;
  }

  public abstract void setViewModel(@Nullable SelectNationViewModel viewModel);

  @Nullable
  public SelectNationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentTravelModeMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_travel_mode_map, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTravelModeMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTravelModeMapBinding>inflateInternal(inflater, R.layout.fragment_travel_mode_map, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTravelModeMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_travel_mode_map, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTravelModeMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTravelModeMapBinding>inflateInternal(inflater, R.layout.fragment_travel_mode_map, null, false, component);
  }

  public static FragmentTravelModeMapBinding bind(@NonNull View view) {
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
  public static FragmentTravelModeMapBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTravelModeMapBinding)bind(component, view, R.layout.fragment_travel_mode_map);
  }
}