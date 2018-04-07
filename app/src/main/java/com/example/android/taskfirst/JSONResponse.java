package com.example.android.taskfirst;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by User on 4/6/2018.
 */

public class JSONResponse {

    @SerializedName("worldpopulation")
    private ArrayList<ApiImage> image;

    public ArrayList<ApiImage> getImage() {
        return image;
    }
}