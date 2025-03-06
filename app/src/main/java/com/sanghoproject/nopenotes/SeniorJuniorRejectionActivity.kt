package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeniorJuniorRejectionActivity : AppCompatActivity() {

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
        tvTitle.text = "선배/후배 관계 거절 멘트"
        tvSubtitle.text = "선후배 관계에서 사용할 수 있는 적절한 거절 표현"
    }

    private fun prepareRejectionPhrases() {
        // 선배/후배 관계에서 사용할 수 있는 거절 멘트 추가
        rejectionPhrases.add("죄송한데 지금은 다른 일정이 있어서 어려울 것 같습니다.")
        rejectionPhrases.add("오늘은 개인적인 일이 있어서 다음에 함께하면 어떨까요?")
        rejectionPhrases.add("지금은 시간이 안 될 것 같아서 다음 기회에 참여하겠습니다.")
        rejectionPhrases.add("그건 제 전공과 맞지 않아서 도움을 드리기 어려울 것 같습니다.")
        rejectionPhrases.add("죄송하지만 그 날은 이미 다른 약속이 있습니다.")
        rejectionPhrases.add("지금은 개인적으로 바빠서 시간을 내기 어렵습니다.")
        rejectionPhrases.add("그건 제 관심 분야가 아니라서 함께하기 어려울 것 같습니다.")
        rejectionPhrases.add("오늘은 컨디션이 좋지 않아서 다음에 만나면 좋겠습니다.")
        rejectionPhrases.add("죄송하지만 그 일은 제가 잘 모르는 분야라 도움이 안 될 것 같습니다.")
        rejectionPhrases.add("지금은 다른 중요한 일이 있어서 참여하기 어렵습니다.")
        rejectionPhrases.add("그건 제 성향과 맞지 않아서 함께하기 어려울 것 같습니다.")
        rejectionPhrases.add("오늘은 가족 행사가 있어서 참석하기 어렵습니다.")
        rejectionPhrases.add("죄송하지만 지금은 개인 시간이 필요해서 다음에 도와드리겠습니다.")
        rejectionPhrases.add("그 시간에는 다른 수업/모임이 있어서 참석이 어렵습니다.")
        rejectionPhrases.add("지금은 다른 프로젝트에 집중하고 있어서 함께하기 어렵습니다.")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rejectionPhrases)
        listView.adapter = adapter
    }
} 