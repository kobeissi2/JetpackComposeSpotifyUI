package com.kobeissidev.jetpackcomposespotifyui.composable

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RoundedRippleButton(
    @StringRes textId:Int,
    context: Context = LocalContext.current
) {
    RippleButton(
        onClick = { Toast.makeText(context, textId, Toast.LENGTH_SHORT).show() },
        shape = RoundedCornerShape(50),
        ripple = rememberRipple(color = Color.Black)
    ) {
        Text(
            text = stringResource(id = textId).uppercase(),
            style = MaterialTheme.typography.button.copy(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 0.sp
            ),
            modifier = Modifier.padding(
                vertical = 4.dp,
                horizontal = 48.dp
            )
        )
    }
}