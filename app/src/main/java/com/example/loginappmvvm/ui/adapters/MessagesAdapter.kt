package com.example.loginappmvvm.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.loginappmvvm.data.model.Message
import com.example.loginappmvvm.databinding.EachMessageBinding

class MessagesAdapter: ListAdapter<Message, RecyclerView.ViewHolder>(MessageDiffCallback()) {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MessageViewHolder(
            EachMessageBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = getItem(position)
        (holder as MessageViewHolder).bind(message)
    }


    class MessageViewHolder(private val binding : EachMessageBinding
    ):RecyclerView.ViewHolder(binding.root){

        fun bind(item: Message) {
            binding.apply {
                message = item
                executePendingBindings()
            }
        }
    }

}

private class MessageDiffCallback: DiffUtil.ItemCallback<Message>(){
    override fun areItemsTheSame(oldItem: Message, newItem: Message): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Message, newItem: Message): Boolean {
        return oldItem == newItem
    }
}