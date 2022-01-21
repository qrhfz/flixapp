package dev.qori.moviecatalogue.ui.tvshow

import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ItemTvShowListBinding
import dev.qori.moviecatalogue.entities.TvShow
import dev.qori.moviecatalogue.util.truncate

class TvShowListAdapter: RecyclerView.Adapter<TvShowListAdapter.ViewHolder>() {
    var tvShows: List<TvShow> = listOf()
    class ViewHolder(private val binding: ItemTvShowListBinding, private val res: Resources)
        : RecyclerView.ViewHolder(binding.root){
        fun bind(show: TvShow){
            with(binding){
                tvShowListTitle.text = show.title
                tvShowListScore.text = String.format(res.getString(R.string.score), show.score)
                tvShowListAiringYear.text =
                    String.format(res.getString(R.string.tvshow_airing), show.firstSeasonYear, show.lastSeasonYear)
                tvShowListDescription.text = show.description.truncate()
                Glide.with(itemView).load(show.poster).into(binding.tvShowListPoster)

                itemView.setOnClickListener {
                    val intent = Intent(it.context, TvShowDetailActivity::class.java)
                    intent.putExtra("ID", show.id)
                    it.context.startActivity(intent)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTvShowListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding, parent.resources)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val show = tvShows[position]
        holder.bind(show)
    }

    override fun getItemCount(): Int = MovieData.getItemCount()
}