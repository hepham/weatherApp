package com.example.weatherapp.Domains

import android.os.Parcel
import android.os.Parcelable

data class FutureDomain(
    val day:String,
    val picPath:String,
    val status:String,
    val highTemp:Int,
    val lowTemp:Int
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(day)
        parcel.writeString(picPath)
        parcel.writeString(status)
        parcel.writeInt(highTemp)
        parcel.writeInt(lowTemp)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FutureDomain> {
        override fun createFromParcel(parcel: Parcel): FutureDomain {
            return FutureDomain(parcel)
        }

        override fun newArray(size: Int): Array<FutureDomain?> {
            return arrayOfNulls(size)
        }
    }
}

