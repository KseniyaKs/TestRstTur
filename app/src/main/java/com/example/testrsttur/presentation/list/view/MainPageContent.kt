package com.example.testrsttur.presentation.list.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.testrsttur.domain.entity.Blog
import com.example.testrsttur.domain.entity.BlogContent
import com.example.testrsttur.domain.entity.Button
import com.example.testrsttur.domain.entity.ListButtons
import com.example.testrsttur.presentation.list.MainPageViewModel
import com.example.testrsttur.presentation.list.MainPageViewState
import com.example.testrsttur.widget.PicassoImage


@Composable
fun MainPageContent(
    viewState: MainPageViewState,
    navController: NavController
) {
    LazyColumn {
        items(viewState.mainPageList) {
            when (it) {
                is ListButtons -> {
                    Buttons(it.buttons)
                }
                is BlogContent -> {
                    BlogContent(
                        blogContent = it,
                        paddingValues = PaddingValues(
                            start = 16.dp,
                            end = 16.dp,
                            top = 8.dp,
                            bottom = 8.dp
                        ),
                        blogClick = { blogId: Int ->
                            navController.navigate("blog_detail/$blogId")
                        })
                }
            }
        }
    }
}

@Composable
fun Buttons(buttons: List<Button>) {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        buttons.forEach {
            ButtonItem(it)
        }
    }
}

@Composable
fun ButtonItem(button: Button) {
    Button(
        modifier = Modifier,
        shape = RoundedCornerShape(8.dp),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 12.dp),
        onClick = { /*TODO*/ })
    {
        Text(text = button.title)
    }
}

@Composable
fun BlogContent(
    blogContent: BlogContent,
    paddingValues: PaddingValues,
    blogClick: (blogId: Int) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(paddingValues)
    ) {
        blogContent.listBlog.forEachIndexed { index, blog ->
            ContentItem(
                blog = blog,
                modifier = Modifier
                    .weight(1f),
                blogClick = blogClick
            )
            if (index % 2 == 0) {
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}

@Composable
fun ContentItem(blog: Blog, modifier: Modifier, blogClick: (blogId: Int) -> Unit) {
    Column(modifier = modifier
        .wrapContentSize()
        .clickable {
            blogClick(blog.id)
        }) {
        Card(shape = RoundedCornerShape(8.dp)) {
            PicassoImage(blog.image.mediumSize)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = blog.title,
            maxLines = 1,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis
        )
        Text(text = blog.subtitle, maxLines = 2, overflow = TextOverflow.Ellipsis)
    }
}