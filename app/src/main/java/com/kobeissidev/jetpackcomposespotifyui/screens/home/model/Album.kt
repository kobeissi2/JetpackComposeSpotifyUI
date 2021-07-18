package com.kobeissidev.jetpackcomposespotifyui.screens.home.model

import com.kobeissidev.jetpackcomposespotifyui.util.capitalizeWords

/**
 * Using online links to speed things up.
 */
private const val baseUrl = "https://static.billboard.com/files/media/"
private const val suffixUrl = "-album-covers-billboard-1000x1000-compressed.jpg"

data class Album(
    val artist: String,
    val name: String
) {

    /**
     * Make the string more human readable.
     */
    private val String.spaceReplaced get() = replace(' ', '-')

    /**
     * Build the url as it follows the same pattern.
     */
    val imageUrl get() = "${baseUrl}${artist.spaceReplaced}-${name.spaceReplaced}${suffixUrl}"

    /**
     * Capitalize the album name.
     */
    val albumName get() = name.capitalizeWords()
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