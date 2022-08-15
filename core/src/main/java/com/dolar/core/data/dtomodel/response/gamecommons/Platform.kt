package com.dolar.core.data.dtomodel.response.gamecommons


import com.squareup.moshi.Json

data class Platform(
    @Json(name = "platform")
    val platform: PlatformX?,
    @Json(name = "released_at")
    val releasedAt: String?,
    @Json(name = "requirements")
    val requirements: Requirements?
)