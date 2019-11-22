package com.example.mvvmkotlincoroutineretrofitdemo.interfaces

import com.example.mvvmkotlincoroutineretrofitdemo.model.User
import com.example.mvvmkotlincoroutineretrofitdemo.util.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.GET_USERS)
    suspend fun getUsers(): Response<MutableList<User>>

}