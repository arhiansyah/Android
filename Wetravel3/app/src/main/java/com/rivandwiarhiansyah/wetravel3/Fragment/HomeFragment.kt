package com.rivandwiarhiansyah.wetravel3.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rivandwiarhiansyah.wetravel3.Adapter.CardViewMovieAdapter
import com.rivandwiarhiansyah.wetravel3.Data.MovieData
import com.rivandwiarhiansyah.wetravel3.Model.Movie
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

class HomeFragment : Fragment() {
    private var rvMovie: RecyclerView? = null
    private val list: ArrayList<Movie> = ArrayList<Movie>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        rvMovie = view.findViewById(R.id.homefragment)
        list.addAll(MovieData.listData)
        showRecyclerMovie1()
        return view
    }

    private fun showRecyclerMovie1() {
        rvMovie?.layoutManager = GridLayoutManager(this.context, 2,)
        rvMovie?.setHasFixedSize(true)
        var cardViewMovieAdapter = CardViewMovieAdapter(list)

        cardViewMovieAdapter.listMovie
        rvMovie?.adapter = cardViewMovieAdapter
    }
}