package com.example.testrsttur.di

import com.example.testrsttur.data.*
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
    fun provideManPageMapper(): MapperFromMainPageResponseToModel {
        return MapperFromMainPageResponseToModelImpl()
    }

    @Provides
    @Singleton
    fun provideMainPageRepository(
        api: Api,
        responseMapper: ResponseMapper,
        mapper: MapperFromMainPageResponseToModel
    ): MainPageRepository {
        return MainPageRepositoryImpl(api,responseMapper, mapper)
    }
}