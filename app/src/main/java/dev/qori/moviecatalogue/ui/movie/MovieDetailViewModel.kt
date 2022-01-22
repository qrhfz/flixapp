package dev.qori.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.entities.Movie

class MovieDetailViewModel: ViewModel() {
    var id: Int? = null

    fun getMovieDetail(): Movie? = id?.let {id->
        MovieData.getWhereId(id)
    }
}