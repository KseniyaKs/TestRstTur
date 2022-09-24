package com.example.testrsttur

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.testrsttur.ui.theme.TestRstTurTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestRstTurTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MainAppContent()
                }
            }
        }
    }
}
