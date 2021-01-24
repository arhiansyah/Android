package com.rivandwiarhiansyah.wetravel3.Model

class Movie {
    private var title: String? = null
    private var deskripsi: String? = null
    private var tahun: String? = null
    private var photo: String? = null

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getDeskripsi(): String? {
        return deskripsi
    }

    fun setDeskripsi(deskripsi: String?) {
        this.deskripsi = deskripsi
    }

    fun getTahun(): String? {
        return tahun
    }

    fun setTahun(tahun: String?) {
        this.tahun = tahun
    }

    fun getPhoto(): String? {
        return photo
    }

    fun setPhoto(photo: String?) {
        this.photo = photo
    }
}