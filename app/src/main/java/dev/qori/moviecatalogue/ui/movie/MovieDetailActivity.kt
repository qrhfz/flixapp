package dev.qori.moviecatalogue.ui.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.data.MovieData
import dev.qori.moviecatalogue.databinding.ActivityMovieDetailBinding
import dev.qori.moviecatalogue.entities.Movie

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val id = intent.getIntExtra("ID",-1)
        val movie = MovieData.getWhereId(id)
        movie?.let {
            fillContent(it)
            title = it.title
        }
    }

    private fun fillContent(movie: Movie){
        with(binding){
            tvMovieTitle.text = movie.title
            tvMovieAgeRating.text = movie.ageRating.text
            tvMovieDescription.text = movie.description
            tvGenres.text = movie.genres.joinToString(", ")
            tvMovieReleaseYear.text = movie.releaseYear.toString()
            tvMovieScore.text = movie.score.toString()
            Glide.with(this@MovieDetailActivity).load(movie.poster).into(ivPosterDetail)
        }
    }
}