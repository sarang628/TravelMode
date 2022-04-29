package com.example.travelmode.databinding;
import com.example.travelmode.R;
import com.example.travelmode.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNationBindingImpl extends ItemNationBinding implements com.example.travelmode.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(2);
        sIncludes.setIncludes(0, 
            new String[] {"item_nation1"},
            new int[] {1},
            new int[] {com.example.travelmode.R.layout.item_nation1});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final com.example.travelmode.databinding.ItemNation1Binding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemNationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (com.example.travelmode.databinding.ItemNation1Binding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.travelmode.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.nationItem == variableId) {
            setNationItem((com.example.torang_core.data.NationItem) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.travelmode.SelectNationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNationItem(@Nullable com.example.torang_core.data.NationItem NationItem) {
        this.mNationItem = NationItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.nationItem);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.travelmode.SelectNationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String nationItemName = null;
        int nationItemRes = 0;
        com.example.torang_core.data.NationItem nationItem = mNationItem;
        com.example.travelmode.SelectNationViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (nationItem != null) {
                    // read nationItem.name
                    nationItemName = nationItem.getName();
                    // read nationItem.res
                    nationItemRes = nationItem.getRes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setName(nationItemName);
            this.mboundView0.setRes(nationItemRes);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView01.setOnClickListener(mCallback1);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // nationItem
        com.example.torang_core.data.NationItem nationItem = mNationItem;
        // viewModel
        com.example.travelmode.SelectNationViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.select(nationItem);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): nationItem
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}