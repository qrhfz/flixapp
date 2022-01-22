package dev.qori.moviecatalogue.ui.tvshow

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import dev.qori.moviecatalogue.databinding.ActivityTvShowDetailBinding
import dev.qori.moviecatalogue.entities.TvShow

class TvShowDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTvShowDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("ID",-1)
        val viewModel: TvShowDetailViewModel by viewModels()
        viewModel.id = id
        val show = viewModel.getTvShowDetail()

        show?.let {
            fillContent(show)
            title = show.title
        }


    }

    private fun fillContent(show: TvShow){
        with(binding){
            tvTvShowTitle.text = show.title
            tvTvShowAgeRating.text = show.ageRating.text
            tvTvShowDescription.text = show.description
            tvTvShowGenres.text = show.genres.joinToString(", ")
            tvTvShowAiringYear.text = String.format("%d - %d", show.firstSeasonYear, show.lastSeasonYear)
            tvTvShowScore.text = show.score.toString()
            Glide.with(this@TvShowDetailActivity).load(show.poster).into(ivTvShowPosterDetail)
        }
    }
}