package com.eniecole.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.eniecole.mod8viewmodel.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    //private var compteur = 0
    //lateinit var textViewCompteur : TextView
    //lateinit var fabAdd : FloatingActionButton
    val vm by viewModels<CompteurViewModel>()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.vm = vm
        //permet à l'activité d'écouter les liveData dans le binding
        binding.lifecycleOwner = this
        //Récupérer nos deux vues (fab et TextView)
        //textViewCompteur = findViewById(R.id.textViewCompteur)
        //fabAdd = findViewById(R.id.fabAdd)
        //J'affiche mon compteur dès le départ
        //binding.textViewCompteur.text = "${vm.compteur}"
        //Lors de l'appui sur le fab, incrémenter le compteur
        binding.fabAdd.setOnClickListener {
            vm.inc()
            //Changer le texte du textView avec le nouveau compteur
            //binding.textViewCompteur.text = "${vm.compteur}"
        }
    }

}