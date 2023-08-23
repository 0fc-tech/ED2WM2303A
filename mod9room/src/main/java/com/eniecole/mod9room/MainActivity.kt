package com.eniecole.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread {
            MobilierDatabase.getInstance(this).mobilierDao().insert(Mobilier(
                0L,
                "Steelcase",
                "Chaise de bureau",
                "Think V2"
            ))
            println(MobilierDatabase.getInstance(this).mobilierDao().getAll()[0].marque)
        }

    }
}