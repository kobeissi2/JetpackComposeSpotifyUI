package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun Header(
    @StringRes id: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = id),
        style = MaterialTheme.typography.h6.copy(
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold
        ),
        modifier = modifier.fillMaxWidth()
    )
}