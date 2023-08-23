package com.eniecole.mod10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewMobilier)
        val furnitures = arrayListOf(
            Mobilier(1, "Herman Miller", "Chair", "Aeron"),
            Mobilier(2, "Steelcase", "Chair", "Leap"),
            Mobilier(3, "Ikea", "Desk", "Bekant"),
            Mobilier(4, "Vitra", "Chair", "Eames Lounge Chair"),
            Mobilier(5, "Knoll", "Table", "Saarinen Table"),
            Mobilier(6, "Herman Miller", "Desk", "Envelop"),
            Mobilier(7, "La-Z-Boy", "Sofa", "Bennett Duo Reclining"),
            Mobilier(8, "Steelcase", "Desk", "Series 1 Workstation"),
            Mobilier(9, "Ikea", "Shelf", "Kallax"),
            Mobilier(10, "Knoll", "Chair", "Barcelona Chair"),
            Mobilier(11, "Vitra", "Sofa", "Mariposa Sofa"),
            Mobilier(12, "Herman Miller", "Table", "Noguchi Table"),
            Mobilier(13, "Steelcase", "Cabinet", "Currency Storage Cabinet"),
            Mobilier(14, "Ikea", "Cabinet", "Eket"),
            Mobilier(15, "Knoll", "Desk", "Florence Knoll Desk"),
            Mobilier(16, "Vitra", "Shelf", "Compas Direction"),
            Mobilier(17, "Herman Miller", "Sofa", "Goetz Sofa"),
            Mobilier(18, "Steelcase", "Table", "Campfire Big Table"),
            Mobilier(19, "Ikea", "Chair", "Markus"),
            Mobilier(20, "Knoll", "Cabinet", "Credenza Storage"),
            Mobilier(21, "Vitra", "Desk", "EM Table"),
            Mobilier(22, "Herman Miller", "Shelf", "Eames Storage Units"),
            Mobilier(23, "Steelcase", "Sofa", "Campfire Lounge Sofa"),
            Mobilier(24, "Ikea", "Table", "Linnmon"),
            Mobilier(25, "Knoll", "Chair", "Womb Chair")
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MobilierAdapter(furnitures)
    }
}