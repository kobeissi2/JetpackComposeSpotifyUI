package com.kobeissidev.jetpackcomposespotifyui.screen.home.model

import com.kobeissidev.jetpackcomposespotifyui.screen.home.HomeViewModel
import com.kobeissidev.jetpackcomposespotifyui.util.wordsCapitalized
import com.kobeissidev.jetpackcomposespotifyui.util.spaceReplaced

data class Album(
    val artist: String,
    private val name: String
) {
    /**
     * Build the url as it follows the same pattern.
     */
    val imageUrl get() = "${HomeViewModel.baseUrl}${artist.spaceReplaced}-${name.spaceReplaced}${HomeViewModel.suffixUrl}"

    /**
     * Capitalize the album name.
     */
    val albumName get() = name.wordsCapitalized
}