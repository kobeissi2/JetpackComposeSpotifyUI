package com.kobeissidev.jetpackcomposespotifyui.composable

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.currentBackStackEntryAsState
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.navigation.BottomNavigationScreens

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
    items: List<BottomNavigationScreens>
) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    // If icon is available, use it.
                    screen.icon?.let {
                        Icon(
                            imageVector = it,
                            contentDescription = null
                        )
                    }
                    //Otherwise use the drawableId
                        ?: Icon(
                            painter = rememberImagePainter(data = screen.drawableId),
                            contentDescription = null
                        )
                },
                label = {
                    Text(
                        stringResource(id = screen.resourceId),
                        maxLines = 1,
                        fontSize = 10.sp
                    )
                },
                selected = currentRoute == screen.route,
                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigate(
                            route = screen.route,
                            navOptions = NavOptions
                                .Builder()
                                .setPopUpTo(
                                    BottomNavigationScreens.Home.route,
                                    screen.route == BottomNavigationScreens.Home.route
                                )
                                .build()
                        )
                    }
                }
            )
        }
    }
}