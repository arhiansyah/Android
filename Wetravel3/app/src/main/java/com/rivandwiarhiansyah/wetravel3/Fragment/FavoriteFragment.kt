package com.rivandwiarhiansyah.wetravel3.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rivandwiarhiansyah.wetravel3.Adapter.ListFavoriteAdapter
import com.rivandwiarhiansyah.wetravel3.Data.ChatData.listData
import com.rivandwiarhiansyah.wetravel3.Data.FavData
import com.rivandwiarhiansyah.wetravel3.Data.MovieData.listData
import com.rivandwiarhiansyah.wetravel3.Model.Food
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

class FavoriteFragment : Fragment() {
    private var rvFav: RecyclerView? = null
    private val list: ArrayList<Food> = ArrayList<Food>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_favorite, container, false)
        rvFav?.setHasFixedSize(true)
        rvFav = view.findViewById(R.id.favFragment)
        list.addAll(FavData.listData)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList() {
        rvFav!!.layoutManager = LinearLayoutManager(this.context)
        val listFavoriteAdapter = ListFavoriteAdapter(list, requireContext())
        listFavoriteAdapter.setListFav(list)
        rvFav!!.adapter = listFavoriteAdapter
    }
}