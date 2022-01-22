package dev.qori.moviecatalogue.ui.movie

import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.entities.Movie
import org.junit.Assert.*

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
        assertEquals(movie, dummyMovie)
    }
}