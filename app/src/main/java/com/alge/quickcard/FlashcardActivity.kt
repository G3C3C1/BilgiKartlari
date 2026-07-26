package com.alge.quickcard

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class FlashcardActivity : AppCompatActivity() {

    private var cards: List<Flashcard> = emptyList()
    private var currentIndex = 0
    private var showingFront = true

    private lateinit var cardContainer: CardView
    private lateinit var tvCardText: TextView
    private lateinit var tvHint: TextView
    private lateinit var tvCounter: TextView
    private lateinit var tvTopicTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        val topic = intent.getStringExtra("TOPIC") ?: "RANDOM"

        cards = if (topic == "RANDOM") {
            CardRepository.allCards.shuffled()
        } else {
            CardRepository.allCards.filter { it.topic == topic }
        }

        cardContainer = findViewById(R.id.cardContainer)
        tvCardText = findViewById(R.id.tvCardText)
        tvHint = findViewById(R.id.tvHint)
        tvCounter = findViewById(R.id.tvCounter)
        tvTopicTitle = findViewById(R.id.tvTopicTitle)

        tvTopicTitle.text = if (topic == "RANDOM") "Kendini Dene — Rastgele" else topic

        cardContainer.cameraDistance = 12000f * resources.displayMetrics.density

        if (cards.isEmpty()) {
            tvCardText.text = "Bu konuda henüz kart yok."
        } else {
            updateCardView()
        }

        cardContainer.setOnClickListener {
            if (cards.isNotEmpty()) flipCard()
        }

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                showingFront = true
                updateCardView()
            } else {
                Toast.makeText(this, "İlk karttasın", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            if (currentIndex < cards.size - 1) {
                currentIndex++
                showingFront = true
                updateCardView()
            } else {
                Toast.makeText(this, "Son karttasın", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun updateCardView() {
        val card = cards[currentIndex]
        tvCardText.text = if (showingFront) card.question else card.answer
        tvHint.text = if (showingFront) "Cevabı görmek için karta dokun" else "Soruya dönmek için tekrar dokun"
        tvCounter.text = "${currentIndex + 1} / ${cards.size}"

        cardContainer.setCardBackgroundColor(
            if (showingFront) android.graphics.Color.parseColor("#1565C0")
            else android.graphics.Color.parseColor("#2E7D32")
        )
    }

    private fun flipCard() {
        val flipOut = ObjectAnimator.ofFloat(cardContainer, "scaleX", 1f, 0f)
        val flipIn = ObjectAnimator.ofFloat(cardContainer, "scaleX", 0f, 1f)
        flipOut.duration = 150
        flipIn.duration = 150

        flipOut.addListener(object : android.animation.AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: android.animation.Animator) {
                showingFront = !showingFront
                updateCardView()
                flipIn.start()
            }
        })

        val set = AnimatorSet()
        set.play(flipOut)
        set.start()
    }
}