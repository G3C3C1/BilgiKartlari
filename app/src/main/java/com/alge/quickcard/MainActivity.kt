package com.alge.quickcard

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topics = CardRepository.allCards
            .map { it.topic }
            .distinct()
            .map { topic -> topic to CardRepository.allCards.count { it.topic == topic } }

        val rvTopics = findViewById<RecyclerView>(R.id.rvTopics)
        rvTopics.layoutManager = LinearLayoutManager(this)
        rvTopics.adapter = TopicAdapter(topics) { selectedTopic ->
            val intent = Intent(this, FlashcardActivity::class.java)
            intent.putExtra("TOPIC", selectedTopic)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.cardRandom).setOnClickListener {
            val intent = Intent(this, FlashcardActivity::class.java)
            intent.putExtra("TOPIC", "RANDOM")
            startActivity(intent)
        }
    }
}