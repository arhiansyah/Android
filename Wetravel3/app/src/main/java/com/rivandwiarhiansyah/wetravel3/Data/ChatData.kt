package com.rivandwiarhiansyah.wetravel3.Data

import com.rivandwiarhiansyah.wetravel3.Model.Chat
import com.rivandwiarhiansyah.wetravel3.R
import java.util.*

object ChatData {
    //ini untuk bagian namanya
    private val chatNames = arrayOf(
        "Admin Wawajengrang",
        "Admin PAntikalupang",
        "Admin Curug jihan",
        "Admin Curug JEnggala",
        "Admin Banyumas Resort",
        "Admin Gunung Slamet",
        "Admin Baturaden",
        "Admin Gunung Dieng",
        "Admin Purwokerto resort",
        "Admin Banyumas City"
    )

    //ini untuk bagian deskripsi/pesan
    private val chatDesc = arrayOf(
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini",
        "Hello Guys, DAvid disini"
    )

    //Ganti gambar profile disini
    private val chatImages = intArrayOf(
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image,
        R.drawable.no_image
    )
    val listData: ArrayList<Chat>
        get() {
            val list: ArrayList<Chat> = ArrayList<Chat>()
            for (position in chatImages.indices) {
                val chat = Chat()
                chat.setName(chatNames[position])
                chat.setDesc(chatDesc[position])
                chat.setPhoto(chatImages[position])
                list.add(chat)
            }
            return list
        }
}