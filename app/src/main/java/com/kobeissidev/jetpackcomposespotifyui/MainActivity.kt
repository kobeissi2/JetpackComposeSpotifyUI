package com.kobeissidev.jetpackcomposespotifyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kobeissidev.jetpackcomposespotifyui.home.GradientSection
import com.kobeissidev.jetpackcomposespotifyui.home.RecentlyPlayedSection
import com.kobeissidev.jetpackcomposespotifyui.composable.SystemBar
import com.kobeissidev.jetpackcomposespotifyui.home.PlayOnDemandSection
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.JetpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                SystemBar()
                Surface(
                    modifier = Modifier.padding(horizontal = 2.dp)
                ) {
                    Column(
                        modifier = Modifier.verticalScroll(rememberScrollState())
                    ) {
                        GradientSection()
                        RecentlyPlayedSection()
                        PlayOnDemandSection()
                    }
                }
            }
        }
    }
}
