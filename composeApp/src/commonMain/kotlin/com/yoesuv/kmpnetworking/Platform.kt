package com.yoesuv.kmpnetworking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform