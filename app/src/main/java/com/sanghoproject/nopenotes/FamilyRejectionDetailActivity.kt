package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FamilyRejectionDetailActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_rejection_detail)

        initializeViews()
        setupContent()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
    }

    private fun setupContent() {
        // 인텐트에서 데이터 가져오기
        intent.extras?.let {
            val title = it.getString("TITLE", "가족 관계 거절 멘트")
            val subtitle = it.getString("SUBTITLE", "가족 내 관계에 따른 적절한 거절 멘트")
            
            // 제목과 부제목 설정
            tvTitle.text = title
            tvSubtitle.text = subtitle
            
            // 카테고리에 따라 다른 내용을 표시할 수도 있음
            // val category = it.getString("CATEGORY", "")
            // 카테고리에 따라 다른 데이터 로드 및 표시
        }
    }
} 