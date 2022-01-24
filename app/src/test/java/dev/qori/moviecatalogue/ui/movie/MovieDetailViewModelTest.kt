package dev.qori.moviecatalogue.ui.movie

import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.entities.Movie
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MovieDetailViewModelTest {
    private lateinit var viewModel: MovieDetailViewModel
    private lateinit var dummyMovie: Movie
    @Before
    fun setUp() {
        viewModel = MovieDetailViewModel()
        viewModel.id = 332562
        dummyMovie = MovieData.list[0]
    }

    @Test
    fun getMovieDetail() {
        val movie = viewModel.getMovieDetail()
        assertNotNull(movie)
        assertEquals(movie?.title, dummyMovie.title)
        assertEquals(movie?.poster, dummyMovie.poster)
        assertEquals(movie?.score, dummyMovie.score)
        assertEquals(movie?.ageRating, dummyMovie.ageRating)
        assertEquals(movie?.description, dummyMovie.description)
        assertEquals(movie?.id, dummyMovie.id)
        assertEquals(movie?.releaseYear, dummyMovie.releaseYear)
        assertEquals(movie?.genres, dummyMovie.genres)
    }
}