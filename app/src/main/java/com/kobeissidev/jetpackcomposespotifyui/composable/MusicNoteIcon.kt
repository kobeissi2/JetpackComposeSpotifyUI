package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.R

@Composable
fun MusicNoteIcon(modifier: Modifier = Modifier) {
    Icon(
        painter = rememberImagePainter(data = R.drawable.ic_music_note),
        contentDescription = null,
        tint = Color.White,
        modifier = modifier
            .height(75.dp)
            .width(75.dp)
    )
}