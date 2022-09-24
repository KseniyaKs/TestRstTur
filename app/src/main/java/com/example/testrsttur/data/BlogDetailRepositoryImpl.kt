package com.example.testrsttur.data

import com.example.testrsttur.data.mapper.MapperFromBlogDetailResponseToBlogDetail
import com.example.testrsttur.data.mapper.ResponseMapper
import com.example.testrsttur.domain.BlogDetailRepository
import com.example.testrsttur.domain.entity.BlogDetail
import javax.inject.Inject

class BlogDetailRepositoryImpl @Inject constructor(
    private val api: Api,
    private val responseMapper: ResponseMapper,
    private val mapperFromBlogDetailResponseToBlogDetail: MapperFromBlogDetailResponseToBlogDetail
) : BlogDetailRepository {
    override suspend fun loadBlogDetail(blogId: Int): BlogDetail {
        val response = responseMapper.map(api.loadBlogDetail(blogId = blogId))
        return mapperFromBlogDetailResponseToBlogDetail.map(response)
    }
}