package com.kobeissidev.jetpackcomposespotifyui.home.recentlyplayed

import java.util.*

/**
 * Using online links to speed things up.
 */
private const val baseUrl = "https://static.billboard.com/files/media/"
private const val suffixUrl = "-album-covers-billboard-1000x1000-compressed.jpg"

data class Album(
    val artist: String,
    val name: String
) {
    val imageUrl get() = "${baseUrl}${artist.spaceReplaced}-${name.spaceReplaced}${suffixUrl}"

    val albumName get() = name.capitalizeWords()

    private val String.spaceReplaced get() = replace(' ', '-')
}

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

fun String.capitalizeWords(): String = split(" ").map { it.capitalized() }.joinToString(" ")

/**
 * Replacement for Kotlin's deprecated `capitalize()` function.
 */
fun String.capitalized(): String {
    return this.replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString()
    }
}