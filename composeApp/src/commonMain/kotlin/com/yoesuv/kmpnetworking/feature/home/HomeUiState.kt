package com.yoesuv.kmpnetworking.feature.home

import com.yoesuv.kmpnetworking.core.models.PlaceModel

/**
 * Represents the different states of the Home screen UI
 */
sealed class HomeUiState {
    /**
     * Loading state when data is being fetched
     */
    data object Loading : HomeUiState()
    
    /**
     * Success state when data has been successfully retrieved
     * @param places The list of places retrieved from the API
     */
    data class Success(val places: List<PlaceModel>) : HomeUiState()
    
    /**
     * Error state when an error occurs during data fetching
     * @param message The error message
     */
    data class Error(val message: String) : HomeUiState()
}
