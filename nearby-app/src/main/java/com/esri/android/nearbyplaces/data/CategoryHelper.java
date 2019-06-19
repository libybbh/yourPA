package com.esri.android.nearbyplaces.data;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import com.esri.android.nearbyplaces.R;

import java.util.Arrays;
import java.util.List;

public class CategoryHelper {
  static final List<String> foodTypes = Arrays.asList(
          "African Food",
          "American Food",
          "Argentinean Food",
          "Australian Food",
          "Austrian Food",
          "Bakery",
          "BBQ and Southern Food",
          "Belgian Food",
          "Bistro",
          "Brazilian Food",
          "Breakfast",
          "Brewpub",
          "British Isles Food",
          "Burgers",
          "Cajun and Creole Food",
          "Californian Food",
          "Caribbean Food",
          "Chicken Restaurant",
          "Chilean Food",
          "Chinese Food",
          "Continental Food",
          "Creperie",
          "East European Food",
          "Fast Food",
          "Filipino Food",
          "Fondue",
          "French Food",
          "Fusion Food",
          "German Food",
          "Greek Food",
          "Grill",
          "Hawaiian Food",
          "Ice Cream Shop",
          "Indian Food",
          "Indonesian Food",
          "International Food",
          "Irish Food",
          "Italian Food",
          "Japanese Food",
          "Korean Food",
          "Kosher Food",
          "Latin American Food",
          "Malaysian Food",
          "Mexican Food",
          "Middle Eastern Food",
          "Moroccan Food",
          "Other Restaurant",
          "Pastries",
          "Polish Food",
          "Portuguese Food",
          "Russian Food",
          "Sandwich Shop",
          "Scandinavian Food",
          "Seafood",
          "Snacks",
          "South American Food",
          "Southeast Asian Food",
          "Southwestern Food",
          "Spanish Food",
          "Steak House",
          "Sushi",
          "Swiss Food",
          "Tapas",
          "Thai Food",
          "Turkish Food",
          "Vegetarian Food",
          "Vietnamese Food",
          "Winery");
  
  private static String getCategoryForFoodType(final String foodType){
    String category = foodType;
    if (foodTypes.contains(foodType)){
      category = "Food";
    }
    return category;
  }

  public static Integer getResourceIdForPlacePin(final Place p){
    final String category = CategoryHelper.getCategoryForFoodType(p.getType());
    final int d;
    switch (category){
      case "Sports Center":
        d = R.drawable.pizza_pin;
        break;
      case "Hotel":
        d = R.drawable.hotel_pin;
        break;
      case "Food":
        d = R.drawable.restaurant_pin;
        break;
      case "Park":
        d = R.drawable.bar_pin;
        break;
      case "Coffee Shop":
        d = R.drawable.cafe_pin;
        break;
      default:
        d = R.drawable.empty_pin;
    }
    return d;
  }
  
  public static Drawable getDrawableForPlace(final Place p, final Activity a){

    final String placeType = p.getType();
    final String category = CategoryHelper.getCategoryForFoodType(placeType);
    final Drawable d;
    switch (category){

      case "Hotel":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_hotel_black_24dp,null);
        break;
      case "Food":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_local_dining_black_24dp,null);
        break;
      case "Coffee Shop":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_local_cafe_black_24dp,null);
        break;
      case "Park":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_local_bar_black_24dp,null);
        break;
      case "Sports Center":
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_local_bar_black_24dp,null);
        break;
      default:
        d = ResourcesCompat.getDrawable(a.getResources(), R.drawable.ic_place_black_24dp,null);
    }
    return d;
  }
}
