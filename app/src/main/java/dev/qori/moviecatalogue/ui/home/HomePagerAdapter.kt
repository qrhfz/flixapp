package dev.qori.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomePagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FilmListFragment.newInstance(FilmListFragment.ListType.Movie)
            else -> FilmListFragment.newInstance(FilmListFragment.ListType.TVShow)
        }
    }
}