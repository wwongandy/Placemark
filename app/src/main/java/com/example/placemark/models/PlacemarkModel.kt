package com.example.placemark.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlacemarkModel(
    var id: Long = 0,
    var title: String = "",
    var description: String = "",
    var image: String = "",
    var location: Location = Location()
) : Parcelable

@Parcelize
data class Location(
    var lat: Double = 0.0,
    var lng: Double = 0.0,
    var zoom: Float = 0f
) : Parcelable