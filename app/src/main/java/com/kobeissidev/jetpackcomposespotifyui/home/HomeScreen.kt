package com.kobeissidev.jetpackcomposespotifyui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kobeissidev.jetpackcomposespotifyui.home.sections.GradientSection
import com.kobeissidev.jetpackcomposespotifyui.home.sections.PlayOnDemandSection
import com.kobeissidev.jetpackcomposespotifyui.home.sections.RecentlyPlayedSection

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.padding(horizontal = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(bottom = 50.dp)
        ) {
            GradientSection()
            RecentlyPlayedSection()
            PlayOnDemandSection()
        }
    }
}