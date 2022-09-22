package com.example.testrsttur.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("api/base-app/main")
    suspend fun loadMainPage(@Query("id") id: Int = 117) : Response<MainPageResponse>
}
