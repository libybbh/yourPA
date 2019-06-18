package com.esri.android.nearbyplaces.data;
import com.esri.android.nearbyplaces.R;
import com.esri.android.nearbyplaces.filter.FilterItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryKeeper {
    private static CategoryKeeper instance = null;
    private final ArrayList<FilterItem> categories = new ArrayList<>();
    private CategoryKeeper(){
        categories.add(new FilterItem("Бари", R.drawable.ic_local_bar_grey_48dp, true, R.drawable.ic_local_bar_black_24dp));
        categories.add(new FilterItem("Готелі", R.drawable.ic_hotel_grey_24dp, true, R.drawable.ic_hotel_pink_24dp));
        categories.add(new FilterItem("Відпочинок на природі", R.drawable.ic_nature_grey_24dp, true, R.drawable.ic_park_black_24dp));
        categories.add(new FilterItem("Активний відпочинок", R.drawable.ic_fitness_center_grey_24dp, true, R.drawable.ic_fitness_center_pink_24dp));
    }
    public static CategoryKeeper getInstance(){
        if (CategoryKeeper.instance == null){
            CategoryKeeper.instance = new CategoryKeeper();
        }
        return CategoryKeeper.instance;
    }
    public final List<FilterItem> getCategories(){
        return Collections.unmodifiableList(categories);
    }

    public final List<String> getSelectedTypes(){
        final List<String> selectedTypes = new ArrayList<>();
        for (final FilterItem item : categories){
            if (!item.getSelected()){

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