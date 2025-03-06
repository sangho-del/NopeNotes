package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class LoverRejectionActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    
    private lateinit var cardLover: CardView
    private lateinit var cardBlindDate: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lover_rejection)

        initializeViews()
        setupTitles()
        setupClickListeners()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        
        // 카드뷰 초기화
        cardLover = findViewById(R.id.cardLover)
        cardBlindDate = findViewById(R.id.cardBlindDate)
    }

    private fun setupTitles() {
        tvTitle.text = "연인 관계별 거절 멘트"
        tvSubtitle.text = "연인 관계에 따른 적절한 거절 멘트를 찾아보세요"
    }
    
    private fun setupClickListeners() {
        // 각 카드뷰에 클릭 리스너 설정
        cardLover.setOnClickListener {
            navigateToDetailScreen("연인 관계", "애인과의 거절 상황")
        }
        
        cardBlindDate.setOnClickListener {
            navigateToDetailScreen("소개팅상대", "소개팅상대와의 거절 상황")
        }
    }
    
    private fun navigateToDetailScreen(title: String, subtitle: String) {
        val intent = Intent(this, LoverRejectionDetailActivity::class.java).apply {
            putExtra("TITLE", title)
            putExtra("SUBTITLE", subtitle)
            putExtra("CATEGORY", title)
        }
        startActivity(intent)
    }
} 