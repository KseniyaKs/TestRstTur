package com.example.testrsttur.presentation.list

import com.example.testrsttur.domain.entity.MainPageItem

data class MainPageViewState(
    val mainPageList: List<MainPageItem> = emptyList()
)

sealed class MainPageEvent {
    object LoadMainPage : MainPageEvent()
}