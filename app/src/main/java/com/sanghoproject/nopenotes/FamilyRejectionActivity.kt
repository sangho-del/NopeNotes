package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class FamilyRejectionActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    
    private lateinit var cardParent: CardView
    private lateinit var cardSibling: CardView
    private lateinit var cardRelative: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_rejection)

        initializeViews()
        setupTitles()
        setupClickListeners()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        
        // 카드뷰 초기화
        cardParent = findViewById(R.id.cardParent)
        cardSibling = findViewById(R.id.cardSibling)
        cardRelative = findViewById(R.id.cardRelative)
    }

    private fun setupTitles() {
        tvTitle.text = "가족 관계별 거절 멘트"
        tvSubtitle.text = "가족 내 관계에 따른 적절한 거절 멘트를 찾아보세요"
    }
    
    private fun setupClickListeners() {
        // 각 카드뷰에 클릭 리스너 설정
        cardParent.setOnClickListener {
            navigateToDetailScreen("부모님과 나의 관계", "부모님의 요청이나 제안을 거절하는 상황")
        }
        
        cardSibling.setOnClickListener {
            navigateToDetailScreen("형제 간의 관계", "형제자매와의 거절 상황")
        }
        
        cardRelative.setOnClickListener {
            navigateToDetailScreen("친척과의 관계", "친척들과의 거절 상황")
        }
    }
    
    private fun navigateToDetailScreen(title: String, subtitle: String) {
        val intent = Intent(this, FamilyRejectionDetailActivity::class.java).apply {
            putExtra("TITLE", title)
            putExtra("SUBTITLE", subtitle)
            putExtra("CATEGORY", title)
        }
        startActivity(intent)
    }
} 