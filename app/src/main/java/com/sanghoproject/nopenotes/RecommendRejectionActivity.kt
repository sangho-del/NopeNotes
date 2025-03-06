package com.sanghoproject.nopenotes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecommendRejectionActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    private lateinit var editTextSituation: EditText
    private lateinit var btnGetRecommendation: Button
    private lateinit var tvRecommendationTitle: TextView
    private lateinit var tvRecommendation: TextView
    private lateinit var tvTip: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend_rejection)

        initializeViews()
        setupTitles()
        setupRecommendationButton()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        editTextSituation = findViewById(R.id.editTextSituation)
        btnGetRecommendation = findViewById(R.id.btnGetRecommendation)
        tvRecommendationTitle = findViewById(R.id.tvRecommendationTitle)
        tvRecommendation = findViewById(R.id.tvRecommendation)
        tvTip = findViewById(R.id.tvTip)
        
        // 초기에는 추천 결과 숨기기
        tvRecommendationTitle.visibility = View.GONE
        tvRecommendation.visibility = View.GONE
        tvTip.visibility = View.GONE
    }

    private fun setupTitles() {
        tvTitle.text = "거절 멘트 추천"
        tvSubtitle.text = "상황을 입력하면 AI가 맞춤형 거절 멘트를 추천해 드립니다"
    }

    private fun setupRecommendationButton() {
        btnGetRecommendation.setOnClickListener {
            val situation = editTextSituation.text.toString().trim()
            
            if (situation.isEmpty()) {
                editTextSituation.error = "거절하고 싶은 상황을 입력해주세요"
                return@setOnClickListener
            }
            
            // 실제 앱에서는 AI 또는 알고리즘을 통해 추천 멘트를 생성하겠지만,
            // 여기서는 상황에 따른 미리 준비된 멘트를 제공합니다.
            provideRecommendation(situation)
        }
    }

    private fun provideRecommendation(situation: String) {
        // 상황에 따른 키워드 분석 (실제로는 더 복잡한 알고리즘 사용)
        val keywords = listOf("회식", "식사", "밥", "술", "약속", "만남", "미팅", "야근", "업무", "일", "돈", "대출", "빌려", "도와", "부탁")
        
        // 추천 멘트와 팁 초기화
        var recommendedPhrase = ""
        var tip = ""
        
        // 키워드 매칭 (간단한 구현)
        when {
            keywords.any { situation.contains(it) && (it == "회식" || it == "식사" || it == "밥" || it == "술") } -> {
                recommendedPhrase = "오늘은 개인적인 일정이 있어서 함께하지 못할 것 같아요. 다음에 꼭 함께하고 싶습니다."
                tip = "TIP: 구체적인 이유를 말하지 않고 개인적인 일정으로 표현하면 상대방이 더 이해하기 쉽습니다."
            }
            keywords.any { situation.contains(it) && (it == "약속" || it == "만남" || it == "미팅") } -> {
                recommendedPhrase = "죄송합니다만, 이미 계획된 일정이 있어 참석하기 어려울 것 같습니다. 다음 기회에 함께하면 좋겠습니다."
                tip = "TIP: 미리 약속이 있었다고 말하면 거절에 대한 부담이 줄어듭니다."
            }
            keywords.any { situation.contains(it) && (it == "야근" || it == "업무" || it == "일") } -> {
                recommendedPhrase = "현재 진행 중인 중요한 업무가 있어 지금은 추가 업무를 맡기 어렵습니다. 다음 주에 논의해 볼 수 있을까요?"
                tip = "TIP: 완전한 거절보다는 시간을 미루는 방식으로 표현하면 관계 유지에 도움이 됩니다."
            }
            keywords.any { situation.contains(it) && (it == "돈" || it == "대출" || it == "빌려") } -> {
                recommendedPhrase = "죄송하지만 현재 저도 재정적으로 여유가 없어 도움을 드리기 어려운 상황입니다."
                tip = "TIP: 금전적인 문제는 명확하게 거절하는 것이 향후 관계에 더 도움이 됩니다."
            }
            keywords.any { situation.contains(it) && (it == "도와" || it == "부탁") } -> {
                recommendedPhrase = "지금은 개인적인 일정으로 시간이 없어 도움을 드리기 어렵습니다. 혹시 다른 분께 부탁해 보시는 건 어떨까요?"
                tip = "TIP: 대안을 제시하면 거절하면서도 도움을 주려는 의지를 보여줄 수 있습니다."
            }
            else -> {
                recommendedPhrase = "죄송합니다만, 지금은 개인적인 사정으로 인해 요청하신 일을 도와드리기 어려운 상황입니다. 양해 부탁드립니다."
                tip = "TIP: 명확하게 거절하되 정중한 표현을 사용하면 상대방의 기분을 덜 상하게 할 수 있습니다."
            }
        }
        
        // 결과 표시
        tvRecommendationTitle.visibility = View.VISIBLE
        tvRecommendation.visibility = View.VISIBLE
        tvTip.visibility = View.VISIBLE
        
        tvRecommendation.text = recommendedPhrase
        tvTip.text = tip
    }
} 