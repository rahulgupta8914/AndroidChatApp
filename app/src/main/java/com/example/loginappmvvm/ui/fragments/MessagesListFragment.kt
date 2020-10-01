package com.example.loginappmvvm.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.loginappmvvm.data.model.Message
import com.example.loginappmvvm.databinding.FragmentMessagesListBinding
import com.example.loginappmvvm.ui.adapters.MessagesAdapter

class MessagesListFragment : Fragment() {

    private lateinit var binding: FragmentMessagesListBinding
    private val args: MessagesListFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMessagesListBinding.inflate(inflater, container, false)
        val adapter = MessagesAdapter()
        binding.messagesList.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }

    private fun subscribeUi(adapter: MessagesAdapter){
        val dummyMessage = listOf<Message>(
            Message("1",
                "The passage is attributed to an unknown typesetter in the 15th " +
                        "century who is thought to have scrambled parts of Cicero's De Finibus" +
                        " Bonorum et Malorum for use in a type specimen book.",
                "08:25",
                "auth1","cur1","Alap De"),
            Message("2",
                "The passage is attributed to an unknown typesetter in the 15th " +
                        "century who is thought to have scrambled parts of Cicero's De Finibus" +
                        " Bonorum et Malorum for use in a type specimen book.",
                "08:35",
                "auth1","cur1","Alap De"),
            Message("3",
                "Bonorum et Malorum for use in a type specimen book.",
                "08:36",
                "auth1","cur1","Alap De"),
            Message("3",
                "Bonorum et Malorum for use in a type specimen book.",
                "08:36",
                "cur1","cur1","You"),
            Message("4",
                "Please don't spam",
                "08:45",
                "cur1","cur1","You"),
            Message("5",
                "The passage is attributed to an unknown typesetter in the 15th " +
                        "century who is thought to have scrambled parts of Cicero's De Finibus" +
                        " Bonorum et Malorum for use in a type specimen book.",
                "08:35",
                "auth1","cur1","Alap De"),
            Message("6",
                "The passage is attributed to an unknown typesetter in the 15th " +
                        "century who is thought to have scrambled parts of Cicero's De Finibus" +
                        " Bonorum et Malorum for use in a type specimen book.",
                "08:35",
                "auth1","cur1","Alap De"),
        )
        adapter.submitList(dummyMessage);
    }

}