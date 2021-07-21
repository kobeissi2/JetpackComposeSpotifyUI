package com.kobeissidev.jetpackcomposespotifyui.screen.search

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.kobeissidev.jetpackcomposespotifyui.composable.GradientColumn
import com.kobeissidev.jetpackcomposespotifyui.screen.search.sections.SearchHeaderSection
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyDarkGrey
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyDarkerGrey
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyGrey
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyMidGrey

@Composable
fun SearchScreen() {
    GradientColumn(
        colors = listOf(
            SpotifyGrey,
            SpotifyMidGrey,
            SpotifyDarkGrey,
            SpotifyDarkerGrey
        ),
        angle = -45f,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        SearchHeaderSection()
    }
}