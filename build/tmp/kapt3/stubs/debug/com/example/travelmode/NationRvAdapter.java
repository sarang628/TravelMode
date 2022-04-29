package com.example.travelmode;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001e\u0010\u0015\u001a\u00020\u000e2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/travelmode/NationRvAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/travelmode/NationRvHolder;", "selectNationViewModel", "Lcom/example/travelmode/SelectNationViewModel;", "(Lcom/example/travelmode/SelectNationViewModel;)V", "nationItems", "Ljava/util/ArrayList;", "Lcom/example/torang_core/data/NationItem;", "getSelectNationViewModel", "()Lcom/example/travelmode/SelectNationViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNationList", "Lkotlin/collections/ArrayList;", "screen_travelmode_debug"})
public final class NationRvAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.travelmode.NationRvHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.travelmode.SelectNationViewModel selectNationViewModel = null;
    private java.util.ArrayList<com.example.torang_core.data.NationItem> nationItems;
    
    public NationRvAdapter(@org.jetbrains.annotations.NotNull()
    com.example.travelmode.SelectNationViewModel selectNationViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.travelmode.SelectNationViewModel getSelectNationViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.travelmode.NationRvHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.travelmode.NationRvHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNationList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.torang_core.data.NationItem> nationItems) {
    }
}