package com.yoesuv.kmpnetworking.feature.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.yoesuv.kmpnetworking.core.theme.AppColors
import com.yoesuv.kmpnetworking.feature.components.AppTopBar
import kmpnetworking.composeapp.generated.resources.Res
import kmpnetworking.composeapp.generated.resources.detail_place
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(nav: NavHostController) {
    Scaffold(
        containerColor = AppColors.EggShell,
        topBar = {
            AppTopBar(
                title = stringResource(Res.string.detail_place),
                canBack = true,
                navigateUp = {
                    nav.navigateUp()
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Text("Detail")
        }
    }
}