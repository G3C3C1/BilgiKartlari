package com.alge.quickcard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // BURAYI KENDİ BİLGİLERİNLE DEĞİŞTİR
    private val iletisimEmail = "alge@gmail.com"
    private val instagramKullaniciAdi = "gececi.yusuf"

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

        findViewById<LinearLayout>(R.id.btnContact).setOnClickListener {
            showContactDialog()
        }
    }

    private fun showContactDialog() {
        val secenekler = arrayOf("📧 E-posta Gönder", "📸 Instagram'da Takip Et")

        AlertDialog.Builder(this)
            .setTitle("Bize Ulaşın")
            .setMessage (
                "Öneri, istek veya hata bildirimlerin için bizimle iletişime geç!\n" +
                        "e-posta: algegmail.com\n" +
                        "instagram: $instagramKullaniciAdi ile ulaşabilirsiniz."
            )

            .setItems(secenekler) { _, which ->
                when (which) {
                    0 -> sendEmail()
                    1 -> openInstagram()
                }
            }
            .setNegativeButton("Kapat", null)
            .show()
    }

    private fun sendEmail() {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$iletisimEmail")
            putExtra(Intent.EXTRA_SUBJECT, "QuickCard - Öneri / Hata Bildirimi")
        }
        try {
            startActivity(intent)
        } catch (e: Exception) {
            android.widget.Toast.makeText(this, "E-posta uygulaması bulunamadı", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    private fun openInstagram() {
        val intent = try {
            Intent(Intent.ACTION_VIEW, Uri.parse("instagram://user?username=$instagramKullaniciAdi"))
        } catch (e: Exception) {
            Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/$instagramKullaniciAdi"))
        }
        try {
            startActivity(intent)
        } catch (e: Exception) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/$instagramKullaniciAdi")))
        }
    }
}