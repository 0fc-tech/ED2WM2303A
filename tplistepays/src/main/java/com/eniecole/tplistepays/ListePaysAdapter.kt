package com.eniecole.tplistepays

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.eniecole.tplistepays.databinding.TemplatePaysBinding

class ListePaysAdapter(val arrayListPays: ArrayList<Pays>) : RecyclerView.Adapter<ListePaysAdapter.PaysVH>(){
    class PaysVH(val binding : TemplatePaysBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaysVH {
        val binding = TemplatePaysBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        )
        return PaysVH(binding)
    }

    override fun getItemCount(): Int = arrayListPays.size

    override fun onBindViewHolder(holder: PaysVH, position: Int) {
        val context = holder.itemView.context
        holder.binding.pays = arrayListPays[position]
        //Je récupère dynamiquement le référence à ma ressource drawable
        // R.drawable.<codePays>
        val idDrawable = context.resources.getIdentifier(arrayListPays[position].alphaTwoCode,"drawable",context.packageName)
        //Je récupère la ressource à l'identifiant généré et l'affecte à mon ImageView
        holder.binding.imageViewDrapeau.setImageDrawable(AppCompatResources.getDrawable(context,idDrawable))
    }

}