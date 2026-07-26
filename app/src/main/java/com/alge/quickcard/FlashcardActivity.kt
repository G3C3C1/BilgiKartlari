package com.alge.quickcard

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FlashcardActivity : AppCompatActivity() {

    private var originalCards: List<Flashcard> = emptyList()
    private var cards: List<Flashcard> = emptyList()
    private var currentIndex = 0
    private var showingFront = true
    private var isShuffled = false

    private lateinit var cardContainer: FrameLayout
    private lateinit var tvCardText: TextView
    private lateinit var tvHint: TextView
    private lateinit var tvCounter: TextView
    private lateinit var tvTopicTitle: TextView
    private lateinit var btnShuffle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        val topic = intent.getStringExtra("TOPIC") ?: "RANDOM"

        originalCards = if (topic == "RANDOM") {
            CardRepository.allCards
        } else {
            CardRepository.allCards.filter { it.topic == topic }
        }

        isShuffled = (topic == "RANDOM")
        cards = if (isShuffled) originalCards.shuffled() else originalCards

        cardContainer = findViewById(R.id.cardContainer)
        tvCardText = findViewById(R.id.tvCardText)
        tvHint = findViewById(R.id.tvHint)
        tvCounter = findViewById(R.id.tvCounter)
        tvTopicTitle = findViewById(R.id.tvTopicTitle)
        btnShuffle = findViewById(R.id.btnShuffle)

        tvTopicTitle.text = if (topic == "RANDOM") "Kendini Dene — Rastgele" else topic

        cardContainer.cameraDistance = 12000f * resources.displayMetrics.density

        updateShuffleButtonText()

        if (cards.isEmpty()) {
            tvCardText.text = "Bu konuda henüz kart yok."
        } else {
            updateCardView()
        }

        cardContainer.setOnClickListener {
            if (cards.isNotEmpty()) flipCard()
        }

        btnShuffle.setOnClickListener {
            toggleShuffle()
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

    private fun toggleShuffle() {
        isShuffled = !isShuffled
        cards = if (isShuffled) originalCards.shuffled() else originalCards
        currentIndex = 0
        showingFront = true
        updateShuffleButtonText()
        updateCardView()
        val mesaj = if (isShuffled) "Kartlar karıştırıldı" else "Sıralı moda geçildi"
        Toast.makeText(this, mesaj, Toast.LENGTH_SHORT).show()
    }

    private fun updateShuffleButtonText() {
        btnShuffle.text = if (isShuffled) "🔢 Sıralı Göster" else "🔀 Rastgele Karıştır"
    }

    private fun updateCardView() {
        val card = cards[currentIndex]
        tvCardText.text = if (showingFront) card.question else card.answer
        tvHint.text = if (showingFront) "Cevabı görmek için karta dokun" else "Soruya dönmek için tekrar dokun"
        tvCounter.text = "${currentIndex + 1} / ${cards.size}"

        cardContainer.setBackgroundResource(
            if (showingFront) R.drawable.bg_card_front else R.drawable.bg_card_back
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