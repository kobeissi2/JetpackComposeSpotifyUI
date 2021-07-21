package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun CenteredTitleHeader(
    @StringRes id: Int,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.h6.copy(
        fontSize = 16.sp,
        fontWeight = FontWeight.ExtraBold
    )
) {
    Text(
        text = stringResource(id = id),
        style = style.copy(textAlign = TextAlign.Center),
        modifier = modifier.fillMaxWidth()
    )
}