package com.sanghoproject.nopenotes

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RejectionTipsActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView

    // 헤더 레이아웃
    private lateinit var headerTopicChange: LinearLayout
    private lateinit var headerCommonInterest: LinearLayout
    private lateinit var headerQuestion: LinearLayout
    private lateinit var headerHumor: LinearLayout
    private lateinit var headerAlternative: LinearLayout

    // 콘텐츠 레이아웃
    private lateinit var contentTopicChange: LinearLayout
    private lateinit var contentCommonInterest: LinearLayout
    private lateinit var contentQuestion: LinearLayout
    private lateinit var contentHumor: LinearLayout
    private lateinit var contentAlternative: LinearLayout

    // 화살표 이미지
    private lateinit var arrowTopicChange: ImageView
    private lateinit var arrowCommonInterest: ImageView
    private lateinit var arrowQuestion: ImageView
    private lateinit var arrowHumor: ImageView
    private lateinit var arrowAlternative: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rejection_tips)

        initializeViews()
        setupTitles()
        setupClickListeners()
    }

    private fun initializeViews() {
        // 제목과 부제목
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)

        // 헤더 레이아웃
        headerTopicChange = findViewById(R.id.headerTopicChange)
        headerCommonInterest = findViewById(R.id.headerCommonInterest)
        headerQuestion = findViewById(R.id.headerQuestion)
        headerHumor = findViewById(R.id.headerHumor)
        headerAlternative = findViewById(R.id.headerAlternative)

        // 콘텐츠 레이아웃
        contentTopicChange = findViewById(R.id.contentTopicChange)
        contentCommonInterest = findViewById(R.id.contentCommonInterest)
        contentQuestion = findViewById(R.id.contentQuestion)
        contentHumor = findViewById(R.id.contentHumor)
        contentAlternative = findViewById(R.id.contentAlternative)

        // 화살표 이미지
        arrowTopicChange = findViewById(R.id.arrowTopicChange)
        arrowCommonInterest = findViewById(R.id.arrowCommonInterest)
        arrowQuestion = findViewById(R.id.arrowQuestion)
        arrowHumor = findViewById(R.id.arrowHumor)
        arrowAlternative = findViewById(R.id.arrowAlternative)
    }

    private fun setupTitles() {
        tvTitle.text = "거절 팁 & 분위기 풀기"
        tvSubtitle.text = "거절 후에도 관계를 유지하는 방법"
    }

    private fun setupClickListeners() {
        // 화제 전환하기
        headerTopicChange.setOnClickListener {
            toggleContent(contentTopicChange, arrowTopicChange)
        }

        // 공통 관심사 언급하기
        headerCommonInterest.setOnClickListener {
            toggleContent(contentCommonInterest, arrowCommonInterest)
        }

        // 질문으로 대화 이어가기
        headerQuestion.setOnClickListener {
            toggleContent(contentQuestion, arrowQuestion)
        }

        // 유머 사용하기
        headerHumor.setOnClickListener {
            toggleContent(contentHumor, arrowHumor)
        }

        // 대안 제시하기
        headerAlternative.setOnClickListener {
            toggleContent(contentAlternative, arrowAlternative)
        }
    }

    private fun toggleContent(content: LinearLayout, arrow: ImageView) {
        // 내용이 보이면 숨기고, 숨겨져 있으면 보이게 함
        if (content.visibility == View.VISIBLE) {
            content.visibility = View.GONE
            arrow.setImageResource(android.R.drawable.arrow_down_float)
        } else {
            content.visibility = View.VISIBLE
            arrow.setImageResource(android.R.drawable.arrow_up_float)
        }
    }
} 