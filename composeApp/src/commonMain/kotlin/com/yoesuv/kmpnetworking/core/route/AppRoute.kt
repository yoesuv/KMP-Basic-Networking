package com.yoesuv.kmpnetworking.core.route

import kotlinx.serialization.Serializable

sealed class AppRoute {
    @Serializable
    data object Splash : AppRoute()
    @Serializable
    data object Home : AppRoute()
    @Serializable
    data object Detail : AppRoute()
}