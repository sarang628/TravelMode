package com.example.travelmode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.travelmode.databinding.FragmentTravelModeMapBindingImpl;
import com.example.travelmode.databinding.ItemNation1BindingImpl;
import com.example.travelmode.databinding.ItemNationBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTTRAVELMODEMAP = 1;

  private static final int LAYOUT_ITEMNATION = 2;

  private static final int LAYOUT_ITEMNATION1 = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.travelmode.R.layout.fragment_travel_mode_map, LAYOUT_FRAGMENTTRAVELMODEMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.travelmode.R.layout.item_nation, LAYOUT_ITEMNATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.travelmode.R.layout.item_nation1, LAYOUT_ITEMNATION1);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTTRAVELMODEMAP: {
          if ("layout/fragment_travel_mode_map_0".equals(tag)) {
            return new FragmentTravelModeMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_travel_mode_map is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNATION: {
          if ("layout/item_nation_0".equals(tag)) {
            return new ItemNationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_nation is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNATION1: {
          if ("layout/item_nation1_0".equals(tag)) {
            return new ItemNation1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_nation1 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.screen_map.DataBinderMapperImpl());
    result.add(new com.example.torang_core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "name");
      sKeys.put(2, "nationItem");
      sKeys.put(3, "res");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_travel_mode_map_0", com.example.travelmode.R.layout.fragment_travel_mode_map);
      sKeys.put("layout/item_nation_0", com.example.travelmode.R.layout.item_nation);
      sKeys.put("layout/item_nation1_0", com.example.travelmode.R.layout.item_nation1);
    }
  }
}
