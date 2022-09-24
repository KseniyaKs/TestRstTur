package com.example.testrsttur.domain.entity

import java.util.*

data class BlogDetail(
    val id: Int,
    val image: Image,
    val title: String,
    val subtitle: String,
    val date: Date,
    val content: String
)
