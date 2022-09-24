package com.example.testrsttur.presentation.blog_detail

import com.example.testrsttur.domain.entity.BlogDetail

data class BlogDetailViewState(
    val blogDetail: BlogDetail
)


sealed class BlogDetailEvent {
    object LoadBlogDetail : BlogDetailEvent()
}