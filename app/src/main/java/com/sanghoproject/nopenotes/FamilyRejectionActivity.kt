package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FamilyRejectionActivity : AppCompatActivity() {

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
        tvTitle.text = "가족 관계 거절 멘트"
        tvSubtitle.text = "가족에게 사용할 수 있는 적절한 거절 표현"
    }

    private fun prepareRejectionPhrases() {
        // 가족 관계에서 사용할 수 있는 거절 멘트 추가
        rejectionPhrases.add("지금은 개인 시간이 필요해서 혼자 있고 싶어요.")
        rejectionPhrases.add("오늘은 너무 피곤해서 다음에 도와드릴게요.")
        rejectionPhrases.add("지금 하고 있는 일이 있어서 나중에 부탁드려요.")
        rejectionPhrases.add("그건 제 성향과 맞지 않아서 어려울 것 같아요.")
        rejectionPhrases.add("지금은 다른 계획이 있어서 함께하기 어려워요.")
        rejectionPhrases.add("그 일은 제가 잘 모르는 분야라 도움이 안 될 것 같아요.")
        rejectionPhrases.add("오늘은 친구와 약속이 있어서 집에 일찍 들어오기 어려워요.")
        rejectionPhrases.add("제 일정을 먼저 확인해봐야 할 것 같아요.")
        rejectionPhrases.add("지금은 제 개인 시간이 필요해서 나중에 이야기해요.")
        rejectionPhrases.add("그건 제가 결정할 문제라고 생각해요.")
        rejectionPhrases.add("지금은 다른 중요한 일이 있어서 집안일을 도와드리기 어려워요.")
        rejectionPhrases.add("그 문제는 제가 스스로 해결하고 싶어요.")
        rejectionPhrases.add("지금은 휴식이 필요해서 다음에 함께해요.")
        rejectionPhrases.add("그건 제 취향이 아니라서 함께하기 어려울 것 같아요.")
        rejectionPhrases.add("지금은 다른 일에 집중하고 있어서 방해받고 싶지 않아요.")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rejectionPhrases)
        listView.adapter = adapter
    }
} 