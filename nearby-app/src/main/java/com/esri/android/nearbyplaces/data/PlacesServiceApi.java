
package com.esri.android.nearbyplaces.data;

import android.content.Context;
import android.support.annotation.NonNull;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.tasks.geocode.GeocodeParameters;
import com.esri.arcgisruntime.tasks.networkanalysis.RouteResult;

import java.util.List;

public interface PlacesServiceApi {

  interface PlacesServiceCallback<List>{  // callback from server
    void onLoaded(List places);
  }

  interface RouteServiceCallback{
    void onRouteReturned(RouteResult result);
  }

  void getRouteFromService(Point start, Point end, Context context, RouteServiceCallback callback);

  void getPlacesFromService(@NonNull GeocodeParameters parameters, @NonNull PlacesServiceCallback callback);

  List<Place> getPlacesFromRepo();
}
