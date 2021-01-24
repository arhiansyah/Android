package com.rivandwiarhiansyah.wetravel3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rivandwiarhiansyah.wetravel3.Model.Movie
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

class CardViewMovieAdapter(public val context: ArrayList<Movie>) : RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder>() {
    var listMovie: ArrayList<Movie>? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CardViewViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.item_cardview_movie,
            viewGroup,
            false
        )
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(cardViewViewHolder: CardViewViewHolder, position: Int) {
        val movie = listMovie!![position]
        let {
            Glide.with(cardViewViewHolder.itemView.context)
                .load(movie.getPhoto())
                .apply(RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto)
        }
        cardViewViewHolder.tvttitle.text = movie.getTitle()
    }

    inner class CardViewViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var imgPhoto: ImageView
        var tvttitle: TextView
        override fun onClick(v: View) {
            val position = adapterPosition
            val movie = listMovie?.get(position)
            movie?.setTitle(movie.getTitle())
            movie?.setDeskripsi(movie.getDeskripsi())
        }

        init {
            imgPhoto = itemView.findViewById(R.id.imagecover)
            tvttitle = itemView.findViewById(R.id.texttitle)
            itemView.setOnClickListener(this)
        }
    }
}