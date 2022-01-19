package dev.qori.moviecatalogue.ui.home.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ItemTvShowListBinding
import dev.qori.moviecatalogue.entities.TvShow

class TvShowListAdapter(private val tvShows: List<TvShow>): RecyclerView.Adapter<TvShowListAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ItemTvShowListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(movie: TvShow){
            binding.tvShowListTitle.text = movie.title
            binding.tvShowListScore.text = "${movie.score} + %"
            binding.tvShowListAiringYear.text = movie.firstSeasonYear.toString() + "-"+ movie.lastSeasonYear.toString()
            binding.tvShowListDescription.text = movie.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTvShowListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val show = tvShows[position]
        holder.bind(show)
    }

    override fun getItemCount(): Int = MovieData.getItemCount()
}