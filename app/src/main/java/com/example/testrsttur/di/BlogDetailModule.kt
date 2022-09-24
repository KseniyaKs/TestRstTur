package com.example.testrsttur.di

import com.example.testrsttur.data.Api
import com.example.testrsttur.data.BlogDetailRepositoryImpl
import com.example.testrsttur.data.mapper.MapperFromBlogDetailResponseToBlogDetail
import com.example.testrsttur.data.mapper.MapperFromBlogDetailResponseToBlogDetailImpl
import com.example.testrsttur.data.mapper.ResponseMapper
import com.example.testrsttur.domain.BlogDetailRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BlogDetailModule {

    @Provides
    @Singleton
    fun provideBlogDetailMapper(): MapperFromBlogDetailResponseToBlogDetail {
        return MapperFromBlogDetailResponseToBlogDetailImpl()
    }

    @Provides
    @Singleton
    fun provideBlogDetailRepository(
        api: Api,
        responseMapper: ResponseMapper,
        mapperFromBlogDetailResponseToModel: MapperFromBlogDetailResponseToBlogDetail
    ): BlogDetailRepository {
        return BlogDetailRepositoryImpl(api,responseMapper, mapperFromBlogDetailResponseToModel)
    }
}