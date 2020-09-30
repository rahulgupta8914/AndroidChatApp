package com.example.loginappmvvm.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.loginappmvvm.data.model.Conversation
import com.example.loginappmvvm.databinding.ConversationEachBinding

class ConversationsAdapter:
    ListAdapter<Conversation,  RecyclerView.ViewHolder>(ConversationDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ConversationViewHolder(ConversationEachBinding.inflate(
            LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val conversation = getItem(position)
        (holder as ConversationViewHolder).bind(conversation)
    }

    class ConversationViewHolder(private val binding :ConversationEachBinding
        ):RecyclerView.ViewHolder(binding.root){

        fun bind(item: Conversation) {
            binding.apply {
                conversation = item
                executePendingBindings()
            }
        }
    }
}

private class ConversationDiffCallback: DiffUtil.ItemCallback<Conversation>(){
    override fun areItemsTheSame(oldItem: Conversation, newItem: Conversation): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Conversation, newItem: Conversation): Boolean {
        return oldItem == newItem
    }
}