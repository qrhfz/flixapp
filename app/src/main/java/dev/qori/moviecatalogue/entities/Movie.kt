package dev.qori.moviecatalogue.entities

data class Movie(
    val id: Int,
    val title: String,
    val poster: String,
    val description: String,
    val releaseYear: Int,
    val score: Int,
    val ageRating: MovieAgeRating,
    val genres: List<String>,
)