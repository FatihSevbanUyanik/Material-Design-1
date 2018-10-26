package com.example.fatihpc.materialdesign.RecyclerViewLandscape;

import com.example.fatihpc.materialdesign.R;

import java.util.ArrayList;

public class LandscapeListData {

    private String landscapeName;
    private String landscapeDesc;
    private int    landscapeImage;

    public LandscapeListData(String landscapeName, String landscapeDesc, int landscapeImage) {
        this.landscapeName = landscapeName;
        this.landscapeDesc = landscapeDesc;
        this.landscapeImage = landscapeImage;
    }

    public String getLandscapeName() {
        return landscapeName;
    }

    public void setLandscapeName(String landscapeName) {
        this.landscapeName = landscapeName;
    }

    public String getLandscapeDesc() {
        return landscapeDesc;
    }

    public void setLandscapeDesc(String landscapeDesc) {
        this.landscapeDesc = landscapeDesc;
    }

    public int getLandscapeImag() {
        return landscapeImage;
    }

    public void setLandscapeImag(int landscapeImag) {
        this.landscapeImage = landscapeImage;
    }

    public static ArrayList<LandscapeListData> getData() {

        ArrayList<LandscapeListData> landscapeListData = new ArrayList<>();

        // array containing image ids
        int[] imageIDs = {
                R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2, R.drawable.thumb_1_3,
                R.drawable.thumb_1_4, R.drawable.thumb_1_5, R.drawable.thumb_1_6, R.drawable.thumb_1_7,
                R.drawable.thumb_1_8, R.drawable.thumb_1_9,

                R.drawable.thumb_2_0, R.drawable.thumb_2_1, R.drawable.thumb_2_2, R.drawable.thumb_2_3,
                R.drawable.thumb_2_4, R.drawable.thumb_2_5, R.drawable.thumb_2_6, R.drawable.thumb_2_7,
                R.drawable.thumb_2_8, R.drawable.thumb_2_9,

                R.drawable.thumb_3_0, R.drawable.thumb_3_1, R.drawable.thumb_3_2, R.drawable.thumb_3_3,
                R.drawable.thumb_3_4, R.drawable.thumb_3_5, R.drawable.thumb_3_6, R.drawable.thumb_3_7,
                R.drawable.thumb_3_8, R.drawable.thumb_3_9,

                R.drawable.thumb_4_0, R.drawable.thumb_4_1, R.drawable.thumb_4_2, R.drawable.thumb_4_3,
                R.drawable.thumb_4_4, R.drawable.thumb_4_5, R.drawable.thumb_4_6, R.drawable.thumb_4_7,
                R.drawable.thumb_4_8, R.drawable.thumb_4_9,

                R.drawable.thumb_5_0, R.drawable.thumb_5_1, R.drawable.thumb_5_2, R.drawable.thumb_5_3,
                R.drawable.thumb_5_4, R.drawable.thumb_5_5, R.drawable.thumb_5_6, R.drawable.thumb_5_7,
                R.drawable.thumb_5_8, R.drawable.thumb_5_9,

                R.drawable.thumb_6_0, R.drawable.thumb_6_1, R.drawable.thumb_6_2, R.drawable.thumb_6_3,
                R.drawable.thumb_6_4, R.drawable.thumb_6_5, R.drawable.thumb_6_6, R.drawable.thumb_6_7,
                R.drawable.thumb_6_8, R.drawable.thumb_6_9,

                R.drawable.thumb_7_0, R.drawable.thumb_7_1, R.drawable.thumb_7_2, R.drawable.thumb_7_3,
                R.drawable.thumb_7_4
        };

        for ( int i = 0 ; i < imageIDs.length ; i++ ) {
            String landscapeName = "LandscapeListData " + (i+1);
            String landscapeDesc = "Description" + (i+1);
            landscapeListData.add( new LandscapeListData( landscapeName , landscapeDesc , imageIDs[i] ) );
        }

        return landscapeListData;
    }

}
