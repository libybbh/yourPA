package com.esri.android.nearbyplaces.data;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import com.esri.android.nearbyplaces.R;
import java.util.Arrays;
import java.util.List;

public class CategoryHelper {
  static final List<String> foodTypes = Arrays.asList();

  private static String getCategoryForFoodType(final String foodType){
    String category = foodType;
    if (foodTypes.contains(foodType)){
      category = "Parks and Outdoors";
    }
    return category;
  }

  public static Integer getResourceIdForPlacePin(final Place p){
    final String category = CategoryHelper.getCategoryForFoodType(p.getType());
    final Integer d;
    switch (category){
      case "Sports Center":
        d = R.drawable.sport_pin_2;
        break;
      case "Park":
        d = R.drawable.park_pin_2;
        break;
      case "Bar or Pub":
        d = R.drawable.bar_pin_2;
        break;
      case "Hotel":
        d = R.drawable.hotel_pin_2;
        break;
      default:
        d = R.drawable.pin_2;
    }
    return d;
  }

  public static Drawable getDrawableForPlace(final Place p, final Activity a){
    final String placeType = p.getType();
    final String category = CategoryHelper.getCategoryForFoodType(placeType);
    final Drawable d;
    switch (category){
      case "Sports Center":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_fitness_center_pink_24dp,null);
        break;
      case "Park":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_park_black_24dp,null);
        break;
      case "Bar or Pub":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_local_bar_black_24dp,null);
        break;
      case "Hotel":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_hotel_pink_24dp,null);
        break;
      default:
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_pin_drop_black_24dp,null);
    }
    return d;
  }
}