package com.rivandwiarhiansyah.wetravel3.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rivandwiarhiansyah.wetravel3.Adapter.ListChatAdapter
import com.rivandwiarhiansyah.wetravel3.Data.ChatData
import com.rivandwiarhiansyah.wetravel3.Model.Chat
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

class ChatFragment : Fragment() {
    private var rvChat: RecyclerView? = null
    private val list = ArrayList<Chat>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        rvChat?.setHasFixedSize(true)
        rvChat = view.findViewById(R.id.chatFragment)
        list.addAll(ChatData.listData)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList() {
        rvChat!!.layoutManager = LinearLayoutManager(this.context)
        val listChatAdapter = ListChatAdapter(list)
        listChatAdapter.setListChat(list)
        rvChat!!.adapter = listChatAdapter
    }
}