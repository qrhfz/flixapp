package dev.qori.moviecatalogue.ui.movie

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val movies = viewModel.getMovies()
        assertEquals(movies.size, 10)
    }
}