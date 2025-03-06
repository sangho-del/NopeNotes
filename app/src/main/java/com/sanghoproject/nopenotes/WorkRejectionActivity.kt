package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WorkRejectionActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    private val rejectionPhrases = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rejection_phrases)

        initializeViews()
        setupTitles()
        prepareRejectionPhrases()
        setupListView()
    }

    private fun initializeViews() {
        listView = findViewById(R.id.listViewPhrases)
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
    }

    private fun setupTitles() {
        tvTitle.text = "직장 관계 거절 멘트"
        tvSubtitle.text = "직장에서 사용할 수 있는 적절한 거절 표현"
    }

    private fun prepareRejectionPhrases() {
        // 직장 관계에서 사용할 수 있는 거절 멘트 추가
        rejectionPhrases.add("현재 진행 중인 업무가 있어 지금은 어렵습니다.")
        rejectionPhrases.add("일정을 확인해보니 해당 시간에는 다른 미팅이 있습니다.")
        rejectionPhrases.add("제 업무 범위를 벗어나는 일이라 도움을 드리기 어렵습니다.")
        rejectionPhrases.add("지금 맡은 프로젝트에 집중해야 해서 추가 업무는 어렵습니다.")
        rejectionPhrases.add("부서 내 규정상 해당 요청은 수락하기 어렵습니다.")
        rejectionPhrases.add("상급자와 상의 후 결정해야 할 사항입니다.")
        rejectionPhrases.add("회사 정책상 그런 요청은 수락할 수 없습니다.")
        rejectionPhrases.add("현재 업무량으로는 추가 업무를 맡기 어렵습니다.")
        rejectionPhrases.add("해당 업무는 다른 부서에 문의하시는 것이 적절합니다.")
        rejectionPhrases.add("지금은 다른 중요한 마감이 있어 참석하기 어렵습니다.")
        rejectionPhrases.add("해당 요청은 공식적인 채널을 통해 진행해 주셔야 합니다.")
        rejectionPhrases.add("회의 일정이 겹쳐 참석이 어렵습니다.")
        rejectionPhrases.add("현재 우선순위가 높은 업무가 있어 지금은 어렵습니다.")
        rejectionPhrases.add("해당 업무는 제 전문 분야가 아니라 도움을 드리기 어렵습니다.")
        rejectionPhrases.add("팀 리더와 상의 후 답변 드리겠습니다.")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rejectionPhrases)
        listView.adapter = adapter
    }
} 