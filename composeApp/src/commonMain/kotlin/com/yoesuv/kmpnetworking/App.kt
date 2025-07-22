package com.yoesuv.kmpnetworking

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.yoesuv.kmpnetworking.feature.splash.SplashScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        SplashScreen()
    }
}