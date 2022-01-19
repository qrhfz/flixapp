package dev.qori.moviecatalogue.ui.home.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ItemTvShowListBinding
import dev.qori.moviecatalogue.entities.TvShow
import dev.qori.moviecatalogue.util.truncate

class TvShowListAdapter: RecyclerView.Adapter<TvShowListAdapter.ViewHolder>() {
    var tvShows: List<TvShow> = listOf()
    class ViewHolder(private val binding: ItemTvShowListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(show: TvShow){
            binding.tvShowListTitle.text = show.title
            binding.tvShowListScore.text = "${show.score}%"
            binding.tvShowListAiringYear.text = show.firstSeasonYear.toString() + "-"+ show.lastSeasonYear.toString()
            binding.tvShowListDescription.text = show.description.truncate()
            Glide.with(binding.root).load(show.poster).into(binding.tvShowListPoster)
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