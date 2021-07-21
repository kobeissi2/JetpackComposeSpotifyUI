package com.kobeissidev.jetpackcomposespotifyui.screen.search

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject
import android.graphics.Color as GraphicsColor

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {

    private val random = Random()
    private val randomDarkColor
        get() = Color(
            GraphicsColor.argb(
                255,
                random.nextInt(127),
                random.nextInt(127),
                random.nextInt(127)
            )
        )
    private val randomColor
        get() = Color(
            GraphicsColor.argb(
                255,
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)
            )
        )

    val categories = listOf(
        "New Releases" to listOf(randomDarkColor, randomColor),
        "Charts" to listOf(randomDarkColor, randomColor),
        "Amplify: Women" to listOf(randomDarkColor, randomColor),
        "Hip-Hop" to listOf(randomDarkColor, randomColor),
        "Mood" to listOf(randomDarkColor, randomColor),
        "Pop" to listOf(randomDarkColor, randomColor),
        "Workout" to listOf(randomDarkColor, randomColor),
        "Country" to listOf(randomDarkColor, randomColor),
        "Rock" to listOf(randomDarkColor, randomColor),
        "Metal" to listOf(randomDarkColor, randomColor)
    )

}