package com.bipin.recyclerviewsearchdemo.util;

/**
 * Created by Bipin on 6/7/2017.
 */

import com.bipin.recyclerviewsearchdemo.JSON.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

@SuppressWarnings("ALL")
public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}