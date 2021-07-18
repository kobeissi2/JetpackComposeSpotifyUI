package com.kobeissidev.jetpackcomposespotifyui.navigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kobeissidev.jetpackcomposespotifyui.composable.BottomNavigationBar
import com.kobeissidev.jetpackcomposespotifyui.home.HomeScreen
import com.kobeissidev.jetpackcomposespotifyui.playlist.PlaylistScreen
import com.kobeissidev.jetpackcomposespotifyui.premium.PremiumScreen
import com.kobeissidev.jetpackcomposespotifyui.search.SearchScreen

@Composable
fun MainScaffold() {
    val navController = rememberNavController()
    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Home,
        BottomNavigationScreens.Search,
        BottomNavigationScreens.Playlist,
        BottomNavigationScreens.Premium
    )

    Scaffold(bottomBar = { BottomNavigationBar(navController, bottomNavigationItems) }) {
        MainScreenNavigationConfigurations(navController)
    }
}

@Composable
private fun MainScreenNavigationConfigurations(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavigationScreens.Home.route) {
        composable(BottomNavigationScreens.Home.route) { HomeScreen() }
        composable(BottomNavigationScreens.Search.route) { SearchScreen() }
        composable(BottomNavigationScreens.Playlist.route) { PlaylistScreen() }
        composable(BottomNavigationScreens.Premium.route) { PremiumScreen() }
    }
}