package dev.qori.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.qori.moviecatalogue.ui.home.movie.MovieFragment
import dev.qori.moviecatalogue.ui.home.tvshow.TvShowFragment

class HomePagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MovieFragment()
            else -> TvShowFragment()
        }
    }
}