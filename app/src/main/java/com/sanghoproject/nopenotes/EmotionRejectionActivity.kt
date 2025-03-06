package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class EmotionRejectionActivity : AppCompatActivity() {

    private lateinit var cardSoft: CardView
    private lateinit var cardFirm: CardView
    private lateinit var cardHumor: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_rejection)

        initializeViews()
        setupClickListeners()
    }

    private fun initializeViews() {
        cardSoft = findViewById(R.id.cardSoft)
        cardFirm = findViewById(R.id.cardFirm)
        cardHumor = findViewById(R.id.cardHumor)
    }

    private fun setupClickListeners() {
        // 부드럽게 거절 카드 클릭 리스너
        cardSoft.setOnClickListener {
            navigateToRejectionList("부드럽게 거절", "SOFT")
        }

        // 단호하게 거절 카드 클릭 리스너
        cardFirm.setOnClickListener {
            navigateToRejectionList("단호하게 거절", "FIRM")
        }

        // 유머 있게 거절 카드 클릭 리스너
        cardHumor.setOnClickListener {
            navigateToRejectionList("유머 있게 거절", "HUMOR")
        }
    }

    private fun navigateToRejectionList(title: String, emotionType: String) {
        Toast.makeText(this, "$title 멘트 목록으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, EmotionRejectionListActivity::class.java).apply {
            putExtra("TITLE", title)
            putExtra("EMOTION_TYPE", emotionType)
        }
        startActivity(intent)
    }
} 