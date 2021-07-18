package com.kobeissidev.jetpackcomposespotifyui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlaylistPlay
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.kobeissidev.jetpackcomposespotifyui.R

sealed class BottomNavigationScreens(
    @StringRes val resourceId: Int,
    val icon: ImageVector? = null,
    @DrawableRes val drawableId: Int? = null
) {
    object Home : BottomNavigationScreens(R.string.home, Icons.Filled.Home)
    object Search : BottomNavigationScreens(R.string.search, Icons.Filled.Search)
    object Playlist : BottomNavigationScreens(R.string.playlist, Icons.Filled.PlaylistPlay)
    object Premium : BottomNavigationScreens(R.string.premium, drawableId = R.drawable.spotify_logo)

    val route get() = this::class.java.simpleName
}