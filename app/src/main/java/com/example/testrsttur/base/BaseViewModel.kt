package com.example.testrsttur.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<STATE : BaseViewState<*>, EVENT> : ViewModel() {

    private val _uiState = MutableStateFlow<BaseViewState<*>>(BaseViewState.Empty)
    val uiState = _uiState.asStateFlow()

    abstract fun onTriggerEvent(eventType: EVENT)

    protected fun setState(state: STATE) { _uiState.value = state }

//    override fun startLoading() {
//        super.startLoading()
//        _uiState.value = BaseViewState.Loading
//    }
//
//    override fun handleError(exception: Throwable) {
//        super.handleError(exception)
//        _uiState.value = BaseViewState.Error(exception)
//    }
}