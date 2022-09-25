package com.example.testrsttur.presentation.blog_detail.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.testrsttur.R
import com.example.testrsttur.presentation.blog_detail.BlogDetailViewState
import com.example.testrsttur.ui.theme.TestRstTurTypography
import com.example.testrsttur.widget.PicassoImage

@Composable
fun BlogDetailContent(
    viewState: BlogDetailViewState,
    navController: NavController
) {
    val blogDetail = remember {
        viewState.blogDetail
    }
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Box {
            PicassoImage(
                model = blogDetail.image.mediumSize,
                modifier = Modifier.height(304.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_circle_back_button),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 20.dp, top = 44.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
        }
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
            Text(
                text = blogDetail.date.toString(),
                style = TestRstTurTypography.body1.copy(fontSize = 12.sp)
            )
            Text(
                text = blogDetail.title,
                style = TestRstTurTypography.h1.copy(fontSize = 24.sp)
            )
//            Text(
//                text = blogDetail.subtitle,
//                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
//            )
            Spacer(modifier = Modifier.height(33.dp))
            Text(
                text = blogDetail.content,
                style = TestRstTurTypography.body1.copy(fontSize = 16.sp)
            )
        }
    }

}