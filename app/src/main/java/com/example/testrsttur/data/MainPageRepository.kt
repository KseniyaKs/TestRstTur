package com.example.testrsttur.data

import android.util.Log
import javax.inject.Inject

interface MainPageRepository {
    suspend fun loadMainPage(): List<MainPageItem>
}

class MainPageRepositoryImpl @Inject constructor(
    private val api: Api,
    private val responseMapper: ResponseMapper,
    private val mapper: MapperFromMainPageResponseToModel
) : MainPageRepository {
    override suspend fun loadMainPage(): List<MainPageItem> {
        val response = responseMapper.map(api.loadMainPage())
        return mapper.mapFromMainPageResponseToModel(response)
    }
}

interface MainPageItem

data class ListButtons(
    val buttons: List<Buttons>
) : MainPageItem

data class Buttons(
    val icon: String,
    val color: String,
    val title: String,
    val type: String,
    val url: String
)

data class ListContent(
    val content: List<Content>
) : MainPageItem

data class Content(
    val title: String,
    val template: Template,
    val url: String
) : MainPageItem

data class Template(
    val card: String,
    val objectTemplate: String,
    val size: String,
    val direction: String,
)


