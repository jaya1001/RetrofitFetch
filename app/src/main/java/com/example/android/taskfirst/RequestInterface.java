package com.example.android.taskfirst;


import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("tutorial/jsonparsetutorial.txt")
    Call<JSONResponse> getJSON();

}