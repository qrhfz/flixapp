package dev.qori.moviecatalogue.ui.home

import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ItemMovieListBinding
import dev.qori.moviecatalogue.entities.Film
import dev.qori.moviecatalogue.entities.Movie
import dev.qori.moviecatalogue.entities.TvShow
import dev.qori.moviecatalogue.ui.movie.MovieDetailActivity
import dev.qori.moviecatalogue.ui.tvshow.TvShowDetailActivity
import dev.qori.moviecatalogue.util.truncate

class FilmListAdapter(var filmList: List<Film>) : RecyclerView.Adapter<FilmListAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemMovieListBinding, private val res: Resources) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(film: Film) {
            with(binding) {
                when (film) {
                    is Movie -> {
                        movieListTitle.text = film.title
                        movieListScore.text =
                            String.format(res.getString(R.string.score), film.score)
                        movieListReleaseYear.text = film.releaseYear.toString()
                        movieListDescription.text = film.description.truncate()
                        Glide.with(itemView).load(film.poster).into(binding.movieListPoster)

                        itemView.setOnClickListener {
                            val intent = Intent(it.context, MovieDetailActivity::class.java).apply {
                                this.putExtra("ID", film.id)
                            }
                            it.context.startActivity(intent)
                        }
                    }

                    is TvShow -> {
                        movieListTitle.text = film.title
                        movieListScore.text =
                            String.format(res.getString(R.string.score), film.score)
                        movieListReleaseYear.text = String.format(res.getString(R.string.tvshow_airing), film.firstSeasonYear, film.lastSeasonYear)
                        movieListDescription.text = film.description.truncate()
                        Glide.with(itemView).load(film.poster).into(binding.movieListPoster)

                        itemView.setOnClickListener {
                            val intent = Intent(it.context, TvShowDetailActivity::class.java).apply {
                                this.putExtra("ID", film.id)
                            }
                            it.context.startActivity(intent)
                        }
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemMovieListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding, parent.resources)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val film = filmList[position]
        holder.bind(film)
    }

    override fun getItemCount(): Int = MovieData.getItemCount()
}