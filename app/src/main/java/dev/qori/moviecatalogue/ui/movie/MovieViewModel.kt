package dev.qori.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import dev.qori.moviecatalogue.data.MovieData

class MovieViewModel:ViewModel() {
    fun getMovies() = MovieData.list
}