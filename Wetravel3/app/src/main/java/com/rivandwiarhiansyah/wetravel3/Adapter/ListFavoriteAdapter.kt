package com.rivandwiarhiansyah.wetravel3.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rivandwiarhiansyah.wetravel3.Activity.DetailFavoriteActivity
import com.rivandwiarhiansyah.wetravel3.Model.Food
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

class ListFavoriteAdapter(list: ArrayList<Food>, context: Context) :
    RecyclerView.Adapter<ListFavoriteAdapter.ListViewHolder>() {
    private var context: Context
    private var listFav: ArrayList<Food>
    fun getListFav(): ArrayList<Food> {
        return listFav
    }

    fun setListFav(listFav: ArrayList<Food>) {
        this.listFav = listFav
    }

    fun listFavoritAdapter(list: ArrayList<Food>, context: Context) {
        listFav = list
        this.context = context
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_cardview_fav, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food: Food = listFav[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.setText(food.name)
        holder.tvPrice.setText(food.price)
    }

    override fun getItemCount(): Int {
        return listFav.size
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view),
        View.OnClickListener {
        var imgPhoto: ImageView
        var tvName: TextView
        var tvPrice: TextView
        var tvAddress: TextView? = null
        override fun onClick(v: View) {
            val position = adapterPosition
            val food: Food = getListFav()[position]
            val intent = Intent(context, DetailFavoriteActivity::class.java)
            intent.putExtra(DetailFavoriteActivity.ITEM_EXTRA, food)
            context.startActivity(intent)
            //            food.setName(food.getName());
            //            food.setPrice(food.getPrice());
            //            food.setPhoto(food.getPhoto());
        }

        init {
            imgPhoto = view.findViewById(R.id.img_item_fav)
            tvName = view.findViewById(R.id.tv_item_fav_name)
            tvPrice = view.findViewById(R.id.tv_item_fav_price)
            view.setOnClickListener(this)
        }
    }

    init {
        listFav = list
        this.context = context
    }
}