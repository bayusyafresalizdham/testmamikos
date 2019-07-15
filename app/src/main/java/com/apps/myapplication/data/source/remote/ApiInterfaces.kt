package com.apps.myapplication.data.source.remote

import com.apps.myapplication.data.source.remote.response.BarangResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterfaces {



    @GET("list/hat")
    fun doGetListHat(): Call<BarangResponse>

    @GET("list/jeans")
    fun doGetListJeans(): Call<BarangResponse>


    @GET("list/shirt")
    fun doGetListShirt(): Call<BarangResponse>

}