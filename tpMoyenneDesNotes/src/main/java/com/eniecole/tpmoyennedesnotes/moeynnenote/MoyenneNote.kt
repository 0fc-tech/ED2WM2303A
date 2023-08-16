package com.eniecole.tpmoyennedesnotes.moeynnenote
//Moyenne note avec nbr Valeurs
fun main() {
    val notesRentrees = arrayListOf<Double>()
    println("Rentrer le nombre de notes")
    val nbrNotes : Int? = readln().toIntOrNull()
    if(nbrNotes == null){
        println("Merci de rentrer un entier")
        main()
    }else{
        while(notesRentrees.size < nbrNotes){
            println("Rentrer une note")
            notesRentrees += readln().toDouble()
        }
        println("Le résultat est ${notesRentrees.average()}")
    }
}