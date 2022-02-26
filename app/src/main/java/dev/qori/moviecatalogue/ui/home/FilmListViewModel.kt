package dev.qori.moviecatalogue.ui.home

import androidx.lifecycle.ViewModel
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.data.TvShowData

class FilmListViewModel: ViewModel() {
    fun getMovies() = MovieData.list
    fun getShows() = TvShowData.list
}