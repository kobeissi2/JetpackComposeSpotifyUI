package com.kobeissidev.jetpackcomposedemo.home

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun IconButton(
    imageVector: ImageVector,
    contentDescription: String?,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector,
            contentDescription = contentDescription,
            tint = Color.White
        )
    }
}