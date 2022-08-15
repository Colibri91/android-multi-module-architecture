package com.dolar.core.data.dtomodel.response.gamedetail


import com.squareup.moshi.Json

data class MetacriticPlatform(
    @Json(name = "metascore")
    val metascore: Int?,
    @Json(name = "url")
    val url: String?
)