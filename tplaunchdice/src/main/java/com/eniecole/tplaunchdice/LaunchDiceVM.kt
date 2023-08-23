package com.eniecole.tplaunchdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LaunchDiceVM : ViewModel() {
    var valeurDe = MutableLiveData(1)
    fun launchDice(maxValue: Int){
        valeurDe.value = (1..maxValue).random()
    }
}