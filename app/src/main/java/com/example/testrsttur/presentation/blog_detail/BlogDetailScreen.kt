package com.example.testrsttur.presentation.blog_detail

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun BlogDetailScreen(blogDetailViewModel: BlogDetailViewModel = hiltViewModel()) {
    Box {
        Text(text = "TEXT")
    }
}