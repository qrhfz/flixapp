package dev.qori.moviecatalogue.ui.home.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ItemMovieListBinding
import dev.qori.moviecatalogue.entities.Movie
import dev.qori.moviecatalogue.util.truncate

class MovieListAdapter: RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {
    var movies: List<Movie> = listOf()

    inner class ViewHolder(private val binding: ItemMovieListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(movie: Movie){
            binding.movieListTitle.text = movie.title
            binding.movieListScore.text = "${movie.score}%"
            binding.movieListReleaseYear.text = movie.releaseYear.toString()
            binding.movieListDescription.text = movie.description.truncate()
            Glide.with(binding.root).load(movie.poster).into(binding.movieListPoster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMovieListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = MovieData.getItemCount()
}