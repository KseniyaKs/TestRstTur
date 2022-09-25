package com.example.testrsttur.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<STATE : BaseViewState<*>, EVENT> : ViewModel() {

    private val _uiState = MutableStateFlow<BaseViewState<*>>(BaseViewState.Empty)
    val uiState = _uiState.asStateFlow()
    protected val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        handleError(throwable)
    }

    abstract fun onTriggerEvent(eventType: EVENT)

    protected fun setState(state: STATE) { _uiState.value = state }

    fun handleError(exception: Throwable) {
        _uiState.value = BaseViewState.Error(exception)
    }
}