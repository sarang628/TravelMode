package com.example.travelmode.databinding;
import com.example.travelmode.R;
import com.example.travelmode.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTravelModeMapBindingImpl extends FragmentTravelModeMapBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"item_nation1"},
            new int[] {2},
            new int[] {com.example.travelmode.R.layout.item_nation1});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView1, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.example.travelmode.databinding.ItemNation1Binding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTravelModeMapBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentTravelModeMapBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[3]
            );
        this.constraintLayout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.example.travelmode.databinding.ItemNation1Binding) bindings[2];
        setContainedBinding(this.mboundView1);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.travelmode.SelectNationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
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
        mboundView1.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelected((androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelected(androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem> ViewModelSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.example.torang_core.data.NationItem viewModelSelectedGetValue = null;
        androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem> viewModelSelected = null;
        int viewModelSelectedRes = 0;
        com.example.travelmode.SelectNationViewModel viewModel = mViewModel;
        java.lang.String viewModelSelectedName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.selected
                    viewModelSelected = viewModel.getSelected();
                }
                updateLiveDataRegistration(0, viewModelSelected);


                if (viewModelSelected != null) {
                    // read viewModel.selected.getValue()
                    viewModelSelectedGetValue = viewModelSelected.getValue();
                }


                if (viewModelSelectedGetValue != null) {
                    // read viewModel.selected.getValue().res
                    viewModelSelectedRes = viewModelSelectedGetValue.getRes();
                    // read viewModel.selected.getValue().name
                    viewModelSelectedName = viewModelSelectedGetValue.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setName(viewModelSelectedName);
            this.mboundView1.setRes(viewModelSelectedRes);
        }
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selected
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}