package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyPurple

@Composable
fun SystemBar() {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.run {
            setSystemBarsColor(color = Color.Black)
            setStatusBarColor(color = SpotifyPurple)
        }
    }
}