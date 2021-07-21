package com.kobeissidev.jetpackcomposespotifyui.screen.home.section

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.CenteredTitleHeader
import com.kobeissidev.jetpackcomposespotifyui.composable.InlineShuffleText
import com.kobeissidev.jetpackcomposespotifyui.screen.home.HomeViewModel

@Composable
fun RecentlyPlayedSection() {
    Column(modifier = Modifier.padding(8.dp)) {
        CenteredTitleHeader(
            id = R.string.recently_played,
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 8.dp
            )
        )
        RecentlyPlayedAlbums()
    }
}

@Composable
private fun RecentlyPlayedAlbums(
    context: Context = LocalContext.current,
    viewModel: HomeViewModel = hiltViewModel()
) {
    // Remember the albums so it doesn't shuffle again on every recomposition.
    val albums = remember { viewModel.albums }

    LazyRow {
        items(items = albums, itemContent = {
            Column {
                Image(
                    painter = rememberImagePainter(it.imageUrl),
                    contentDescription = stringResource(id = R.string.album),
                    modifier = Modifier
                        .size(150.dp)
                        .padding(vertical = 8.dp)
                        .clickable {
                            Toast
                                .makeText(context, it.albumName, Toast.LENGTH_SHORT)
                                .show()
                        }
                )
                InlineShuffleText(
                    textString = it.albumName,
                    modifier = Modifier
                        .width(150.dp)
                        .height(24.dp)
                        .padding(horizontal = 12.dp)
                )
            }
        })
    }
}