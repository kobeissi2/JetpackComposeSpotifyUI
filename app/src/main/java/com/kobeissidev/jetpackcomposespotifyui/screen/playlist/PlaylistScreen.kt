package com.kobeissidev.jetpackcomposespotifyui.screen.playlist

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.CenteredTitleHeader
import com.kobeissidev.jetpackcomposespotifyui.composable.RoundedRippleButton
import com.kobeissidev.jetpackcomposespotifyui.screen.playlist.section.PlaylistItemSection
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyGreen

@Composable
fun PlaylistScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 75.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 8.dp,
                    vertical = 12.dp
                )
        ) {
            CenteredTitleHeader(
                id = R.string.playlist,
                modifier = Modifier.padding(top = 64.dp),
                style = MaterialTheme.typography.h4.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp
                )
            )
            RoundedRippleButton(
                textId = R.string.create,
                backgroundColor = SpotifyGreen,
                color = Color.White,
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
        PlaylistItemSection()
    }
}