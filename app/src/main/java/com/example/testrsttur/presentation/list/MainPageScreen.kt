package com.example.testrsttur.presentation.list

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainPageScreen(
    viewModel: MainPageViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(key1 = viewModel, block = {
        viewModel.onTriggerEvent(MainPageEvent.LoadMainPage)
    })

}