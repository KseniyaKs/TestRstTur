package com.example.testrsttur.domain.entity

data class BlogContent(
    val listBlog: List<Blog>
): MainPageItem

data class Blog(
    val id: Int,
    val image: Image,
    val title: String,
    val subtitle: String,
)

data class Image(
    val smallSize: String,
    val mediumSize: String,
    val largeSize: String
)
