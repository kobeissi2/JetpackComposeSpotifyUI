package com.kobeissidev.jetpackcomposespotifyui.screen.playlist

import androidx.lifecycle.ViewModel
import com.kobeissidev.jetpackcomposespotifyui.screen.playlist.model.Playlist
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlaylistViewModel @Inject constructor() : ViewModel() {

    val playlists = listOf(
        Playlist("The Best Of 'Now That's What I Call Music", "Matt Jacobs"),
        Playlist("Discover Weekly", "Spotify"),
        Playlist("PB Bebes", "Matt Jacobs"),
        Playlist("Lady Gaga - The Fame", "Lady Gaga"),
        Playlist("Master of None Season 1", "Master of None"),
        Playlist("Best of Queen", "Queen"),
        Playlist("Pop Hits", "Spotify"),
        Playlist("Rap Caviar", "Spotify")
    )
}