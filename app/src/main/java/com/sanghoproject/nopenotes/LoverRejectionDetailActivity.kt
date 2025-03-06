package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoverRejectionDetailActivity : AppCompatActivity() {
    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lover_rejection_detail)

        initializeViews()
        setupContent()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
    }

    private fun setupContent() {
        // 인텐트에서 전달된 데이터 가져오기
        val title = intent.getStringExtra("TITLE") ?: "연인 관계"
        val subtitle = intent.getStringExtra("SUBTITLE") ?: "연인과의 거절 상황"
        val category = intent.getStringExtra("CATEGORY") ?: ""

        // 제목과 부제목 설정
        tvTitle.text = title
        tvSubtitle.text = subtitle

        // 카테고리에 따라 다른 내용을 표시할 수 있음
        // when (category) {
        //     "LOVER" -> {
        //         // 연인 관련 거절 멘트 표시
        //     }
        //     "BLIND_DATE" -> {
        //         // 소개팅 상대 관련 거절 멘트 표시
        //     }
        // }
    }
} 