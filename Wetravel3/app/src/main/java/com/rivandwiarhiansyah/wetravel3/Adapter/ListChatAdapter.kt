package com.rivandwiarhiansyah.wetravel3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rivandwiarhiansyah.wetravel3.Model.Chat
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

class ListChatAdapter(list: ArrayList<Chat>) :
    RecyclerView.Adapter<ListChatAdapter.ListViewHolder>() {
    private val context: Context? = null
    private var listChat: ArrayList<Chat>
    fun getListChat(): ArrayList<Chat> {
        return listChat
    }

    fun setListChat(listChat: ArrayList<Chat>) {
        this.listChat = listChat
    }

    fun listChatAdapter(list: ArrayList<Chat>) {
        listChat = list
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_cardview_chat, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val chat: Chat = listChat[position]
        Glide.with(holder.itemView.context)
            .load(chat.getPhoto())
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.setText(chat.getName())
        holder.tvDesc.setText(chat.getDesc())
    }

    override fun getItemCount(): Int {
        return listChat.size
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view),
        View.OnClickListener {
        var imgPhoto: ImageView
        var tvName: TextView
        var tvDesc: TextView
        override fun onClick(v: View) {
            val position = adapterPosition
            val chat: Chat = getListChat()[position]
            chat.setName(chat.getName())
            chat.setDesc(chat.getDesc())
            chat.setPhoto(chat.getPhoto())
        }

        init {
            imgPhoto = view.findViewById(R.id.img_item_chat)
            tvName = view.findViewById(R.id.tv_item_chat_name)
            tvDesc = view.findViewById(R.id.tv_item_chat_desc)
            view.setOnClickListener(this)
        }
    }

    init {
        listChat = list
    }
}