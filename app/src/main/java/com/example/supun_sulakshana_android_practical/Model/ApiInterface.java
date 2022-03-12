package com.example.supun_sulakshana_android_practical.Model;

import com.example.supun_sulakshana_android_practical.Model.Data;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //@FormUrlEncoded
    @GET("/data/data.json")
    Call<Data> getDataInterface();
}
