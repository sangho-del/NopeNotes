package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class FriendRejectionActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    
    private lateinit var cardCloseFriend: CardView
    private lateinit var cardAcquaintance: CardView
    private lateinit var cardGroupFriend: CardView
    private lateinit var cardSnsFriend: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend_rejection)

        initializeViews()
        setupTitles()
        setupClickListeners()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        
        // 카드뷰 초기화
        cardCloseFriend = findViewById(R.id.cardCloseFriend)
        cardAcquaintance = findViewById(R.id.cardAcquaintance)
        cardGroupFriend = findViewById(R.id.cardGroupFriend)
        cardSnsFriend = findViewById(R.id.cardSnsFriend)
    }

    private fun setupTitles() {
        tvTitle.text = "친구 관계별 거절 멘트"
        tvSubtitle.text = "친구 관계에 따른 적절한 거절 멘트를 찾아보세요"
    }
    
    private fun setupClickListeners() {
        // 각 카드뷰에 클릭 리스너 설정
        cardCloseFriend.setOnClickListener {
            navigateToDetailScreen("친한 친구", "오랜 친구와의 거절 상황")
        }
        
        cardAcquaintance.setOnClickListener {
            navigateToDetailScreen("지인", "가까운 지인과의 거절 상황")
        }
        
        cardGroupFriend.setOnClickListener {
            navigateToDetailScreen("모임 친구", "동호회나 모임에서 만난 친구와의 거절")
        }
        
        cardSnsFriend.setOnClickListener {
            navigateToDetailScreen("SNS 친구", "SNS에서 알게 된 친구와의 거절")
        }
    }
    
    private fun navigateToDetailScreen(title: String, subtitle: String) {
        val intent = Intent(this, FriendRejectionDetailActivity::class.java).apply {
            putExtra("TITLE", title)
            putExtra("SUBTITLE", subtitle)
            putExtra("CATEGORY", title)
        }
        startActivity(intent)
    }
} 