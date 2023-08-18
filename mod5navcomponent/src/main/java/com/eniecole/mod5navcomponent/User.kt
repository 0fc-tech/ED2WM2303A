package com.eniecole.mod5navcomponent

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val email: String,
    val pseudo: String,
): Parcelable
