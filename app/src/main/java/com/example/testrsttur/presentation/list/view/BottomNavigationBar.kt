package com.example.testrsttur.presentation.list.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testrsttur.R

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    homeScreenState: MutableState<BottomNavType>
) {
    NavigationBar(
        modifier = modifier.height(60.dp), tonalElevation = 5.dp,
        containerColor = Color.White
    ) {
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = null
                    )
                    Text(text = "Home", color = Color(0xFF0D0D0D).copy(alpha = 0.301961F))
                }
            },
            selected = homeScreenState.value == BottomNavType.HOME,
            onClick = { homeScreenState.value = BottomNavType.HOME },
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_map),
                        contentDescription = null
                    )
                    Text(text = "Map", color = Color(0xFF0D0D0D).copy(alpha = 0.301961F))
                }
            },
            selected = homeScreenState.value == BottomNavType.MAP,
            onClick = { homeScreenState.value = BottomNavType.MAP },
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_booking),
                        contentDescription = null
                    )
                    Text(text = "Booking", color = Color(0xFF0D0D0D).copy(alpha = 0.301961F))
                }
            },
            selected = homeScreenState.value == BottomNavType.BOOKING,
            onClick = { homeScreenState.value = BottomNavType.BOOKING },
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_chat),
                        contentDescription = null
                    )
                    Text(text = "Chat", color = Color(0xFF0D0D0D).copy(alpha = 0.301961F))
                }
            },
            selected = homeScreenState.value == BottomNavType.CHAT,
            onClick = { homeScreenState.value = BottomNavType.CHAT },
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_more),
                        contentDescription = null,
                        modifier = Modifier.height(22.dp)
                    )
                    Text(text = "More", color = Color(0xFF0D0D0D).copy(alpha = 0.301961F))
                }
            },
            selected = homeScreenState.value == BottomNavType.MORE,
            onClick = { homeScreenState.value = BottomNavType.MORE },
        )
    }

}

enum class BottomNavType {
    HOME,
    MAP,
    BOOKING,
    CHAT,
    MORE
}