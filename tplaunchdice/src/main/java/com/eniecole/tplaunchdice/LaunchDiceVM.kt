package com.eniecole.tplaunchdice

import androidx.lifecycle.ViewModel

class LaunchDiceVM : ViewModel() {
    var valeurDe = 1
    fun launchDice(maxValue: Int): Int {
        valeurDe = (1..maxValue).random()
        return valeurDe
    }
}