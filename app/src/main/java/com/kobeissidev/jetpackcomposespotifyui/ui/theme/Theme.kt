package com.kobeissidev.jetpackcomposespotifyui.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val ColorPalette = darkColors(
    primary = Color.White,
    primaryVariant = Color.White,
    secondary = SpotifyDarkGrey,
    background = SpotifyDarkGrey,
    surface = SpotifyDarkGrey,
    onPrimary = SpotifyDarkGrey,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun JetpackComposeDemoTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = ColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}