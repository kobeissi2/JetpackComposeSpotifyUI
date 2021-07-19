package com.kobeissidev.jetpackcomposespotifyui.screen.premium.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.LinkText
import com.kobeissidev.jetpackcomposespotifyui.composable.RoundedRippleButton
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.*

private const val LinkBegin = "Learn"

@Composable
fun GetPremiumSection() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .height(275.dp)
                .fillMaxWidth()
        ) {
            TriangleBackground()
            TriangleOverlay()
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TermsAndConditionsLink()
            PremiumFeatureSection()
        }
    }
}

@Composable
private fun TriangleBackground() {
    Box(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
    ) {
        TriangleBox(
            color = SpotifyTriangleBlue,
            shape = BlueTriangleShape
        )
        TriangleBox(
            color = SpotifyTrianglePurple,
            shape = PurpleTriangleShape
        )
        TriangleBox(
            color = SpotifyTrianglePink,
            shape = PinkTriangleShape
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
}

@Composable
private fun TriangleBox(
    color: Color,
    shape: Shape
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = color,
                shape = shape
            )
    )
}

@Composable
private fun TriangleOverlay() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TakeControlText()
        RoundedRippleButton(textId = R.string.get_premium)
    }
}

@Composable
private fun TakeControlText() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 84.dp,
                start = 42.dp,
                end = 42.dp
            ),
        text = stringResource(id = R.string.take_control),
        maxLines = 2,
        style = MaterialTheme.typography.h4.copy(
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )
    )
}

@Composable
fun TermsAndConditionsLink(
    text: String = stringResource(id = R.string.terms_and_conditions)
) {
    LinkText(
        text = text,
        startIndex = text.indexOf(LinkBegin),
        endIndex = text.length,
        textColor = SpotifyTextGrey
    )
}

@Composable
private fun PremiumFeatureSection() {
    Text(
        text = stringResource(id = R.string.heres_what_you_get),
        style = MaterialTheme.typography.h6.copy(
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp
        ),
        modifier = Modifier.padding(16.dp)
    )
    HorizontalSpacer()
    DownloadImage()
    Text(
        text = stringResource(id = R.string.download_music),
        style = MaterialTheme.typography.h4.copy(
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            letterSpacing = 0.sp
        )
    )
    HorizontalSpacer(verticalPadding = 6.dp)
    Text(
        text = stringResource(id = R.string.listen_anywhere),
        style = MaterialTheme.typography.body1.copy(
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.sp
        )
    )
}

@Composable
fun DownloadImage() {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .padding(16.dp)
            .background(
                color = SpotifyDownloadBlue,
                shape = RoundedCornerShape(50)
            )
    ) {
        Icon(
            painter = rememberImagePainter(data = R.drawable.ic_music_note),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .height(75.dp)
                .width(75.dp)
                .align(Alignment.Center)
        )
        Icon(
            imageVector = Icons.Filled.ArrowDownward,
            contentDescription = null,
            tint = SpotifyTriangleBlue,
            modifier = Modifier
                .height(32.dp)
                .width(32.dp)
                .absoluteOffset(
                    x = 32.dp,
                    y = 36.dp
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(50)
                )
        )
    }
}

@Composable
private fun HorizontalSpacer(
    verticalPadding: Dp = 8.dp
) {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = verticalPadding)
    )
}