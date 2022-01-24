package dev.qori.moviecatalogue.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import dev.qori.moviecatalogue.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.vpHome.adapter = HomePagerAdapter(this)
        TabLayoutMediator(
            binding.tlHome,
            binding.vpHome
        ){
            tab, position->
            tab.text = tabTitles[position]
        }.attach()

    }

    companion object{
        private val tabTitles: Array<String> = arrayOf("Movies", "Tv Show")
    }

}