package com.kobeissidev.jetpackcomposespotifyui.screen.home.section

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import com.kobeissidev.jetpackcomposespotifyui.R

@Composable
fun TopRowSection(context: Context = LocalContext.current) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(imageVector = Icons.Outlined.PersonOutline) {
            Toast.makeText(context, R.string.user, Toast.LENGTH_SHORT).show()
        }
        IconButton(imageVector = Icons.Outlined.Settings) {
            Toast.makeText(context, R.string.settings, Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
private fun IconButton(
    imageVector: ImageVector,
    contentDescription: String? = null,
    onClick: () -> Unit
) {
    androidx.compose.material.IconButton(onClick = onClick) {
        Icon(
            imageVector,
            contentDescription = contentDescription,
            tint = Color.White
        )
    }
}