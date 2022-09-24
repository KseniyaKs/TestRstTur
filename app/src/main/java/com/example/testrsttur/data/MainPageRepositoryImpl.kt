package com.example.testrsttur.data

import com.example.testrsttur.data.mapper.MapperFromBlogResponseToModel
import com.example.testrsttur.data.mapper.MapperFromMainPageResponseToModel
import com.example.testrsttur.data.mapper.ResponseMapper
import com.example.testrsttur.domain.MainPageRepository
import com.example.testrsttur.domain.entity.BlogContent
import com.example.testrsttur.domain.entity.MainPageItem
import javax.inject.Inject

class MainPageRepositoryImpl @Inject constructor(
    private val api: Api,
    private val responseMapper: ResponseMapper,
    private val mapperFromMainPageResponseToModel: MapperFromMainPageResponseToModel,
    private val mapperFromBlogResponseToModel: MapperFromBlogResponseToModel
) : MainPageRepository {
    override suspend fun loadMainPage(): List<MainPageItem> {
        val list = mutableListOf<MainPageItem>()

        val response = responseMapper.map(api.loadMainPage())
        response.data.buttonsDto?.let {
            val listButtons = mapperFromMainPageResponseToModel.map(it)
            list.add(listButtons)
        }

        response.data.contentDto?.forEach {
            when (it.template.objectTemplate) {
                ContentType.BLOG -> {
                    val blogs = loadBlogs()
                    blogs.forEach { blogContent ->
                        list.add(blogContent)
                    }
                }
                else -> {}
            }
        }

        return list
    }

    override suspend fun loadBlogs(): List<BlogContent> {
        val blogResponse = responseMapper.map(api.loadBlogs())
        return mapperFromBlogResponseToModel.map(blogResponse)
    }
}



