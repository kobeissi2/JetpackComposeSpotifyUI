package com.kobeissidev.jetpackcomposespotifyui.util

import java.util.Locale

/**
 * Capitalize every letter of every word
 */
fun String.capitalizeWords() = split(" ").joinToString(" ") { it.capitalized() }

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