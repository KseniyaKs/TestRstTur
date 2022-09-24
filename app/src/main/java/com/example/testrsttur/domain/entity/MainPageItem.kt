package com.example.testrsttur.domain.entity


interface MainPageItem

data class ListButtons(
    val buttons: List<Button>
) : MainPageItem

data class Button(
    val icon: String,
    val color: String,
    val title: String,
    val type: String,
    val url: String
)

data class ListContent(
    val content: List<Content>
) : MainPageItem

data class Content(
    val title: String,
    val template: Template,
    val url: String
) : MainPageItem

data class Template(
    val card: String,
    val objectTemplate: String,
    val size: String,
    val direction: String,
)

