package com.kobeissidev.jetpackcomposespotifyui.screen.home

import androidx.lifecycle.ViewModel
import com.kobeissidev.jetpackcomposespotifyui.screen.home.model.Album
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    companion object {
        /**
         * Using online links to speed things up.
         */
        const val baseUrl = "https://static.billboard.com/files/media/"
        const val suffixUrl = "-album-covers-billboard-1000x1000-compressed.jpg"
    }

    /**
     * Grab 10 albums that are shuffled every time it is called.
     */
    val albums = listOf(
        Album(artist = "Taylor Swift", name = "1989"),
        Album(artist = "Lady Gaga", name = "Fame Monster"),
        Album(artist = "Beyonce", name = "Beyonce greatest"),
        Album(artist = "The Beatles", name = "Abbey Road"),
        Album(artist = "Blink 182", name = "Enema of the State"),
        Album(artist = "The Notorious B I G", name = "Ready to Die"),
        Album(artist = "Led Zeppelin", name = "Led Zeppelin greatest"),
        Album(artist = "Pink Floyd", name = "Dark Side of the Moon"),
        Album(artist = "Elvis Presley", name = "Elvis Presley"),
        Album(artist = "Nas", name = "Illmatic"),
        Album(artist = "Bruce Springsteen", name = "Born in the USA"),
        Album(artist = "Fleetwood Mac", name = "Rumours"),
    ).shuffled().take(10)
}