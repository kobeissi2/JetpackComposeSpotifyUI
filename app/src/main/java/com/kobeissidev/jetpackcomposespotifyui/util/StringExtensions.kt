package com.kobeissidev.jetpackcomposespotifyui.util

import java.util.Locale

/**
 * Make the string more human readable.
 */
val String.spaceReplaced get() = replace(' ', '-')

/**
 * Capitalize every letter of every word
 */
val String.wordsCapitalized get() = split(" ").joinToString(" ") { it.firstLetterCapitalized }

/**
 * Replacement for Kotlin's deprecated `capitalize()` function.
 */
val String.firstLetterCapitalized
    get() = replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString()

    }