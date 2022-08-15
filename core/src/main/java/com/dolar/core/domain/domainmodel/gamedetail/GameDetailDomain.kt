package com.dolar.core.domain.domainmodel.gamedetail

import com.dolar.core.data.dtomodel.response.gamecommons.AddedByStatus
import com.dolar.core.data.dtomodel.response.gamecommons.EsrbRating
import com.dolar.core.data.dtomodel.response.gamecommons.Platform
import com.dolar.core.data.dtomodel.response.gamecommons.Ratings
import com.dolar.core.data.dtomodel.response.gamedetail.MetacriticPlatform
import com.dolar.core.data.dtomodel.response.gamedetail.Reactions

/**
 * Created by R. Mert Dolar on 15.08.2022.
 */
data class GameDetailDomain(val achievementsCount: Int?,
                            val added: Int?,
                            val addedByStatus: AddedByStatus?,
                            val additionsCount: Int?,
                            val alternativeNames: List<String>?,
                            val backgroundImage: String?,
                            val backgroundImageAdditional: String?,
                            val creatorsCount: Int?,
                            val description: String?,
                            val esrbRating: EsrbRating?,
                            val gameSeriesCount: Int?,
                            val id: Int?,
                            val metacritic: Int?,
                            val metacriticPlatforms: List<MetacriticPlatform>?,
                            val metacriticUrl: String?,
                            val moviesCount: Int?,
                            val name: String?,
                            val nameOriginal: String?,
                            val parentAchievementsCount: String?,
                            val parentsCount: Int?,
                            val platforms: List<Platform>?,
                            val playtime: Int?,
                            val rating: Int?,
                            val ratingTop: Int?,
                            val ratings: Ratings?,
                            val ratingsCount: Int?,
                            val reactions: Reactions?,
                            val redditCount: Int?,
                            val redditDescription: String?,
                            val redditLogo: String?,
                            val redditName: String?,
                            val redditUrl: String?,
                            val released: String?,
                            val reviewsTextCount: String?,
                            val screenshotsCount: Int?,
                            val slug: String?,
                            val suggestionsCount: Int?,
                            val tba: Boolean?,
                            val twitchCount: String?,
                            val updated: String?,
                            val website: String?,
                            val youtubeCount: String?)
