package com.example.testrsttur.domain

import com.example.testrsttur.domain.entity.BlogDetail

interface BlogDetailRepository {
    suspend fun loadBlogDetail(blogId: Int): BlogDetail
}