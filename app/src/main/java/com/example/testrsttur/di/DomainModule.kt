package com.example.testrsttur.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(
    includes = [
        ApiModule::class,
        MainPageModule::class
    ]
)
@InstallIn(SingletonComponent::class)
class DomainModule