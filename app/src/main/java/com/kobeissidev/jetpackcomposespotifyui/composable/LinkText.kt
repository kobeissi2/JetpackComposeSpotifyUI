package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LinkText(
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