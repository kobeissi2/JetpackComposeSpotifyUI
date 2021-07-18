package com.kobeissidev.jetpackcomposespotifyui.screens.home.sections

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.Header

@Composable
fun PlayOnDemandSection(context: Context = LocalContext.current) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 36.dp)
    ) {
        Header(id = R.string.play_on_demand)
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
                .clickable {
                    Toast
                        .makeText(context, R.string.play_on_demand, Toast.LENGTH_SHORT)
                        .show()
                }
        )
    }
}