package com.kobeissidev.jetpackcomposespotifyui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kobeissidev.jetpackcomposespotifyui.screens.home.sections.GradientSection
import com.kobeissidev.jetpackcomposespotifyui.screens.home.sections.PlayOnDemandSection
import com.kobeissidev.jetpackcomposespotifyui.screens.home.sections.RecentlyPlayedSection

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(bottom = 36.dp)
    ) {
        GradientSection()
        RecentlyPlayedSection()
        PlayOnDemandSection()
    }
}