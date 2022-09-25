package com.example.testrsttur.presentation.list.view

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testrsttur.R
import com.example.testrsttur.ui.theme.NightRider
import com.example.testrsttur.ui.theme.TestRstTurColors

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    homeScreenState: MutableState<BottomNavType>,
    darkTheme: Boolean
) {
    val textColor = colorResource(id = R.color.bottom_bar_icon)
    val navBarItemColor = NavigationBarItemDefaults.colors(selectedIconColor = Color(0xFF4096FB))


    NavigationBar(
        modifier = modifier.height(60.dp),
        tonalElevation = 5.dp,
        containerColor = TestRstTurColors.primaryVariant,
    ) {
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = null
                    )
                    Text(
                        text = "Home",
                        color = if (homeScreenState.value == BottomNavType.HOME) Color(0xFF4096FB) else textColor
                    )
                }
            },
            selected = homeScreenState.value == BottomNavType.HOME,
            onClick = { homeScreenState.value = BottomNavType.HOME },
            colors = navBarItemColor
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_map),
                        contentDescription = null
                    )
                    Text(text = "Map", color = textColor)
                }
            },
            selected = homeScreenState.value == BottomNavType.MAP,
            onClick = { homeScreenState.value = BottomNavType.MAP },
            colors = navBarItemColor
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_booking),
                        contentDescription = null
                    )
                    Text(text = "Booking", color = textColor)
                }
            },
            selected = homeScreenState.value == BottomNavType.BOOKING,
            onClick = { homeScreenState.value = BottomNavType.BOOKING },
            colors = navBarItemColor
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_chat),
                        contentDescription = null
                    )
                    Text(text = "Chat", color = textColor)
                }
            },
            selected = homeScreenState.value == BottomNavType.CHAT,
            onClick = { homeScreenState.value = BottomNavType.CHAT },
            colors = navBarItemColor
        )
        NavigationBarItem(
            icon = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_more),
                        contentDescription = null,
                        modifier = Modifier.height(22.dp)
                    )
                    Text(text = "More", color = textColor)
                }
            },
            selected = homeScreenState.value == BottomNavType.MORE,
            onClick = { homeScreenState.value = BottomNavType.MORE },
            colors = navBarItemColor
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