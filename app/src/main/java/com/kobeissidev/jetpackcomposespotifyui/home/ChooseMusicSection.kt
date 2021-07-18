package com.kobeissidev.jetpackcomposespotifyui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                    vertical = 2.dp
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
            Spacer(modifier = Modifier.padding(top = 16.dp))
            ChooseMusicButton()
            Spacer(modifier = Modifier.padding(top = 16.dp))
            NotNowButton()
        }
    }

}

@Composable
private fun ChooseMusicButton() {
    RippleButton(
        onClick = {
            /**
             * TODO
             */
        },
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
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 48.dp)
        )
    }
}

@Composable
private fun NotNowButton() {
    Text(
        text = stringResource(id = R.string.not_now).uppercase(),
        style = MaterialTheme.typography.button.copy(
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp
        ),
        modifier = Modifier
            .padding(vertical = 1.dp, horizontal = 48.dp)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                /**
                 * TODO
                 */
            }
    )
}