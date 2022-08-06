package com.conamobile.bottomnavigationbarjitpackcomposeexample.ui.main.util.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.conamobile.bottomnavigationbarjitpackcomposeexample.ui.main.screens.bookmarks.BookmarksScreen
import com.conamobile.bottomnavigationbarjitpackcomposeexample.ui.main.screens.categories.CategoriesScreen
import com.conamobile.bottomnavigationbarjitpackcomposeexample.ui.main.screens.home.HomeScreen
import com.conamobile.bottomnavigationbarjitpackcomposeexample.ui.main.screens.settings.SettingsScreen
import com.conamobile.bottomnavigationbarjitpackcomposeexample.ui.main.util.sealed.BottomBarScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Categories.route) {
            CategoriesScreen()
        }
        composable(route = BottomBarScreen.Bookmarks.route) {
            BookmarksScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}