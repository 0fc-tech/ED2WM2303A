package com.eniecole.tpcadox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eniecole.tpcadox.repository.ArticleRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(ArticleRepository.getAll()[5])
    }
}