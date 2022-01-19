package dev.qori.moviecatalogue.ui.home.tvshow

import androidx.lifecycle.ViewModel
import dev.qori.moviecatalogue.data.TvShowData

class TvShowViewModel: ViewModel() {
    fun getShows() = TvShowData.list
}