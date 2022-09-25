package com.example.testrsttur.presentation.list.view

import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.testrsttur.R
import com.example.testrsttur.ui.theme.TestRstTurColors
import com.example.testrsttur.ui.theme.TestRstTurTypography


@Composable
fun Toolbar(modifier: Modifier) {
    SmallTopAppBar(
        modifier = modifier,
        title = {
            Text(text = stringResource(id = R.string.main_page))
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = TestRstTurColors.primary, titleContentColor = TestRstTurTypography.h5.color)
    )
}