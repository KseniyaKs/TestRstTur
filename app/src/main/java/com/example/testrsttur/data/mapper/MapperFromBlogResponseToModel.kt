package com.example.testrsttur.data.mapper

import com.example.testrsttur.data.dto.BlogResponse
import com.example.testrsttur.domain.entity.Blog
import com.example.testrsttur.domain.entity.BlogContent
import com.example.testrsttur.domain.entity.Image
import javax.inject.Inject

interface MapperFromBlogResponseToModel {
    fun map(blogResponse: BlogResponse): List<BlogContent>
}

class MapperFromBlogResponseToModelImpl @Inject constructor() : MapperFromBlogResponseToModel {
    override fun map(blogResponse: BlogResponse): List<BlogContent> {
        val list = mutableListOf<BlogContent>()

        val listBlog = blogResponse.data.map {
            Blog(
                id = it.id,
                image = Image(
                    smallSize = it.image.smallSize,
                    mediumSize = it.image.mediumSize,
                    largeSize = it.image.largeSize
                ),
                title = it.title,
                subtitle = it.subtitle
            )
        }.chunked(2)

        listBlog.forEach { list.add(BlogContent(it)) }

        return list
    }

}
