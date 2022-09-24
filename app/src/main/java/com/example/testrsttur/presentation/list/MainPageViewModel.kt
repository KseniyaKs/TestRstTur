package com.example.testrsttur.presentation.list

import androidx.lifecycle.viewModelScope
import com.example.testrsttur.base.BaseViewModel
import com.example.testrsttur.base.BaseViewState
import com.example.testrsttur.domain.MainPageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainPageViewModel @Inject constructor(
    private val repository: MainPageRepository
) : BaseViewModel<BaseViewState<MainPageViewState>, MainPageEvent>() {

    private fun loadMainPage() {
        setState(BaseViewState.Loading)
        viewModelScope.launch {
            setState(BaseViewState.Data(MainPageViewState(repository.loadMainPage())))
        }
    }

    override fun onTriggerEvent(eventType: MainPageEvent) {
        when (eventType) {
            is MainPageEvent.LoadMainPage -> loadMainPage()
            is MainPageEvent.ClickBlog -> TODO()
        }
    }
}
