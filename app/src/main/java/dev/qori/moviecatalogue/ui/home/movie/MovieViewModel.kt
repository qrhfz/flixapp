package dev.qori.moviecatalogue.ui.home.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dev.qori.moviecatalogue.data.MovieData

class MovieViewModel:ViewModel() {
    fun getMovies() = MovieData.list
}