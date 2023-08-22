package com.eniecole.mod8viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    //Version sans LiveData (sans observer Observable)
    //var compteur = 0

    //fun inc() = compteur++

    //Version avec LiveData (Observer Observable)
    val compteur  = MutableLiveData(0)

    fun inc(){
        //La nouvelle valeur du compteur = la valeur du compteur incrémentée
        compteur.value = compteur.value?.plus(1)
    }
}