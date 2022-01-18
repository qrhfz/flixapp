package dev.qori.moviecatalogue.entities

data class Movie(
    val title: String,
    val poster: String,
    val description: String,
    val releaseDate: String,
    val voteAverage: Double,
    val voteCount: Int,
)