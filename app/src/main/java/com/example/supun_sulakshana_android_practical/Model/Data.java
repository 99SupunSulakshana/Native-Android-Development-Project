package com.example.supun_sulakshana_android_practical.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Data {

    @SerializedName("data")
    @Expose
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
