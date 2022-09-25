package com.example.testrsttur.presentation.blog_detail

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.testrsttur.base.BaseViewState
import com.example.testrsttur.presentation.blog_detail.view.BlogDetailContent
import com.example.testrsttur.widget.LoadingView

@Composable
fun BlogDetailScreen(
    blogDetailViewModel: BlogDetailViewModel = hiltViewModel(),
    navController: NavController
) {

    val uiState by blogDetailViewModel.uiState.collectAsState()

    Column {
        when (uiState) {
            is BaseViewState.Data -> BlogDetailContent(
                viewState = (uiState as BaseViewState.Data<BlogDetailViewState>).value,
                navController = navController
            )
            is BaseViewState.Empty -> {}
            is BaseViewState.Error -> {}
            is BaseViewState.Loading -> LoadingView()
        }
    }
}