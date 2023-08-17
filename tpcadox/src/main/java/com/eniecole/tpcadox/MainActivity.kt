package com.eniecole.tpcadox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.eniecole.tpcadox.databinding.ActivityMainBinding
import com.eniecole.tpcadox.repository.ArticleRepository

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Je récupère mon instance de Binding ET j'affiche ma vue à l'écran
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.article =ArticleRepository.getAll()[2]
        println(ArticleRepository.getAll()[5])
    }
}