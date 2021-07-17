package com.kobeissidev.jetpackcomposespotifyui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChooseMusic() {
    Row(
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(
                text = "Hey",
                style = MaterialTheme.typography.h4.copy(
                    color = MaterialTheme.colors.onSurface,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "Want new playlists? Pick some music you like.",
                style = MaterialTheme.typography.body1.copy(
                    color = MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.padding(start = 48.dp, end = 48.dp)
            )
            Spacer(modifier = Modifier.padding(top = 24.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(50)
            ) {
                Text(
                    text = "Choose Music".uppercase(),
                    style = MaterialTheme.typography.button.copy(
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = 0.sp
                    ),
                    modifier = Modifier.padding(vertical = 4.dp, horizontal = 48.dp)
                )
            }
            Spacer(modifier = Modifier.padding(top = 16.dp))
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Not Now".uppercase(),
                    modifier = Modifier.padding(vertical = 4.dp, horizontal = 48.dp)
                )
            }
        }
    }

}