package com.rivandwiarhiansyah.wetravel3.Data

import com.rivandwiarhiansyah.wetravel3.Model.Food
import java.util.*
import kotlin.collections.ArrayList

object FavData {
        val listData: ArrayList<Food>
            get() {
                val food1 = Food(
                    "https://foodnesia.net/wp-content/uploads/2019/12/soto-sokaraja-purwokerto.jpg",
                    "Soto Sokaraja",
                    "Rp 10.000,-",
                    -7.45773075195357,
                    109.2932748447209,
                    "Raja Soto Lama H.suradi, Jalan Jendral Sudirman, Sokaraja, "
                )
                val food2 = Food(
                    "https://www.gotravelly.com/blog/wp-content/uploads/2018/05/gethuk-goreng.jpg",
                    "Getuk Goreng",
                    "Rp 15.000,-",
                    -7.455929882681647,
                    109.2883416677493,
                    "Getuk Goreng Asli"
                )
                val food3 = Food(
                    "https://jenginten.com/images/product/nopia-murni-20190903083122.jpg",
                    "Kue Mino",
                    "Rp 12.000,-",
                    -7.42538803079589,
                    109.22669657925759,
                    "Pusat oleh-oleh purwokerto"
                )
                val food4 = Food(
                    "https://3.bp.blogspot.com/-5dYOrlP3mZw/VfOm5Zev3yI/AAAAAAAAGRQ/5Szu6EfQMW8/s320/Resep%2BCombro%2BPaling%2BMantap%2Bdan%2BEnak.jpg",
                    "Combro",
                    "Rp 1000,-",
                    -7.457124460791429,
                    109.29867218257138,
                    "COMBRO & MISRO \" kanggo Riko \""
                )
                val food5 = Food(
                    "https://foodnesia.net/wp-content/uploads/2019/12/tempe-mendoan-mantap.jpg",
                    "Mendoan",
                    "Rp 1.000,-",
                    -7.424934740464568,
                    109.22685081781901,
                    "Toko Oleh oleh Eco21 purwoketo (Mendoan Dan Tempe Keripik)"
                )
                val food6 = Food(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNFXL-u0XbVE_9A0ltm5L7sOBYYOm5JqsdpA&usqp=CAU",
                    "Sahoun",
                    "Rp 6.000,-",
                    -7.4249518161871295,
                    109.2552068055359,
                    "Sahoun Ayam Pak Kartim 1, Jl. Kaliputih No.18, Purwokerto Wetan"
                )
                val food7 = Food(
                    "https://www.gotravelly.com/blog/wp-content/uploads/2018/06/taman-bunga.jpg",
                    "Small World",
                    "Rp 25.000,-",
                    -7.331289788822136,
                    109.22517101268757,
                    "Small World (Taman Miniatur Dunia), Jl. Raya Baturaden Barat No.270, Ketenger, Dusun I Karangmangu, Karangmangu, Kec. Baturaden, Purwokerto,"
                )
                val food8 = Food(
                    "https://blog.traveloka.com/source/uploads/2018/09/31888423_165807237433792_2937176551453622272_n.jpg",
                    "Kraca",
                    "Rp 12.000,-",
                    -7.408382180049622,
                    109.22914365557932,
                    "eong Kraca \"Bu Makmoer\", Purwanegara Desa, Jl. Bobosan, RT.06/RW.01, Karangjambu, Purwokerto"
                )
                val food9 = Food(
                    "https://resepmedia.com/wp-content/uploads/2018/01/Gambar-Sayur-Bening.jpg",
                    "Tegean",
                    "Rp 10.000,-",
                    -7.4224776921678,
                    109.22629317972365,
                    "RM Sroto (Kuliner Khas Purwokerto), Jalan Bank, Pesayangan, Kedungwuluh,Purwokerto"
                )
                val food10 = Food(
                    "https://phinemo.com/wp-content/uploads/2018/09/es-badeg1.png",
                    " Es Badeg",
                    "Rp 5.000,-",
                    -7.447449036667429,
                    109.28776860607974,
                    "ES BADEG, Jl. Kedondong-Ledug, Dusun II Kedondong, Kedondong, Kec. Sokaraja, Kabupaten Banyuma"
                )
                val list: ArrayList<Food> = ArrayList<Food>()
                list.add(food1)
                list.add(food2)
                list.add(food3)
                list.add(food4)
                list.add(food5)
                list.add(food6)
                list.add(food7)
                list.add(food8)
                list.add(food9)
                list.add(food10)
                return list
            }
    }