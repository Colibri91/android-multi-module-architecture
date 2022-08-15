package com.dolar.core.data.dtomodel.response.gamedetail


import com.dolar.core.data.dtomodel.response.gamecommons.AddedByStatus
import com.dolar.core.data.dtomodel.response.gamecommons.EsrbRating
import com.dolar.core.data.dtomodel.response.gamecommons.Platform
import com.dolar.core.data.dtomodel.response.gamecommons.Ratings
import com.squareup.moshi.Json

data class GameDetailResponse(
    @Json(name = "achievements_count")
    val achievementsCount: Int?,
    @Json(name = "added")
    val added: Int?,
    @Json(name = "added_by_status")
    val addedByStatus: AddedByStatus?,
    @Json(name = "additions_count")
    val additionsCount: Int?,
    @Json(name = "alternative_names")
    val alternativeNames: List<String>?,
    @Json(name = "background_image")
    val backgroundImage: String?,
    @Json(name = "background_image_additional")
    val backgroundImageAdditional: String?,
    @Json(name = "creators_count")
    val creatorsCount: Int?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "esrb_rating")
    val esrbRating: EsrbRating?,
    @Json(name = "game_series_count")
    val gameSeriesCount: Int?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "metacritic")
    val metacritic: Int?,
    @Json(name = "metacritic_platforms")
    val metacriticPlatforms: List<MetacriticPlatform>?,
    @Json(name = "metacritic_url")
    val metacriticUrl: String?,
    @Json(name = "movies_count")
    val moviesCount: Int?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "name_original")
    val nameOriginal: String?,
    @Json(name = "parent_achievements_count")
    val parentAchievementsCount: String?,
    @Json(name = "parents_count")
    val parentsCount: Int?,
    @Json(name = "platforms")
    val platforms: List<Platform>?,
    @Json(name = "playtime")
    val playtime: Int?,
    @Json(name = "rating")
    val rating: Int?,
    @Json(name = "rating_top")
    val ratingTop: Int?,
    @Json(name = "ratings")
    val ratings: Ratings?,
    @Json(name = "ratings_count")
    val ratingsCount: Int?,
    @Json(name = "reactions")
    val reactions: Reactions?,
    @Json(name = "reddit_count")
    val redditCount: Int?,
    @Json(name = "reddit_description")
    val redditDescription: String?,
    @Json(name = "reddit_logo")
    val redditLogo: String?,
    @Json(name = "reddit_name")
    val redditName: String?,
    @Json(name = "reddit_url")
    val redditUrl: String?,
    @Json(name = "released")
    val released: String?,
    @Json(name = "reviews_text_count")
    val reviewsTextCount: String?,
    @Json(name = "screenshots_count")
    val screenshotsCount: Int?,
    @Json(name = "slug")
    val slug: String?,
    @Json(name = "suggestions_count")
    val suggestionsCount: Int?,
    @Json(name = "tba")
    val tba: Boolean?,
    @Json(name = "twitch_count")
    val twitchCount: String?,
    @Json(name = "updated")
    val updated: String?,
    @Json(name = "website")
    val website: String?,
    @Json(name = "youtube_count")
    val youtubeCount: String?
)