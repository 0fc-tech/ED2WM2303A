package com.eniecole.tpcadox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eniecole.tpcadox.databinding.FragmentArticleViewBinding
import com.eniecole.tpcadox.repository.ArticleRepository

class ArticleViewFragment : Fragment() {
    lateinit var binding : FragmentArticleViewBinding
    //Retourne la vue à afficher dans le fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Parser notre layout ET INTERPRETER afin de créer une Vue
        binding = FragmentArticleViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Une fois que la vue de mon fragment est créée et affichée, je peux
        //utiliser mon binding
        //
        //
        //TODO Ajouter l'article à l'UI
        binding.article = ArticleRepository.getAll()[2]
        binding.buttonEdit.setOnClickListener {
            findNavController().navigate(R.id.action_articleViewFragment_to_editFragment)
        }
    }
}