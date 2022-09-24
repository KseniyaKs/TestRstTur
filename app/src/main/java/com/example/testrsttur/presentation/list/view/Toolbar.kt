package com.example.testrsttur.presentation.list.view

import androidx.compose.material3.IconButton
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.testrsttur.R


@Composable
fun Toolbar(modifier: Modifier) {
    SmallTopAppBar(
        modifier = modifier,
        title = {
            IconButton(onClick = { }) {
                Text(text = stringResource(id = R.string.app_name))
            }
        }
    )
}