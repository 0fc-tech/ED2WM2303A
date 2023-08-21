package com.eniecole.tpcadox.bo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
@Parcelize
data class Article(
    val id: Long,
    val intitule : String,
    val description : String,
    val prix: Double,
    val url: String,
    val ahcete : Boolean,
    val degreEnvie :Byte,
    val dateAchat: LocalDate
) : Parcelable
