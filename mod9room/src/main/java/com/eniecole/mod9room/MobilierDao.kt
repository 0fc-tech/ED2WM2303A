package com.eniecole.mod9room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MobilierDao {
    @Insert
    fun insert(mobilier: Mobilier): Long

    //Update met  à jour le mobilier en DB et retourne le nombre de ligne impactées par cet événement
    //Dans notre cas, soit 1 si ça fonctionne ou 0 si aucune ligne n'a été modifiée
    @Update
    fun update(mobilier: Mobilier): Int

    @Delete
    fun delete(mobilier: Mobilier): Int

    @Query("SELECT * From Mobilier")
    fun getAll(): List<Mobilier>
}