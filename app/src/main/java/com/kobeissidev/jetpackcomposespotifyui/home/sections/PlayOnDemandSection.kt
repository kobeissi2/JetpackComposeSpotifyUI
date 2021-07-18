package com.kobeissidev.jetpackcomposespotifyui.home.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.Header

@Composable
fun PlayOnDemandSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 36.dp)
    ) {
        Header(
            id = R.string.play_on_demand,
            modifier = Modifier.padding(top = 16.dp)
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        Image(
            painter = rememberImagePainter(R.drawable.img_top_songs),
            contentDescription = null,
            modifier = Modifier
                .size(256.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}