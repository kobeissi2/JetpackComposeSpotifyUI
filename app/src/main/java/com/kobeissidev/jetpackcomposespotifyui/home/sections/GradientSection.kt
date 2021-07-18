package com.kobeissidev.jetpackcomposespotifyui.home.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
            .padding(bottom = 16.dp)
    ) {
        TopRowSection()
        ChooseMusicSection()
    }
}