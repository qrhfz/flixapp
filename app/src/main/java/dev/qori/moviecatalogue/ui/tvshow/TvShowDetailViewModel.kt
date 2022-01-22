package dev.qori.moviecatalogue.ui.tvshow

import androidx.lifecycle.ViewModel
import dev.qori.moviecatalogue.data.TvShowData

class TvShowDetailViewModel: ViewModel() {
    var id: Int? = null

    fun getTvShowDetail() = id?.let{
        TvShowData.getWhereId(it)
    }
}