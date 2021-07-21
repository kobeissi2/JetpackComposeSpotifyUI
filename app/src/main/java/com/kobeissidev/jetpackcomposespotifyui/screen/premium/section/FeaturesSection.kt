package com.kobeissidev.jetpackcomposespotifyui.screen.premium.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.MusicNoteIcon
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyDownloadBlue
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyTriangleBlue

@Composable
fun FeaturesSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.heres_what_you_get),
            style = MaterialTheme.typography.h6.copy(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp
            ),
            modifier = Modifier.padding(16.dp)
        )

        DownloadImage()
        Text(
            text = stringResource(id = R.string.download_music),
            style = MaterialTheme.typography.h4.copy(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                letterSpacing = 0.sp
            )
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
        )
        Text(
            text = stringResource(id = R.string.listen_anywhere),
            style = MaterialTheme.typography.body1.copy(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 0.sp
            )
        )
    }
}

@Composable
private fun DownloadImage() {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .padding(16.dp)
            .background(
                color = SpotifyDownloadBlue,
                shape = RoundedCornerShape(50)
            )
    ) {
        MusicNoteIcon(modifier = Modifier.align(Alignment.Center))
        Icon(
            imageVector = Icons.Filled.ArrowDownward,
            contentDescription = null,
            tint = SpotifyTriangleBlue,
            modifier = Modifier
                .height(32.dp)
                .width(32.dp)
                .absoluteOffset(
                    x = 32.dp,
                    y = 36.dp
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(50)
                )
        )
    }
}