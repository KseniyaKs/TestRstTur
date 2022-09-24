package com.example.testrsttur.domain

import com.example.testrsttur.domain.entity.BlogContent
import com.example.testrsttur.domain.entity.MainPageItem

interface MainPageRepository {
    suspend fun loadMainPage(): List<MainPageItem>
    suspend fun loadBlogs(): List<BlogContent>
}