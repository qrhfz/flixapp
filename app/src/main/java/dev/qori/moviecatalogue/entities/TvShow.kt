package dev.qori.moviecatalogue.entities

data class TvShow(
    val title: String,
    val poster: String,
    val description: String,
    val releaseDate: String,
    val voteAverage: Double,
    val voteCount: Int,
    val numberOfSeasons: Int,
    val numberOfEpisodes: Int,
)
