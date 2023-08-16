package com.eniecole.tpcadox.bo

import java.time.LocalDate

data class Article(
    val id: Long,
    val intitule : String,
    val description : String,
    val prix: Double,
    val url: String,
    val ahcete : Boolean,
    val dateAchat: LocalDate
)
