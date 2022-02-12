package kz.arbuz.kinobuz.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.arbuz.kinobuz.R
import kz.arbuz.kinobuz.data.entity.ApiMovie
import org.koin.androidx.viewmodel.ext.android.viewModel

class TopMoviesFragment : Fragment(R.layout.fragment_top_movies) {

    private val moviesViewModel: MovieViewModel by viewModel()

    var moviesList = mutableListOf<ApiMovie>()

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        moviesViewModel.getMovies()
        val recyclerView = view.findViewById<RecyclerView>(R.id.movie_list)
        recyclerView.layoutManager = LinearLayoutManager(this.context)
        val adapter = MovieAdapter(this)
        recyclerView.adapter = adapter

        moviesViewModel.top250Movies.observe(this) {
            moviesList.clear()
            moviesList.addAll(it)
            adapter.notifyDataSetChanged()
        }
    }
}