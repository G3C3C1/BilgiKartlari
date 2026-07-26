package com.alge.quickcard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopicAdapter(
    private val topics: List<Pair<String, Int>>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<TopicAdapter.TopicViewHolder>() {

    private val iconBackgrounds = listOf(
        R.drawable.circle_purple,
        R.drawable.circle_pink,
        R.drawable.circle_green,
        R.drawable.circle_orange,
        R.drawable.circle_blue
    )

    private val icons = listOf("⚔️", "🕌", "🏰", "👑", "🌟", "📜")

    class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTopicName: TextView = itemView.findViewById(R.id.tvTopicName)
        val tvTopicCount: TextView = itemView.findViewById(R.id.tvTopicCount)
        val tvIcon: TextView = itemView.findViewById(R.id.tvIcon)
        val iconContainer: FrameLayout = itemView.findViewById(R.id.iconContainer)
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
        holder.tvIcon.text = icons[position % icons.size]
        holder.iconContainer.setBackgroundResource(iconBackgrounds[position % iconBackgrounds.size])
        holder.itemView.setOnClickListener { onClick(name) }
    }

    override fun getItemCount(): Int = topics.size
}