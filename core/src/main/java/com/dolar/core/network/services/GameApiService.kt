package com.dolar.core.network.services

import com.dolar.core.data.dtomodel.response.gamedetail.GameDetailResponse
import com.dolar.core.data.dtomodel.response.gamelist.GameListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by R. Mert Dolar on 15.08.2022.
 */
interface GameApiService {

    @GET("games")
    suspend fun getListOfGames(
        @Query("page") page: Int,
        @Query("page_size") pageSize: Int,
        @Query("search") search: String? = null
    ): GameListResponse

    @GET("games/{id}")
    suspend fun getGameDetail(
        @Path("id") id: Int
    ): GameDetailResponse
}