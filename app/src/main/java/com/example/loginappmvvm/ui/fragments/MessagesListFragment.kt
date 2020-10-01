package com.example.loginappmvvm.ui.fragments

import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.loginappmvvm.R
import com.example.loginappmvvm.databinding.FragmentMessagesListBinding

class MessagesListFragment : Fragment() {

    private lateinit var binding: FragmentMessagesListBinding
    private val args: MessagesListFragmentArgs by navArgs()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.w("conversattionId", args.conversationId)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMessagesListBinding.inflate(inflater, container, false)
        return binding.root
    }

}