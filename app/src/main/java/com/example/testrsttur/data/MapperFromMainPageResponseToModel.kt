package com.example.testrsttur.data

import javax.inject.Inject

interface MapperFromMainPageResponseToModel {
    fun mapFromMainPageResponseToModel(mainPageResponse: MainPageResponse): List<MainPageItem>
}

class MapperFromMainPageResponseToModelImpl @Inject constructor() : MapperFromMainPageResponseToModel {
    override fun mapFromMainPageResponseToModel(mainPageResponse: MainPageResponse): List<MainPageItem> {
        val list = mutableListOf<MainPageItem>()

        val listButtons = mainPageResponse.data.buttonsDto?.map {
            Buttons(
                icon = it.icon,
                color = it.color,
                title = it.title,
                type = it.type,
                url = it.url
            )
        }
        listButtons?.let { list.add(ListButtons(listButtons)) }

        val listContent = mainPageResponse.data.contentDto?.map {
            Content(
                title = it.title,
                template = Template(
                    card = it.template.card,
                    objectTemplate = it.template.objectTemplate,
                    size = it.template.size,
                    direction = it.template.direction
                ),
                url = it.url
            )
        }?.chunked(2)
        listContent?.forEach {
            list.add(ListContent(it))
        }

        return list
    }

}