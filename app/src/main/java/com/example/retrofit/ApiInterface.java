package com.example.retrofit;

import androidx.recyclerview.widget.SortedList;

public interface ApiInterface {
    @POST("/v1/login/credentials")     // API's endpoints
    public void registration(@Field("name") String name,
                             @Field("email") String email,
                             @Field("password") String password,
                             @Field("logintype") String logintype,
                             SortedList.Callback<Response> callback);
}

