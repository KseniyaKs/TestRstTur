package com.example.testrsttur

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.testrsttur.presentation.blog_detail.BlogDetailScreen
import com.example.testrsttur.presentation.list.MainPageScreen
import com.example.testrsttur.presentation.list.view.BottomNavType
import com.example.testrsttur.presentation.list.view.BottomNavigationBar
import com.example.testrsttur.ui.theme.TestRstTurColors


@Composable
fun MainAppContent(darkTheme: Boolean = isSystemInDarkTheme()) {
    val navController = rememberNavController()
    val homeScreenState = rememberSaveable { mutableStateOf(BottomNavType.HOME) }

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("blog_detail/{blog_id}",
            arguments = listOf(navArgument("blog_id") { type = NavType.IntType })) {
            BlogDetailScreen(navController = navController)
        }

        composable("home") {
            Column {
                MainScreenContent(
                    homeScreen = homeScreenState.value, modifier = Modifier.weight(1f),
                    navController = navController
                )
                BottomNavigationBar(homeScreenState = homeScreenState, darkTheme = darkTheme)
            }
        }
//
//        composable("create") {
//            CreateMessageScreen(navController = navController)
//        }
    }

}

@Composable
fun MainScreenContent(
    homeScreen: BottomNavType,
    modifier: Modifier,
    navController: NavController
) {
    Column(modifier = modifier.background(TestRstTurColors.primary)) {
        Crossfade(homeScreen) { screen ->
            Surface {
                when (screen) {
                    BottomNavType.HOME -> MainPageScreen(navController = navController)
                    BottomNavType.MAP -> {
                        Box {
                            Text(text = "MAP")
                        }
                    }
                    BottomNavType.BOOKING -> Box {
                        Text(text = "BOOKING")
                    }
                    BottomNavType.CHAT -> Box {
                        Text(text = "CHAT")
                    }
                    BottomNavType.MORE -> Box {
                        Text(text = "MORE")
                    }
                }
            }
        }
    }
}