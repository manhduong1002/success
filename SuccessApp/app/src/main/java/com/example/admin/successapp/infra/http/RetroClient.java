package com.example.admin.successapp.infra.http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Thanh Tung iTC on 5/27/2017.
 */

public class RetroClient {

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(Config.HTTP_URL_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ServiceInterface getApiService() {
        return getRetrofitInstance().create(ServiceInterface.class);
    }
}