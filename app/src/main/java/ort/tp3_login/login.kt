package ort.tp3_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController


class login : Fragment() {
    lateinit var view1 : View
    lateinit var buttonLogin : Button
    lateinit var textRegister : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        view1 = inflater.inflate(R.layout.fragment_login, container, false)

        buttonLogin = view1.findViewById(R.id.buttonLogin)
        textRegister = view1.findViewById(R.id.textviewRegistrar)
        return view1
    }

    override fun onStart() {
        super.onStart()

        buttonLogin.setOnClickListener {
            val action2 = loginDirections.actionLoginToHomeAdmin()
            view1.findNavController().navigate(action2)
        }

        textRegister.setOnClickListener {
            val action2 = loginDirections.actionLoginToRegister()
            view1.findNavController().navigate(action2)
        }
    }



}