package com.eniecole.mod4findviewbyiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.eniecole.mod4findviewbyiddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Le nom de notre binding est <NomDuFichierLayout>Binding
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Pour récupérer l'instance du Binding on rajoute devant le setContentView (Activité)
        // "binding = DataBindingUtil." et on donne l'instance de l'activité en premier param.
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //val textViewHW = findViewById<TextView>(R.id.textViewHW)
        //val button = findViewById<Button>(R.id.buttonSignIn)
        binding.buttonSignIn.setOnClickListener {
            binding.textViewHW.text = "Bravo, vous savez comment appuyer sur un bouton 🙂🥹😊💪"
        }
        binding.prenom = "Jean-Paul"
    }
}