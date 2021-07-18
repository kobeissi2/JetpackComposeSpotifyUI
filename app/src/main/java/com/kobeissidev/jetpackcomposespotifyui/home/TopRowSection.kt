package com.kobeissidev.jetpackcomposespotifyui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.kobeissidev.jetpackcomposespotifyui.R
import com.kobeissidev.jetpackcomposespotifyui.composable.IconButton

@Composable
fun TopRowSection() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(
            imageVector = Icons.Outlined.PersonOutline,
            contentDescription = stringResource(id = R.string.user_icon_content_description)
        ) {
            /**
             * TODO
             */
        }
        IconButton(
            imageVector = Icons.Outlined.Settings,
            contentDescription = stringResource(id = R.string.settings_icon_content_description)
        ) {

            /**
             * TODO
             */
        }
    }
}
