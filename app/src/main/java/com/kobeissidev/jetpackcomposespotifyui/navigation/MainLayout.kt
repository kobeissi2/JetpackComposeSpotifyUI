package com.kobeissidev.jetpackcomposespotifyui.navigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kobeissidev.jetpackcomposespotifyui.composable.BottomNavigationBar
import com.kobeissidev.jetpackcomposespotifyui.screen.home.HomeScreen
import com.kobeissidev.jetpackcomposespotifyui.screen.playlist.PlaylistScreen
import com.kobeissidev.jetpackcomposespotifyui.screen.premium.PremiumScreen
import com.kobeissidev.jetpackcomposespotifyui.screen.search.SearchScreen

@Composable
fun MainLayout() {
    val navController = rememberNavController()
    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Home,
        BottomNavigationScreens.Search,
        BottomNavigationScreens.Playlist,
        BottomNavigationScreens.Premium
    )

    Scaffold(bottomBar = { BottomNavigationBar(navController, bottomNavigationItems) }) {
        NavHost(navController, startDestination = BottomNavigationScreens.Home.route) {
            composable(BottomNavigationScreens.Home.route) { HomeScreen() }
            composable(BottomNavigationScreens.Search.route) { SearchScreen() }
            composable(BottomNavigationScreens.Playlist.route) { PlaylistScreen() }
            composable(BottomNavigationScreens.Premium.route) { PremiumScreen() }
        }
    }
}