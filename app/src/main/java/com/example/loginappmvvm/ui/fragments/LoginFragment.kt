package com.example.loginappmvvm.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.loginappmvvm.R
import com.example.loginappmvvm.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.gotoSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment, null)
        }
        binding.loginButton.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_conversationsFragment,null)
        }
        return binding.root
    }

}