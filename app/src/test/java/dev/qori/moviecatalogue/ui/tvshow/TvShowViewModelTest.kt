package dev.qori.moviecatalogue.ui.tvshow

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel
    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getShows() {
        val shows = viewModel.getShows()
        assertEquals(shows.size, 10)
    }
}