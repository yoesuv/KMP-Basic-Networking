package com.yoesuv.kmpnetworking.core.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data model for Place response
 * JSON structure:
 * {
 *   "nama": "Alun Alun Malang",
 *   "lokasi": "Kota Malang",
 *   "deskripsi": "alun alun ini baru saja dipermak pada tahun 2015...",
 *   "thumbnail": "https://lh3.googleusercontent.com/-7To0y-nnYak/VqQYjBWAwoI/AAAAAAAACf8/r_sAJ-dgsL8/s250-Ic42/thumbnail_alun_alun_malang.jpg",
 *   "gambar": "https://lh3.googleusercontent.com/-rTHiiW3vPMk/VqQXrbG5u6I/AAAAAAAACfs/buFhkMyTN98/s600-Ic42/alun_alun_malang.jpg"
 * }
 */
@Serializable
data class PlaceModel(
    @SerialName("nama")
    val name: String,

    @SerialName("lokasi")
    val location: String,

    @SerialName("deskripsi")
    val description: String,

    @SerialName("thumbnail")
    val thumbnailUrl: String,

    @SerialName("gambar")
    val imageUrl: String
)
