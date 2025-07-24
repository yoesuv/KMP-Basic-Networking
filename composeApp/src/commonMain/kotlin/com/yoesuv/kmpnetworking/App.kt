package com.yoesuv.kmpnetworking

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yoesuv.kmpnetworking.core.route.AppRoute
import com.yoesuv.kmpnetworking.core.theme.AppColors
import com.yoesuv.kmpnetworking.feature.detail.DetailScreen
import com.yoesuv.kmpnetworking.feature.home.HomeScreen
import com.yoesuv.kmpnetworking.feature.splash.SplashScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = AppColors.EggShell
        ),
    ) {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = AppRoute.Splash
        ) {
            composable<AppRoute.Splash> { SplashScreen(navController) }
            composable<AppRoute.Home> { HomeScreen(navController) }
            composable<AppRoute.Detail> { DetailScreen() }
        }
    }
}