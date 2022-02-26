package dev.qori.moviecatalogue.entities

sealed interface Film

data class Movie(
    val id: Int,
    val title: String,
    val poster: String,
    val description: String,
    val releaseYear: Int,
    val score: Int,
    val ageRating: MovieAgeRating,
    val genres: List<String>,
): Film

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
): Film