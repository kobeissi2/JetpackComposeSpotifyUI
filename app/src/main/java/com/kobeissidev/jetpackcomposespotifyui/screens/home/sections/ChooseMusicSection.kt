package com.kobeissidev.jetpackcomposespotifyui.screens.home.sections

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.RippleButton

@Composable
fun ChooseMusicSection() {
    Row {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 8.dp,
                    vertical = 12.dp
                )
        ) {
            Text(
                text = stringResource(id = R.string.hey),
                style = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = stringResource(id = R.string.want_new_playlists),
                style = MaterialTheme.typography.body2.copy(textAlign = TextAlign.Center),
                modifier = Modifier.padding(start = 64.dp, end = 64.dp)
            )
            Spacer(modifier = Modifier.padding(top = 24.dp))
            ChooseMusicButton()
            Spacer(modifier = Modifier.padding(top = 16.dp))
            NotNowButton()
        }
    }

}

@Composable
private fun ChooseMusicButton(context: Context = LocalContext.current) {
    RippleButton(
        onClick = { Toast.makeText(context, R.string.choose_music, Toast.LENGTH_SHORT).show() },
        shape = RoundedCornerShape(50),
        ripple = rememberRipple(color = Color.Black)
    ) {
        Text(
            text = stringResource(id = R.string.choose_music).uppercase(),
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

@Composable
private fun NotNowButton(context: Context = LocalContext.current) {
    TextButton(
        onClick = { Toast.makeText(context, R.string.not_now, Toast.LENGTH_SHORT).show() }
    ) {
        Text(
            text = stringResource(id = R.string.not_now).uppercase(),
            style = MaterialTheme.typography.button.copy(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp
            ),
            modifier = Modifier.padding(
                vertical = 1.dp,
                horizontal = 48.dp
            )
        )
    }
}