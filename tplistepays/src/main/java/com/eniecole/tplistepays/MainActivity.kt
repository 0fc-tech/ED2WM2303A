package com.eniecole.tplistepays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvPays = findViewById<RecyclerView>(R.id.rvPays)
        //On lui donne l'ordre d'afficher les élément dans un LinearLayout
        //Cela a pour effet d'afficher les enfant de haut en bas, les uns en dessous des autres
        rvPays.layoutManager = LinearLayoutManager(this)
        rvPays.adapter = ListePaysAdapter(arrayListOf(
            Pays("France", "Paris", 67081000, "Eiffel Tower", "fr"),
            Pays("United States", "Washington, D.C.", 331002651, "Statue of Liberty", "us"),
            Pays("Canada", "Ottawa", 37742154, "CN Tower", "ca"),
            Pays("Brazil", "Brasília", 212559417, "Christ the Redeemer", "br"),
            Pays("Australia", "Canberra", 25499884, "Sydney Opera House", "au"),
            Pays("India", "New Delhi", 1380004385, "Taj Mahal", "in"),
            Pays("China", "Beijing", 1439323776, "Great Wall of China", "cn"),
            Pays("South Africa", "Pretoria", 59308690, "Table Mountain", "za"),
            Pays("Italy", "Rome", 60461826, "Colosseum", "it"),
            Pays("Germany", "Berlin", 83783942, "Brandenburg Gate", "de"),
            Pays("Russia", "Moscow", 145934462, "Red Square", "ru"),
            Pays("Japan", "Tokyo", 126476461, "Mount Fuji", "jp"),
            Pays("Mexico", "Mexico City", 128932753, "Chichen Itza", "mx"),
            Pays("United Kingdom", "London", 67886011, "Big Ben", "gb"),
            Pays("Spain", "Madrid", 46754778, "Sagrada Família", "es"),
            Pays("Egypt", "Cairo", 102334404, "Pyramids of Giza", "eg"),
            Pays("Argentina", "Buenos Aires", 45195777, "Obelisco", "ar"),
            Pays("Kenya", "Nairobi", 53771296, "Maasai Mara", "ke"),
            Pays("New Zealand", "Wellington", 4822233, "Sky Tower", "nz"),
            Pays("Greece", "Athens", 10423054, "Acropolis", "gr")
        ))

    }
}