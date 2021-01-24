package com.rivandwiarhiansyah.wetravel3.Model

class Chat {
    private var name: String? = null
    private var desc: String? = null
    private var photo = 0

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getDesc(): String? {
        return desc
    }

    fun setDesc(desc: String?) {
        this.desc = desc
    }

    fun getPhoto(): Int {
        return photo
    }

    fun setPhoto(photo: Int) {
        this.photo = photo
    }

}