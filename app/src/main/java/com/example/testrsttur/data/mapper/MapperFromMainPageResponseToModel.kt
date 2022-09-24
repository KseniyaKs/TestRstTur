package com.example.testrsttur.data.mapper

import com.example.testrsttur.data.ButtonsDto
import com.example.testrsttur.domain.entity.Button
import com.example.testrsttur.domain.entity.ListButtons
import javax.inject.Inject

interface MapperFromMainPageResponseToModel {
    fun map(buttonsDto: List<ButtonsDto>): ListButtons
}

class MapperFromMainPageResponseToModelImpl @Inject constructor() :
    MapperFromMainPageResponseToModel {
    override fun map(buttonsDto: List<ButtonsDto>): ListButtons {

        val listButtons = buttonsDto.map {
            Button(
                icon = it.icon,
                color = it.color,
                title = it.title,
                type = it.type,
                url = it.url
            )
        }

        return ListButtons(listButtons)
    }

}

