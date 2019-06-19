package com.esri.android.nearbyplaces.data;
import com.esri.android.nearbyplaces.R;
import com.esri.android.nearbyplaces.filter.FilterItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryKeeper {
    private static CategoryKeeper instance = null;
    private final ArrayList<FilterItem> mCategories = new ArrayList<>();

    private CategoryKeeper(){
        // mCategories.add(new FilterItem("Bar", R.drawable.ic_local_bar_grey_48dp, true, R.drawable.ic_local_bar_blue_48dp));
        mCategories.add(new FilterItem("Coffee Shop", R.drawable.ic_local_cafe_grey_48dp, true, R.drawable.ic_local_cafe_blue_48dp));
        mCategories.add(new FilterItem("Food", R.drawable.ic_local_dining_grey_48dp, true, R.drawable.ic_local_dining_blue_48dp));
        mCategories.add(new FilterItem("Hotel", R.drawable.ic_local_hotel_grey_48dp, true, R.drawable.ic_local_hotel_blue_48dp));
        mCategories.add(new FilterItem("Park", R.drawable.ic_local_bar_grey_48dp, true, R.drawable.ic_local_cafe_blue_48dp));
        mCategories.add(new FilterItem("Sports Center", R.drawable.ic_local_bar_grey_48dp, true, R.drawable.ic_local_cafe_blue_48dp));
    }

    public static CategoryKeeper getInstance(){
        if (CategoryKeeper.instance == null){
            CategoryKeeper.instance = new CategoryKeeper();
        }
        return CategoryKeeper.instance;
    }

    public final List<FilterItem> getCategories(){
        return Collections.unmodifiableList(mCategories);
    }

    public final List<String> getSelectedTypes(){
        final List<String> selectedTypes = new ArrayList<>();
        for (final FilterItem item : mCategories){
            if (!item.getSelected()){
                // Because places with food are sub-categorized by
                // food type, add them to the filter list.
                if (item.getTitle().equalsIgnoreCase("Food")){
                    selectedTypes.addAll(CategoryHelper.foodTypes);
                }else {
                    selectedTypes.add(item.getTitle());
                }
            }
        }
        return selectedTypes;
    }
}
