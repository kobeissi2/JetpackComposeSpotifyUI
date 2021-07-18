package com.kobeissidev.jetpackcomposespotifyui.screens.home.sections

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.Header
import com.kobeissidev.jetpackcomposespotifyui.screens.home.model.albums
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.SpotifyShuffleBlue

@Composable
fun RecentlyPlayedSection() {
    Column(modifier = Modifier.padding(8.dp)) {
        Header(
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
private fun RecentlyPlayedAlbums(context: Context = LocalContext.current) {
    // Remember the albums so it doesn't shuffle again on every recomposition.
    val albums = remember { albums }
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
                AlbumTitle(it.albumName)
            }
        })
    }
}

@Composable
private fun AlbumTitle(albumName: String) {
    val myId = "inlineContent"
    val text = buildAnnotatedString {
        // Append a placeholder string "[icon]" and attach an annotation "inlineContent" on it.
        appendInlineContent(myId, "[icon]")
        append(albumName)
    }

    val inlineContent = mapOf(
        Pair(
            // This tells the [CoreText] to replace the placeholder string "[icon]" by
            // the composable given in the [InlineTextContent] object.
            myId,
            InlineTextContent(
                // Placeholder tells text layout the expected size and vertical alignment of
                // children composable.
                Placeholder(
                    width = 22.sp,
                    height = 14.sp,
                    placeholderVerticalAlign = PlaceholderVerticalAlign.TextBottom
                )
            ) {
                // This Icon will fill maximum size, which is specified by the [Placeholder]
                // above. Notice the width and height in [Placeholder] are specified in TextUnit,
                // and are converted into pixel by text layout.
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20))
                        .height(12.dp)
                        .width(16.dp)
                        .background(SpotifyShuffleBlue)
                ) {
                    Icon(
                        painter = rememberVectorPainter(Icons.Filled.Shuffle),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.Center)
                    )
                }
            }
        )
    )

    Text(
        text = text,
        modifier = Modifier
            .width(150.dp)
            .height(24.dp)
            .padding(horizontal = 12.dp),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        inlineContent = inlineContent,
        style = MaterialTheme.typography.body2.copy(
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
    )
}