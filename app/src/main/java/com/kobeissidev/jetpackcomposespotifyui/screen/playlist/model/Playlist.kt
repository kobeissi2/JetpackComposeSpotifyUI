package com.kobeissidev.jetpackcomposespotifyui.screen.playlist.model

import androidx.annotation.DrawableRes

data class Playlist(
    val title: String,
    val creator: String,
    @DrawableRes val iconId: Int? = null
)
