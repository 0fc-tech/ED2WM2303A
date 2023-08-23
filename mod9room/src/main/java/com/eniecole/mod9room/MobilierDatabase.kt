package com.eniecole.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Mobilier::class], version = 1)
abstract class MobilierDatabase : RoomDatabase(){
    abstract fun mobilierDao() :MobilierDao

    //Ici on va trouver tous les champs "static" de notre classe
    companion object{
        private var INSTANCE : MobilierDatabase? = null
        fun getInstance(context: Context): MobilierDatabase {
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,MobilierDatabase::class.java,"mobilierDB"
                    ).fallbackToDestructiveMigration()
                    .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}