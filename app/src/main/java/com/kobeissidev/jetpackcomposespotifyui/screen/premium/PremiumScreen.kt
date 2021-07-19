package com.kobeissidev.jetpackcomposespotifyui.screen.premium

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kobeissidev.jetpackcomposespotifyui.screen.premium.section.FeaturesSection
import com.kobeissidev.jetpackcomposespotifyui.screen.premium.section.GetPremiumSection

@Composable
fun PremiumScreen() {
    Column(
        Modifier.verticalScroll(
            state = rememberScrollState()
        )
    ) {
        GetPremiumSection()
        FeaturesSection()
    }
}