package com.yoesuv.kmpnetworking.feature.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.yoesuv.kmpnetworking.core.route.AppRoute


@Composable
fun HomeScreen(nav: NavHostController) {
    Scaffold { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            items(10) {
                ItemPlace(onItemClick = {
                    nav.navigate(AppRoute.Detail)
                })
            }
        }
    }
}