package io.github.emusute1212.memotte.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import io.github.emusute1212.memotte.android.databinding.ActivityMainBindingImpl;
import io.github.emusute1212.memotte.android.databinding.AppMainBindingImpl;
import io.github.emusute1212.memotte.android.databinding.FragmentEditMemoBindingImpl;
import io.github.emusute1212.memotte.android.databinding.FragmentMemoListBindingImpl;
import io.github.emusute1212.memotte.android.databinding.HeaderBindingImpl;
import io.github.emusute1212.memotte.android.databinding.MemoGroupItemViewBindingImpl;
import io.github.emusute1212.memotte.android.databinding.MemoItemViewBindingImpl;
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
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_APPMAIN = 2;

  private static final int LAYOUT_FRAGMENTEDITMEMO = 3;

  private static final int LAYOUT_FRAGMENTMEMOLIST = 4;

  private static final int LAYOUT_HEADER = 5;

  private static final int LAYOUT_MEMOGROUPITEMVIEW = 6;

  private static final int LAYOUT_MEMOITEMVIEW = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.app_main, LAYOUT_APPMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.fragment_edit_memo, LAYOUT_FRAGMENTEDITMEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.fragment_memo_list, LAYOUT_FRAGMENTMEMOLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.header, LAYOUT_HEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.memo_group_item_view, LAYOUT_MEMOGROUPITEMVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(io.github.emusute1212.memotte.android.R.layout.memo_item_view, LAYOUT_MEMOITEMVIEW);
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
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_APPMAIN: {
          if ("layout/app_main_0".equals(tag)) {
            return new AppMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITMEMO: {
          if ("layout/fragment_edit_memo_0".equals(tag)) {
            return new FragmentEditMemoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_memo is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEMOLIST: {
          if ("layout/fragment_memo_list_0".equals(tag)) {
            return new FragmentMemoListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_memo_list is invalid. Received: " + tag);
        }
        case  LAYOUT_HEADER: {
          if ("layout/header_0".equals(tag)) {
            return new HeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for header is invalid. Received: " + tag);
        }
        case  LAYOUT_MEMOGROUPITEMVIEW: {
          if ("layout/memo_group_item_view_0".equals(tag)) {
            return new MemoGroupItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for memo_group_item_view is invalid. Received: " + tag);
        }
        case  LAYOUT_MEMOITEMVIEW: {
          if ("layout/memo_item_view_0".equals(tag)) {
            return new MemoItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for memo_item_view is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "date");
      sKeys.put(2, "editMemoViewModel");
      sKeys.put(3, "entity");
      sKeys.put(4, "memoClickListener");
      sKeys.put(5, "memoListViewModel");
      sKeys.put(6, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", io.github.emusute1212.memotte.android.R.layout.activity_main);
      sKeys.put("layout/app_main_0", io.github.emusute1212.memotte.android.R.layout.app_main);
      sKeys.put("layout/fragment_edit_memo_0", io.github.emusute1212.memotte.android.R.layout.fragment_edit_memo);
      sKeys.put("layout/fragment_memo_list_0", io.github.emusute1212.memotte.android.R.layout.fragment_memo_list);
      sKeys.put("layout/header_0", io.github.emusute1212.memotte.android.R.layout.header);
      sKeys.put("layout/memo_group_item_view_0", io.github.emusute1212.memotte.android.R.layout.memo_group_item_view);
      sKeys.put("layout/memo_item_view_0", io.github.emusute1212.memotte.android.R.layout.memo_item_view);
    }
  }
}
