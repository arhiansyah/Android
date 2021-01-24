package com.rivandwiarhiansyah.wetravel3.Model

import android.os.Parcel
import android.os.Parcelable

class Food : Parcelable {
    var name: String?
    var price: String?
    var photo: String?
    var address: String?
    var latitude: Double
        private set
    var longitude: Double
        private set

    protected constructor(`in`: Parcel) {
        name = `in`.readString()
        price = `in`.readString()
        photo = `in`.readString()
        address = `in`.readString()
        latitude = `in`.readDouble()
        longitude = `in`.readDouble()
    }

    constructor(
        photo: String?,
        name: String?,
        price: String?,
        latitude: Double,
        longitude: Double,
        address: String?
    ) {
        this.photo = photo
        this.name = name
        this.price = price
        this.latitude = latitude
        this.longitude = longitude
        this.address = address
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeString(price)
        dest.writeString(photo)
        dest.writeString(address)
        dest.writeDouble(latitude)
        dest.writeDouble(longitude)
    }

    companion object {
        val CREATOR: Parcelable.Creator<Food?> = object : Parcelable.Creator<Food?> {
            override fun createFromParcel(`in`: Parcel): Food? {
                return Food(`in`)
            }

            override fun newArray(size: Int): Array<Food?> {
                return arrayOfNulls(size)
            }
        }
    }
}