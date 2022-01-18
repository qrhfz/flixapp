package dev.qori.moviecatalogue.entities

data class TvShow(
    val id: Int,
    val title: String,
    val poster: String,
    val description: String,
    val firstSeasonYear: Int,
    val lastSeasonYear: Int,
    val score: Int,
    val ageRating: TvAgeRating,
    val genres: List<String>,
)
