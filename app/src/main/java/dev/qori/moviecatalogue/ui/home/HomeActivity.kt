package dev.qori.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import dev.qori.moviecatalogue.R
import dev.qori.moviecatalogue.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.viewPager.adapter = HomePagerAdapter(this)
        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPager
        ){
            tab, position->
            tab.text = tabTitles[position]
        }.attach()

    }

    companion object{
        private val tabTitles: Array<String> = arrayOf("Movies", "Tv Show")
    }

}