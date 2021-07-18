package com.kobeissidev.jetpackcomposespotifyui.screens.premium.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.RoundedRippleButton
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.*

@Composable
fun GetPremiumSection() {
    Box(
        modifier = Modifier
            .height(275.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = SpotifyTriangleBlue,
                        shape = BlueTriangleShape
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = SpotifyTrianglePurple,
                        shape = PurpleTriangleShape
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = SpotifyTrianglePink,
                        shape = PinkTriangleShape
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        alpha = 0.5f,
                        brush = Brush.linearGradient(listOf(Color.Black, Color.Black))
                    )
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 128.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(id = R.string.take_control))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 64.dp)
            )
            RoundedRippleButton(textId = R.string.get_premium)
        }
    }
}