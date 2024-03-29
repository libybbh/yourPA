/* Copyright 2016 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For additional information, contact:
 * Environmental Systems Research Institute, Inc.
 * Attn: Contracts Dept
 * 380 New York Street
 * Redlands, California, USA 92373
 *
 * email: contracts@esri.com
 *
 */
package com.esri.android.nearbyplaces.filter;

public class FilterItem {

  private final String mTitle;
  private final int mIconId;
  private boolean mSelected;
  private final int mSelectedIconId;

  public FilterItem (final String title, final int icon, final boolean s, final int selectedIcon){
    mTitle = title;
    mIconId = icon;
    mSelected = s;
    mSelectedIconId = selectedIcon;
  }

  public final int getIconId() {
    return mIconId;
  }

  public final String getTitle() {
    return mTitle;
  }

  public final boolean getSelected() { return mSelected ;}

  public final void setSelected(final boolean selected){ mSelected = selected; }

  public final int getSelectedIconId() {
    return mSelectedIconId;
  }

  @Override public String toString() {
    return "FilterItem{" +
        "mTitle='" + mTitle + '\'' +
        ", mIconId=" + mIconId +
        ", mSelected=" + mSelected +
        ", mSelectedIconId=" + mSelectedIconId +
        '}';
  }
}
