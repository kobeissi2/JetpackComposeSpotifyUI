package com.kobeissidev.jetpackcomposespotifyui.screen.home.model

import com.kobeissidev.jetpackcomposespotifyui.screen.HomeViewModel
import com.kobeissidev.jetpackcomposespotifyui.util.capitalizeWords

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
    val imageUrl get() = "${HomeViewModel.baseUrl}${artist.spaceReplaced}-${name.spaceReplaced}${HomeViewModel.suffixUrl}"

    /**
     * Capitalize the album name.
     */
    val albumName get() = name.capitalizeWords()
}