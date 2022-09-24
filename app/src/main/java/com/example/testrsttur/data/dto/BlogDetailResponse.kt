package com.example.testrsttur.data.dto

import com.google.gson.annotations.SerializedName
import java.util.*

data class BlogDetailResponse(
    @SerializedName("data") val data: BlogDetailDto
)

data class BlogDetailDto(
    @SerializedName("id") val id: Int,
    @SerializedName("image") val image: ImageDto,
    @SerializedName("title") val title: String,
    @SerializedName("subtitle") val subtitle: String,
    @SerializedName("date") val date: Date,
    @SerializedName("content") val content: String
)