package com.kobeissidev.jetpackcomposespotifyui.screen.home.section

import androidx.compose.runtime.Composable
import com.kobeissidev.jetpackcomposespotifyui.composable.GradientColumn
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyDarkPurple
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyPurple

@Composable
fun GradientSection() {
    GradientColumn(
        colors = listOf(SpotifyPurple, SpotifyDarkPurple),
        angle = -45f

    ) {
        TopRowSection()
        ChooseMusicSection()
    }
}