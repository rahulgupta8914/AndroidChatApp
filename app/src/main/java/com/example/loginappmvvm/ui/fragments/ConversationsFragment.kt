package com.example.loginappmvvm.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginappmvvm.data.model.Conversation
import com.example.loginappmvvm.databinding.FragmentConversationsBinding
import com.example.loginappmvvm.ui.adapters.ConversationsAdapter

class ConversationsFragment : Fragment() {

    private lateinit var binding: FragmentConversationsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentConversationsBinding.inflate(inflater, container, false)

        val adapter = ConversationsAdapter()
        binding.recyclerView.adapter = adapter
        subscribeUi(adapter)

        return binding.root
    }


    private fun subscribeUi(adapter: ConversationsAdapter) {
//        viewModel.plants.observe(viewLifecycleOwner) { plants ->
//            adapter.submitList(plants)
//        }

//        dummy conversation
        val con = listOf<Conversation>(
            Conversation("id1", "Alap de",null, "hello","08/07/2019"),
            Conversation("id2", "Anupam Manna", null,"I will be hacker","01/07/2019"),
            Conversation("id3", "Rahat Alam", null,"I am working on my new film, tomorrow ","03/05/2019"),
            Conversation("id4", "Avijit de", null,"I am looking for job, Please refer me if you know one","08/07/2019"),
//            Conversation("id5", "Twinkle", null,"I enjoy asutosh college","08/08/2019"),
//            Conversation("id6", "Alap de", null,"hello","08/07/2019"),
//            Conversation("id7", "Anupam Manna", null,"I will be hacker","01/07/2019"),
//            Conversation("id8", "Rahat Alam", null,"I am working on my new film, tomorrow ","03/05/2019"),
//            Conversation("id9", "Avijit de", null,"I am looking for job, Please refer me if you know one","08/07/2019"),
//            Conversation("id10", "Twinkle", null,"I enjoy asutosh college","08/08/2019")
        )

        adapter.submitList(con)

    }
}