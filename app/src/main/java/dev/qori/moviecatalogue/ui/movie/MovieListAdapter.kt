package dev.qori.moviecatalogue.ui.movie

import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ItemMovieListBinding
import dev.qori.moviecatalogue.entities.Movie
import dev.qori.moviecatalogue.util.truncate

class MovieListAdapter: RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {
    var movies: List<Movie> = listOf()

    inner class ViewHolder(private val binding: ItemMovieListBinding, private val res: Resources)
        : RecyclerView.ViewHolder(binding.root){
        fun bind(movie: Movie){
            with(binding){
                movieListTitle.text = movie.title
                movieListScore.text = String.format(res.getString(R.string.score), movie.score)
                movieListReleaseYear.text = movie.releaseYear.toString()
                movieListDescription.text = movie.description.truncate()
                Glide.with(itemView).load(movie.poster).into(binding.movieListPoster)

                itemView.setOnClickListener{
                    val intent= Intent(it.context, MovieDetailActivity::class.java).apply {
                        this.putExtra("ID", movie.id)
                    }
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMovieListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding, parent.resources)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = MovieData.getItemCount()
}