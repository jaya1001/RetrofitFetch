package com.example.android.taskfirst;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 4/6/2018.
 */

public class ApiImage {

    @SerializedName("flag")
    private String api;
    @SerializedName("population")
    private String population;
    @SerializedName("rank")
    private int rank;
    @SerializedName("country")
    private String country;

    public ApiImage(int rank, String country,  String population, String api) {
        this.api = api;
        this.population = population;
        this.rank = rank;
        this.country = country;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getApi() {
        return api;
    }
}