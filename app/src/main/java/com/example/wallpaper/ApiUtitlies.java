package com.example.wallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtitlies {

    private static Retrofit retrofi=null;
    public static final  String API = "563492ad6f917000010000010d301d306fd045edab29a6585f1aff8f";

    public static ApiInterface getApiInterface()
    {
        if(retrofi==null)
        {
            retrofi = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofi.create(ApiInterface.class);
    }
}
