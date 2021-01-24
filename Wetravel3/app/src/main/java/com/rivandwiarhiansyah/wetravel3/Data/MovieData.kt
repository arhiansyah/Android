package com.rivandwiarhiansyah.wetravel3.Data

import com.rivandwiarhiansyah.wetravel3.Model.Movie
import java.util.*

object MovieData {
    var data = arrayOf(
        arrayOf(
            "Hotel",
            "blabla",
            "2020",
            "https://previews.123rf.com/images/eatcute/eatcute1412/eatcute141215059/34969726-building-hotel-flat-icon-with-long-shadow-eps10.jpg"
        ), arrayOf(
            "Kuliner",
            "blabla",
            "2020",
            "https://png.pngtree.com/png-clipart/20200709/original/pngtree-modern-kitchen-logo-png-image_4122137.jpg"
        ), arrayOf(
            "Tempat Ibadah",
            "blabla",
            "2020",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxMAhsX2I0G6uBB8lYdLG__Nb3dvPsNz9s_A&usqp=CAU"
        ), arrayOf(
            "Destinasi Wisata",
            "blabla",
            "2020",
            "https://opensource.petra.ac.id/~m26411161/images/beach.ico"
        )
    )
    val listData: ArrayList<Movie>
        get() {
            val list: ArrayList<Movie> = ArrayList<Movie>()
            for (nData in data) {
                val movie = Movie()
                movie.setTitle(nData[0])
                movie.setDeskripsi(nData[1])
                movie.setTahun(nData[2])
                movie.setPhoto(nData[3])
                list.add(movie)
            }
            return list
        }
}
