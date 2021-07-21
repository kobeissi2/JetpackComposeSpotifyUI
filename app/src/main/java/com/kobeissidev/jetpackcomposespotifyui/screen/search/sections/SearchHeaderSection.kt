package com.kobeissidev.jetpackcomposespotifyui.screen.search.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.CenteredTitleHeader

@Composable
fun SearchHeaderSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.28f)
            .padding(all = 1.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CenteredTitleHeader(
                id = R.string.search,
                style = MaterialTheme.typography.h4.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp
                ),
                modifier = Modifier.padding(top = 60.dp)
            )
            SearchBar(
                hint = stringResource(id = R.string.search_placeholder),
                modifier = Modifier
                    .fillMaxWidth(0.96f)
                    .padding(top = 28.dp)
            )
        }
    }
}

/**
 * Hack since the official TextField does not support centered hints and icons.
 */
@Composable
private fun SearchBar(
    modifier: Modifier = Modifier,
    hint: String = "",
    onSearch: (String) -> Unit = {}
) {
    var text by remember { mutableStateOf("") }
    var isHintDisplayed by remember { mutableStateOf(hint != "") }
    val focusRequester = remember { FocusRequester() }

    val textStyle = MaterialTheme.typography.body1.copy(
        color = Color.Black,
        fontWeight = FontWeight.Bold
    )

    val rowModifier = Modifier
        .fillMaxWidth()
        .shadow(
            elevation = 4.dp,
            shape = RoundedCornerShape(10)
        )
        .background(
            color = Color.White,
            shape = RoundedCornerShape(10)
        )
        .padding(all = 10.dp)

    Box(modifier = modifier) {
        CenteredRow(modifier = rowModifier) {
            SearchIcon()
            BasicTextField(
                value = text,
                onValueChange = {
                    text = it
                    onSearch(it)
                },
                maxLines = 1,
                singleLine = true,
                textStyle = textStyle,
                modifier = Modifier
                    .focusRequester(focusRequester)
                    .onFocusChanged { isHintDisplayed = !it.isFocused }
            )
        }
        if (isHintDisplayed) {
            CenteredRow(modifier = rowModifier.clickable { focusRequester.requestFocus() }) {
                SearchIcon()
                Text(
                    text = hint,
                    style = textStyle
                )
            }
        }
    }
}

@Composable
private fun CenteredRow(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        content = content
    )
}

@Composable
private fun SearchIcon() {
    Icon(
        imageVector = Icons.Outlined.Search,
        contentDescription = null,
        tint = Color.Black,
        modifier = Modifier.padding(end = 8.dp)
    )
}