package com.kobeissidev.jetpackcomposespotifyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.kobeissidev.jetpackcomposespotifyui.navigation.MainLayout
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.JetpackComposeDemoTheme
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyDarkGrey
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                SystemBar()
                MainLayout()
            }
        }
    }
}

@Composable
private fun SystemBar() {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.run {
            setSystemBarsColor(color = SpotifyDarkGrey)
            setStatusBarColor(color = Color.Transparent)
        }
    }
}