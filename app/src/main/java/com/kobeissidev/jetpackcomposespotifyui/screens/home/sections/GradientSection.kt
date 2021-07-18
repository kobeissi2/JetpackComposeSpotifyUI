package com.kobeissidev.jetpackcomposespotifyui.screens.home.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyDarkPurple
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyPurple
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.gradientBackground

@Composable
fun GradientSection() {
    Column(
        modifier = Modifier
            .gradientBackground(
                listOf(SpotifyPurple, SpotifyDarkPurple),
                angle = -45f
            )
    ) {
        TopRowSection()
        ChooseMusicSection()
    }
}