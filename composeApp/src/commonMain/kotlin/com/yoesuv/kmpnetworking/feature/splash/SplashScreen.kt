package com.yoesuv.kmpnetworking.feature.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yoesuv.kmpnetworking.core.route.AppRoute
import com.yoesuv.kmpnetworking.core.theme.AppColors
import kmpnetworking.composeapp.generated.resources.Res
import kmpnetworking.composeapp.generated.resources.app_name
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen(nav: NavHostController) {

    LaunchedEffect(Unit) {
        delay(2000)
        nav.navigate(AppRoute.Home) {
            popUpTo(AppRoute.Splash) {
                inclusive = true
            }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
            .background(AppColors.EggShell),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            stringResource(Res.string.app_name), style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
            )
        )
    }
}

@Preview
@Composable
fun PreviewSplashScreen() {
    MaterialTheme {
        SplashScreen(rememberNavController())
    }
}