package com.dolar.core.data.dtomodel.response.gamecommons


import com.squareup.moshi.Json

data class Requirements(
    @Json(name = "minimum")
    val minimum: String?,
    @Json(name = "recommended")
    val recommended: String?
)