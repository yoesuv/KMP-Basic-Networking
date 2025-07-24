package com.yoesuv.kmpnetworking.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.yoesuv.kmpnetworking.core.route.AppRoute


@Composable
fun HomeScreen(
    nav: NavHostController,
) {
    val viewModel = viewModel { HomeViewModel() }
    val uiState by viewModel.uiState.collectAsState()

    Scaffold { innerPadding ->
        when (uiState) {
            is HomeUiState.Loading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }

            is HomeUiState.Success -> {
                val places = (uiState as HomeUiState.Success).places
                LazyColumn(modifier = Modifier.padding(innerPadding)) {
                    items(places) { place ->
                        ItemPlace(placeModel = place, onItemClick = {
                            nav.navigate(AppRoute.Detail)
                        })
                    }
                }
            }

            is HomeUiState.Error -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text((uiState as HomeUiState.Error).message)
                }
            }
        }
    }
}