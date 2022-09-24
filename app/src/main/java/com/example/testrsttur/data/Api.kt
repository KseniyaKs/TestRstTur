package com.example.testrsttur.data

import com.example.testrsttur.data.dto.BlogDetailResponse
import com.example.testrsttur.data.dto.BlogResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("api/base-app/main")
    suspend fun loadMainPage(@Query("id") id: Int = 117): Response<MainPageResponse>

    @GET("api/base-app/blog")
    suspend fun loadBlogs(
        @Query("id") id: Int = 117,
        @Query("format") format: String = "card"
    ) : Response<BlogResponse>

    @GET("api/base-app/blog-info")
    suspend fun loadBlogDetail(
        @Query("id") id: Int = 117,
        @Query("blog_id") blogId: Int
    ): Response<BlogDetailResponse>
}
