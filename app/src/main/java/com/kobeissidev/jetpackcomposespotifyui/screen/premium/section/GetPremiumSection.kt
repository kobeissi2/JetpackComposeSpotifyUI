package com.kobeissidev.jetpackcomposespotifyui.screen.premium.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.RoundedRippleButton
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.*

private const val LinkBegin = "Learn"

@Composable
fun GetPremiumSection(text: String = stringResource(id = R.string.terms_and_conditions)) {
    Column(modifier = Modifier.fillMaxSize()) {
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
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
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
                RoundedRippleButton(textId = R.string.get_premium)
            }
        }
        LinkText(
            text = text,
            startIndex = text.indexOf(LinkBegin),
            endIndex = text.length,
            textColor = SpotifyTextGrey,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
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
private fun LinkText(
    text: String,
    startIndex: Int,
    endIndex: Int,
    modifier: Modifier = Modifier,
    url: String = "https://www.spotify.com/us/premium/",
    tag: String = "URL",
    linkColor: Color = Color.White,
    textColor: Color = linkColor,
    fontSize: TextUnit = 14.sp,
    textAlign: TextAlign = TextAlign.Center,
) {
    if (url.isBlank()) {
        throw Exception("Url cannot be blank")
    }

    val annotatedLinkString = buildAnnotatedString {
        append(text)
        addStyle(
            style = SpanStyle(
                color = linkColor,
                fontSize = fontSize,
                textDecoration = TextDecoration.None
            ), start = startIndex, end = endIndex
        )
        // Attach a string annotation that stores a URL to the text "link"
        addStringAnnotation(
            tag = tag,
            annotation = url,
            start = startIndex,
            end = endIndex
        )
    }
    // UriHandler parse and opens URI inside AnnotatedString Item in Browse
    val uriHandler = LocalUriHandler.current
    // Clickable text returns position of text that is clicked in onClick callback
    ClickableText(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(),
        text = annotatedLinkString,
        style = MaterialTheme.typography.body2.copy(
            color = textColor,
            fontSize = fontSize,
            textAlign = textAlign
        ),
        onClick = {
            annotatedLinkString
                .getStringAnnotations(tag, it, it)
                .firstOrNull()?.let { uriHandler.openUri(it.item) }
        }
    )
}