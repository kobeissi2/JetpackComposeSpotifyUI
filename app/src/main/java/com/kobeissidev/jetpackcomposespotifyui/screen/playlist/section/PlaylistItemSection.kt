package com.kobeissidev.jetpackcomposespotifyui.screen.playlist.section

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.composable.InlineShuffleText
import com.kobeissidev.jetpackcomposespotifyui.composable.MusicNoteIcon
import com.kobeissidev.jetpackcomposespotifyui.screen.playlist.PlaylistViewModel
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyGrey

@Composable
fun PlaylistItemSection(
    viewModel: PlaylistViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(all = 4.dp)
    ) {
        items(items = viewModel.playlists) { playlist ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 8.dp)
                    .clickable {
                        Toast
                            .makeText(context, playlist.title, Toast.LENGTH_SHORT)
                            .show()
                    }
            ) {
                Box(
                    modifier = Modifier
                        .width(75.dp)
                        .height(75.dp)
                        .background(color = SpotifyGrey)
                ) {
                    playlist.iconId?.let {
                        Image(
                            painter = rememberImagePainter(data = it),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(all = 28.dp)
                        )
                    } ?: MusicNoteIcon(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(all = 28.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = playlist.title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(24.dp)
                            .padding(horizontal = 12.dp),
                        fontSize = 18.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    InlineShuffleText(
                        textString = "by ${playlist.creator}",
                        maxLines = 1,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(24.dp)
                            .padding(horizontal = 13.dp),
                        style = MaterialTheme.typography.body2.copy(
                            fontSize = 14.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                }
            }
        }
    }
}