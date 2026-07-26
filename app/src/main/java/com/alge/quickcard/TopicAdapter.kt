package com.alge.quickcard

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopicAdapter(
    private val topics: List<Pair<String, Int>>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<TopicAdapter.TopicViewHolder>() {

    class TopicViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val tvTopicName: TextView = itemView.findViewById(R.id.tvTopicName)
        val tvTopicCount: TextView = itemView.findViewById(R.id.tvTopicCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_topic, parent, false)
        return TopicViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        val (name, count) = topics[position]
        holder.tvTopicName.text = name
        holder.tvTopicCount.text = "$count kart"
        holder.itemView.setOnClickListener { onClick(name) }
    }

    override fun getItemCount(): Int = topics.size
}