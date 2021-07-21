package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.gradientBackground

@Composable
fun GradientColumn(
    colors: List<Color>,
    angle: Float,
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .gradientBackground(
                colors,
                angle = angle
            ),
        content = content,
        horizontalAlignment = horizontalAlignment,
    )
}