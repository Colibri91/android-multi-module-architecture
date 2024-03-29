package com.dolar.core.data.dtomodel.response.gamelist


import com.squareup.moshi.Json

data class GameListResponse(
    @Json(name = "count")
    val count: Int?,
    @Json(name = "next")
    val next: String?,
    @Json(name = "previous")
    val previous: String?,
    @Json(name = "results")
    val results: List<Result>?
)