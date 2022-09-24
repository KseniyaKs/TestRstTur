package com.example.testrsttur.presentation.blog_detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.example.testrsttur.base.BaseViewModel
import com.example.testrsttur.base.BaseViewState
import com.example.testrsttur.domain.BlogDetailRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: BlogDetailRepository
) : BaseViewModel<BaseViewState<BlogDetailViewState>, BlogDetailEvent>() {

    private val blogId = savedStateHandle.get<String>("blog_id")

    init {
        onTriggerEvent(BlogDetailEvent.LoadBlogDetail)
    }

    private fun loadBlogDetail() {
        setState(BaseViewState.Loading)
        viewModelScope.launch {
            blogId?.let {
                setState(BaseViewState.Data(BlogDetailViewState(repository.loadBlogDetail(blogId.toInt()))))
            }
        }
    }

    override fun onTriggerEvent(eventType: BlogDetailEvent) {
        when(eventType) {
            is BlogDetailEvent.LoadBlogDetail -> loadBlogDetail()
        }

    }
}