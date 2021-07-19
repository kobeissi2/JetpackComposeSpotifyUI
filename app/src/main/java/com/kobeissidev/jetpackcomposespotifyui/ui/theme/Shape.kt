package com.kobeissidev.jetpackcomposespotifyui.ui.theme

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)


val PurpleTriangleShape = GenericShape { size, _ ->
    lineTo(size.width, (size.height*.65).toFloat())
    lineTo(size.width, size.height)
    lineTo(0f, size.height)
}

val BlueTriangleShape = GenericShape { size, _ ->
    moveTo(size.width, 0f)
    lineTo(0f, 0f)
    lineTo(size.width, size.height)
}

val PinkTriangleShape = GenericShape { size, _ ->
    moveTo(size.width, size.height)
    lineTo(size.width / 2, size.height)
    lineTo(size.width, size.height / 2)
}