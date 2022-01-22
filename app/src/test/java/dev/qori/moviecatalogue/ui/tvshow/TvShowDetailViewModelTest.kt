package dev.qori.moviecatalogue.ui.tvshow

import dev.qori.moviecatalogue.data.TvShowData
import dev.qori.moviecatalogue.entities.TvShow
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class TvShowDetailViewModelTest {
    private lateinit var viewModel: TvShowDetailViewModel
    private lateinit var dummyTvShow: TvShow
    @Before
    fun setUp(){
        viewModel = TvShowDetailViewModel()
        viewModel.id = 1412
        dummyTvShow = TvShowData.list[0]
    }

    @Test
    fun getTvShowDetail() {
        val tvShow = viewModel.getTvShowDetail()
        assertEquals(tvShow, dummyTvShow)
    }
}