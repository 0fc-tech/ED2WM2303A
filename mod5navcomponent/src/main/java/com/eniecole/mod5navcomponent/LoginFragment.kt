package com.eniecole.mod5navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    // C'"est la même chose que "setContentView(R.layout.fragment_login)"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            //Option : Sans Génération des Directions (Safe Args) :
            //findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            //Option Avec générations des directions :
            findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToHomeFragment(
                    User("jeanpaul@gmail.com","Jean Paul")
                )
            )
        }

    }
}