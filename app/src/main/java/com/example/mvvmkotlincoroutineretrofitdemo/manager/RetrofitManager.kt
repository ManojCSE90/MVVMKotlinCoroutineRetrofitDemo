package com.example.mvvmkotlincoroutineretrofitdemo.manager

import com.example.mvvmkotlincoroutineretrofitdemo.interfaces.ApiService
import com.example.mvvmkotlincoroutineretrofitdemo.util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitManager {

    val apiService: ApiService

    init {

        val client = OkHttpClient.Builder().build()

        apiService = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(ApiService::class.java)
    }


}