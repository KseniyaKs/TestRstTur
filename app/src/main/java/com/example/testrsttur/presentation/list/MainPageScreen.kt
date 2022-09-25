package com.example.testrsttur.presentation.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.testrsttur.base.BaseViewState
import com.example.testrsttur.presentation.list.view.MainPageContent
import com.example.testrsttur.presentation.list.view.Toolbar
import com.example.testrsttur.widget.LoadingView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPageScreen(
    viewModel: MainPageViewModel = hiltViewModel(),
    navController: NavController
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = { Toolbar(modifier = Modifier) },
    ) {
        when (uiState) {
            is BaseViewState.Data -> MainPageContent(
                viewState = (uiState as BaseViewState.Data<MainPageViewState>).value,
                navController = navController
            )
            is BaseViewState.Empty -> {}
            is BaseViewState.Error -> {}
            is BaseViewState.Loading -> LoadingView()
        }
    }

    LaunchedEffect(key1 = viewModel, block = {
        viewModel.onTriggerEvent(MainPageEvent.LoadMainPage)
    })

}
