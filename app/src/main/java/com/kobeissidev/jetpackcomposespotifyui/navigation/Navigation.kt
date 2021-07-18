package com.kobeissidev.jetpackcomposespotifyui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlaylistPlay
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.BottomNavigationBar
import com.kobeissidev.jetpackcomposespotifyui.home.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Home,
        BottomNavigationScreens.Search,
        BottomNavigationScreens.Playlist,
        BottomNavigationScreens.Premium
    )
    Scaffold(
        bottomBar = { BottomNavigationBar(navController, bottomNavigationItems) },
    ) {
        MainScreenNavigationConfigurations(navController)
    }
}

sealed class BottomNavigationScreens(
    val route: String,
    @StringRes val resourceId: Int,
    val icon: ImageVector? = null,
    @DrawableRes val drawableId: Int? = null
) {
    object Home : BottomNavigationScreens("Home", R.string.home, Icons.Filled.Home)
    object Search : BottomNavigationScreens("Search", R.string.search, Icons.Filled.Search)
    object Playlist : BottomNavigationScreens("Playlist", R.string.playlist, Icons.Filled.PlaylistPlay)
    object Premium : BottomNavigationScreens("Premium", R.string.premium, drawableId = R.drawable.spotify_logo)
}

@Composable
private fun MainScreenNavigationConfigurations(
    navController: NavHostController
) {
    NavHost(navController, startDestination = BottomNavigationScreens.Home.route) {
        composable(BottomNavigationScreens.Home.route) {
            HomeScreen()
        }
        composable(BottomNavigationScreens.Search.route) {
            // ScaryScreen(ScaryAnimation.Pumpkin)
        }
        composable(BottomNavigationScreens.Playlist.route) {
            // ScaryScreen(ScaryAnimation.Ghost)
        }
        composable(BottomNavigationScreens.Premium.route) {
            //  ScaryScreen(ScaryAnimation.ScaryBag)
        }
    }
}