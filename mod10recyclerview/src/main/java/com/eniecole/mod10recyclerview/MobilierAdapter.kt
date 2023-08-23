package com.eniecole.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.eniecole.mod10recyclerview.databinding.TemplateMobilierBinding

class MobilierAdapter(val listMobilier : ArrayList<Mobilier>) : RecyclerView.Adapter<MobilierAdapter.MobilierVH>(){
    class MobilierVH(val bindingMobilier: TemplateMobilierBinding) : ViewHolder(bindingMobilier.root)

    /***
     * Créer le ViewHolder => Conteneur qui va être réutilisé permettant d'afficher
     * un élément de liste.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilierVH {
        val binding = TemplateMobilierBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return MobilierVH(binding)
    }

    /**
     * Retourne le nombre d'éléments à afficher dans la liste.
     * C'est utile pour l'adapter afin de savoir s'il doit effectuer un "recyclage" de VH
     */
    override fun getItemCount(): Int = listMobilier.size

    override fun onBindViewHolder(holder: MobilierVH, position: Int) {
        holder.bindingMobilier.mobilier = listMobilier[position]
    }
}