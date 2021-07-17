package com.kobeissidev.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.kobeissidev.jetpackcomposedemo.home.ChooseMusic
import com.kobeissidev.jetpackcomposedemo.home.TopRow
import com.kobeissidev.jetpackcomposedemo.ui.theme.*
import com.kobeissidev.jetpackcomposedemo.ui.theme.SpotifyDarkPurple

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                SystemBar()
                Surface(
                    modifier = Modifier.padding(horizontal = 2.dp)
                ) {
                    Column {
                        Column(
                            modifier = Modifier
                                .gradientBackground(
                                    listOf(SpotifyPurple, SpotifyMidPurple, SpotifyDarkPurple),
                                    angle = -45f
                                )
                                .padding(bottom = 8.dp)
                        ) {
                            TopRow()
                            Spacer(modifier = Modifier.padding(top = 8.dp))
                            ChooseMusic()
                        }

                        Column {
                            Text(text = "Recently played")
                        }
                    }
                }
            }
        }
    }

    /**
     * Update the system bar's color.
     * I don't plan on reusing this so I'm just going to make it private.
     */
    @Composable
    private fun SystemBar() {
        val systemUiController = rememberSystemUiController()
        val useDarkIcons = MaterialTheme.colors.isLight

        SideEffect {
            // Update all of the system bar colors to be transparent, and use
            // dark icons if we're in light theme
            systemUiController.setSystemBarsColor(
                color = Color.Transparent,
                darkIcons = useDarkIcons
            )

            // setStatusBarsColor() and setNavigationBarsColor() also exist
        }
    }
}
