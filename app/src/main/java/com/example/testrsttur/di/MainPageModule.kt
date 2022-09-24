package com.example.testrsttur.di

import com.example.testrsttur.data.Api
import com.example.testrsttur.data.MainPageRepositoryImpl
import com.example.testrsttur.data.mapper.*
import com.example.testrsttur.domain.MainPageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainPageModule {

    @Provides
    @Singleton
    fun provideResponseMapper(): ResponseMapper {
        return ResponseMapperImpl()
    }

    @Provides
    @Singleton
    fun provideMainPageMapper(): MapperFromMainPageResponseToModel {
        return MapperFromMainPageResponseToModelImpl()
    }

    @Provides
    @Singleton
    fun provideMainPageRepository(
        api: Api,
        responseMapper: ResponseMapper,
        mapper: MapperFromMainPageResponseToModel,
        mapperFromBlogResponseToModel: MapperFromBlogResponseToModel
    ): MainPageRepository {
        return MainPageRepositoryImpl(api,responseMapper, mapper, mapperFromBlogResponseToModel)
    }

    @Provides
    @Singleton
    fun provideBlogMapper(): MapperFromBlogResponseToModel {
        return MapperFromBlogResponseToModelImpl()
    }
}