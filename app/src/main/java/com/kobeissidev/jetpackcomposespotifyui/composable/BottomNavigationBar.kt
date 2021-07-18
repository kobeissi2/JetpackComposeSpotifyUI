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
import androidx.navigation.compose.currentBackStackEntryAsState
import coil.compose.rememberImagePainter
import com.kobeissidev.jetpackcomposespotifyui.navigation.BottomNavigationScreens

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
    items: List<BottomNavigationScreens>
) {
    BottomNavigation {
        val currentRoute = currentRoute(navController)
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    // If icon is available user it.
                    screen.icon?.let {
                        Icon(
                            imageVector = it,
                            contentDescription = ""
                        )
                    }
                    //Otherwise use the drawableId
                        ?: Icon(
                            painter = rememberImagePainter(data = screen.drawableId),
                            contentDescription = ""
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
                    // This if check gives us a "singleTop" behavior where we do not create a
                    // second instance of the composable if we are already on that destination
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route)
                    }
                }
            )
        }
    }
}


@Composable
private fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}