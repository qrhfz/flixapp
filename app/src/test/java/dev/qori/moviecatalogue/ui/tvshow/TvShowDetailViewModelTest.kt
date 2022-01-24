package dev.qori.moviecatalogue.ui.tvshow

import dev.qori.moviecatalogue.data.TvShowData
import dev.qori.moviecatalogue.entities.TvShow
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
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
        assertNotNull(tvShow)
        assertEquals(tvShow?.title, dummyTvShow.title)
        assertEquals(tvShow?.poster, dummyTvShow.poster)
        assertEquals(tvShow?.description, dummyTvShow.description)
        assertEquals(tvShow?.firstSeasonYear, dummyTvShow.firstSeasonYear)
        assertEquals(tvShow?.lastSeasonYear, dummyTvShow.lastSeasonYear)
        assertEquals(tvShow?.ageRating, dummyTvShow.ageRating)
        assertEquals(tvShow?.poster, dummyTvShow.poster)
        assertEquals(tvShow?.id, dummyTvShow.id)
        assertEquals(tvShow?.genres, dummyTvShow.genres)
    }
}