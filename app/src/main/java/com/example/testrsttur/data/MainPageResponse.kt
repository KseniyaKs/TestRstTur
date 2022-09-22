package com.example.testrsttur.data

import com.google.gson.annotations.SerializedName

data class MainPageResponse(
    @SerializedName("data") val data: DataDto
)

data class DataDto(
    @SerializedName("buttons") val buttonsDto: List<ButtonsDto>?,
    @SerializedName("content") val contentDto: List<ContentDto>?
)

data class ButtonsDto(
    @SerializedName("icon") val icon: String,
    @SerializedName("color") val color: String,
    @SerializedName("title") val title: String,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String
)

data class ContentDto(
    @SerializedName("title") val title: String,
    @SerializedName("template") val template: TemplateDto,
    @SerializedName("url") val url: String
)

data class TemplateDto(
    @SerializedName("card") val card: String,
    @SerializedName("object") val objectTemplate: String,
    @SerializedName("size") val size: String,
    @SerializedName("direction") val direction: String,
)
