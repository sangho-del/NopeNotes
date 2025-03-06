package com.sanghoproject.nopenotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RejectionMessageAdapter(
    private val messages: List<RejectionMessage>
) : RecyclerView.Adapter<RejectionMessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvRejectionMessage: TextView = itemView.findViewById(R.id.tvRejectionMessage)
        val tvSituation: TextView = itemView.findViewById(R.id.tvSituation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rejection_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        holder.tvRejectionMessage.text = message.message
        holder.tvSituation.text = "상황: ${message.situation}"
    }

    override fun getItemCount(): Int = messages.size
} 