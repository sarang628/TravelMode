package com.example.travelmode;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/example/travelmode/SelectNationViewModel;", "Landroidx/lifecycle/ViewModel;", "nationRepository", "Lcom/example/torang_core/repository/NationRepository;", "(Lcom/example/torang_core/repository/NationRepository;)V", "_nationItems", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/torang_core/data/NationItem;", "_restaurants", "", "Lcom/example/torang_core/data/model/RestaurantData;", "_selectdNation", "nationItems", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getNationItems", "()Landroidx/lifecycle/LiveData;", "restaurants", "getRestaurants", "selected", "getSelected", "findRestaurant", "", "northEastLatitude", "", "southWestLatitude", "northEastLongitude", "southWestLongitude", "select", "nationItem", "screen_travelmode_debug"})
public final class SelectNationViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.torang_core.repository.NationRepository nationRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.torang_core.data.NationItem> _selectdNation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem> selected = null;
    
    /**
     * 현재 맛집 리스트
     */
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.torang_core.data.model.RestaurantData>> _restaurants = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.torang_core.data.model.RestaurantData>> restaurants = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.torang_core.data.NationItem>> _nationItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.torang_core.data.NationItem>> nationItems = null;
    
    @javax.inject.Inject()
    public SelectNationViewModel(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.NationRepository nationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.torang_core.data.NationItem> getSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.torang_core.data.model.RestaurantData>> getRestaurants() {
        return null;
    }
    
    public final void select(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.NationItem nationItem) {
    }
    
    public final void findRestaurant(double northEastLatitude, double southWestLatitude, double northEastLongitude, double southWestLongitude) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.torang_core.data.NationItem>> getNationItems() {
        return null;
    }
}