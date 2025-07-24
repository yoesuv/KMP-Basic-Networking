package com.yoesuv.kmpnetworking.core.network

import com.yoesuv.kmpnetworking.core.models.PlaceModel

interface PlaceApiService {
    suspend fun getPlaces(): List<PlaceModel>
}