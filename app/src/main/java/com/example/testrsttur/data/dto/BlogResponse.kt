package com.example.testrsttur.data.dto

import com.google.gson.annotations.SerializedName

data class BlogResponse(
    @SerializedName("data") val data: List<BlogDto>
)

data class BlogDto(
    @SerializedName("id") val id: Int,
    @SerializedName("image") val image: ImageDto,
    @SerializedName("title") val title: String,
    @SerializedName("subtitle") val subtitle: String,

    )

data class ImageDto(
    @SerializedName("sm") val smallSize: String,
    @SerializedName("md") val mediumSize: String,
    @SerializedName("lg") val largeSize: String
)