package com.eniecole.mod8viewmodel

import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    var compteur = 0

    fun inc() = compteur++
}