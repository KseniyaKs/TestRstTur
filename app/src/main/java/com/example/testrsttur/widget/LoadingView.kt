package com.example.testrsttur.widget

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.testrsttur.ui.theme.TestRstTurColors


@Composable
fun LoadingView(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = when (modifier == Modifier) {
            true -> Modifier.fillMaxSize()
            false -> modifier
        }.background(TestRstTurColors.primary)
    ) {
        ProgressIndicator()
    }
}

@Preview(
    showBackground = true,
    name = "Light Mode"
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
fun LoadingViewPreview() {
    LoadingView()
}

@Composable
fun ProgressIndicator(
    modifier: Modifier = Modifier,
    size: Dp = ProgressIndicatorDefaults.size.first,
    strokeWidth: Dp = ProgressIndicatorDefaults.size.second,
    color: Color = MaterialTheme.colors.secondary,
) {
    CircularProgressIndicator(modifier.size(size), color, strokeWidth)
}

object ProgressIndicatorDefaults {
    val size = 48.dp to 4.dp
}