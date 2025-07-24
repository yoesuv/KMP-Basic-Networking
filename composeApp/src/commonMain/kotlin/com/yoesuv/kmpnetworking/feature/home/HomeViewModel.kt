package com.yoesuv.kmpnetworking.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yoesuv.kmpnetworking.core.network.PlaceApiService
import com.yoesuv.kmpnetworking.core.network.PlaceApiServiceImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val placeApiService: PlaceApiService = PlaceApiServiceImpl()
): ViewModel() {
    
    private val _uiState = MutableStateFlow<HomeUiState>(HomeUiState.Loading)
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()
    
    init {
        fetchPlaces()
    }
    
    fun fetchPlaces() {
        _uiState.value = HomeUiState.Loading
        viewModelScope.launch {
            try {
                val places = placeApiService.getPlaces()
                _uiState.value = HomeUiState.Success(places)
            } catch (e: Exception) {
                _uiState.value = HomeUiState.Error(e.message ?: "Unknown error occurred")
            }
        }
    }
}