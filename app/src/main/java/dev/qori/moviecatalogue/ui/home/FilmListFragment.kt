package dev.qori.moviecatalogue.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dev.qori.moviecatalogue.databinding.FragmentFilmListBinding

class FilmListFragment : Fragment() {
    private lateinit var binding: FragmentFilmListBinding
    private lateinit var type: ListType
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        arguments?.getSerializable("T")?.let { type = it as ListType }
        binding = FragmentFilmListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[FilmListViewModel::class.java]
        val filmList = when(type){
            ListType.Movie -> viewModel.getMovies()
            ListType.TVShow -> viewModel.getShows()
        }
        val adapter = FilmListAdapter(filmList)


        with(binding.rvMovie){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            this.adapter = adapter
        }
    }

    enum class ListType{
        Movie,
        TVShow
    }

    companion object{
        fun newInstance(type: ListType): FilmListFragment{
            val args = Bundle()
            args.putSerializable("T", type)
            val fragment = FilmListFragment()
            fragment.arguments = args
            return fragment
        }
    }

}