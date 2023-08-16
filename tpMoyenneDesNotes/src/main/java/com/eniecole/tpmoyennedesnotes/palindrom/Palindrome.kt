package com.eniecole.tpmoyennedesnotes.palindrom

import java.text.Normalizer
import java.util.Locale

fun main() {
    println("Donne moi une chaîne de caractères")
    var input = readln().lowercase().replace(" ","")
    input = Normalizer.normalize(input, Normalizer.Form.NFD)
    //input = input.replace(Regex("[\\p{InCombiningDiacriticalMarks}]"), "")
    val inputInverse = input.reversed()
    println("Palindrome : ${inputInverse == input}")
}