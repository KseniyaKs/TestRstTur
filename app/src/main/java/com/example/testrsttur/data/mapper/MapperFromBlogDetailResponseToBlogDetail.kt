package com.example.testrsttur.data.mapper

import com.example.testrsttur.data.dto.BlogDetailResponse
import com.example.testrsttur.domain.entity.BlogDetail
import com.example.testrsttur.domain.entity.Image
import javax.inject.Inject


interface MapperFromBlogDetailResponseToBlogDetail {
    fun map(blogDetailResponse: BlogDetailResponse): BlogDetail
}

class MapperFromBlogDetailResponseToBlogDetailImpl @Inject constructor() :
    MapperFromBlogDetailResponseToBlogDetail {
    override fun map(blogDetailResponse: BlogDetailResponse): BlogDetail {

        return BlogDetail(
            id = blogDetailResponse.data.id,
            image = Image(
                smallSize = blogDetailResponse.data.image.smallSize,
                mediumSize = blogDetailResponse.data.image.mediumSize,
                largeSize = blogDetailResponse.data.image.largeSize
            ),
            title = blogDetailResponse.data.title,
            subtitle = blogDetailResponse.data.subtitle,
            date = blogDetailResponse.data.date,
            content = blogDetailResponse.data.content
        )
    }
}