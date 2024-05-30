package com.example.weatherapp.Domains

import android.os.Parcel
import android.os.Parcelable

data class Hourly(
    val hour:String,
    val temp:Int,
    val picPath:String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(hour)
        parcel.writeInt(temp)
        parcel.writeString(picPath)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Hourly> {
        override fun createFromParcel(parcel: Parcel): Hourly {
            return Hourly(parcel)
        }

        override fun newArray(size: Int): Array<Hourly?> {
            return arrayOfNulls(size)
        }
    }

}
