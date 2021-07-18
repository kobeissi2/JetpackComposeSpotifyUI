package com.kobeissidev.jetpackcomposespotifyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kobeissidev.jetpackcomposespotifyui.composable.SystemBar
import com.kobeissidev.jetpackcomposespotifyui.navigation.Navigation
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.JetpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                SystemBar()
                Navigation()
            }
        }
    }
}
