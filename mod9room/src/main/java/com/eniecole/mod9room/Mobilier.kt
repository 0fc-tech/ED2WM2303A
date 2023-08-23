package com.eniecole.mod9room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Mobilier(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val marque: String,
    val type: String,
    @ColumnInfo(name = "nom_modele")
    val nomModele : String
)
