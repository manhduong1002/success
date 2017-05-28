package com.example.admin.successapp.infra.http;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Thanh Tung iTC on 5/27/2017.
 */

public interface ServiceInterface {
    @GET(Config.HTTP_URL_API_ADD_TARGET)
    Call<Message> addTarget(@Query("id") int id, @Query("level") int level,
                            @Query("expiryDate") String expiryDate, @Query("title") String title,
                            @Query("name") String name, @Query("parentId") int parentId);

}
