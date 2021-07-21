package com.kobeissidev.jetpackcomposespotifyui.screen.search.sections

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.kobeissidev.jetpackcomposespotifyui.screen.search.SearchViewModel
import com.kobeissidev.jetpackcomposespotifyui.ui.theme.gradientBackground

@ExperimentalFoundationApi
@Composable
fun SearchBodySection(
    viewModel: SearchViewModel = hiltViewModel()
) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            bottom = 64.dp,
            top = 2.dp,
            start = 2.dp,
            end = 2.dp
        )
    ) {
        items(viewModel.categories) { (name, colorList) ->
            CategoryBox(
                text = name,
                gradientColors = colorList
            )
        }
    }
}

@Composable
private fun CategoryBox(
    text: String,
    gradientColors: List<Color>,
    context: Context = LocalContext.current
) {
    Box(
        modifier = Modifier
            .height(120.dp)
            .width(300.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(10))
            .gradientBackground(
                colors = gradientColors,
                angle = 270f
            )
            .clickable {
                Toast
                    .makeText(context, text, Toast.LENGTH_SHORT)
                    .show()
            }
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold,
        )
    }
}