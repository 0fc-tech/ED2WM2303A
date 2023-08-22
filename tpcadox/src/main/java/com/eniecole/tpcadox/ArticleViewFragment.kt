package com.eniecole.tpcadox

import android.content.Intent
import android.net.Uri
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
        binding.article = ArticleRepository.getAll()[1]
        //Gérer l'appui sur ImageButtonWeb et ImageButtonSMS
        binding.buttonWeb.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(binding.article!!.url)
                )
            )
        }
        binding.imageButtonSms.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("smsto:"))
            intent.putExtra("sms_body", "Pour me faire un cadeau, tu peux m'offrir ça : ${binding.article?.intitule}\n" +
                        "    Cela ne coute que ${binding.article?.prix} euros et cela me fera vraiment plaisir :) Merci ! \n")
            startActivity(intent)
        }

        binding.buttonEdit.setOnClickListener {
            //Si l'article à l'intérieur de binding n'est pas null,
            //Exécuter le bloc de code suivant en prenant "articleNonNull" en paramètre
            binding.article?.let {  articleNonNull ->
                findNavController().navigate(
                    ArticleViewFragmentDirections.actionArticleViewFragmentToEditFragment(
                        articleNonNull
                    )
                )
            }
        }
    }
}