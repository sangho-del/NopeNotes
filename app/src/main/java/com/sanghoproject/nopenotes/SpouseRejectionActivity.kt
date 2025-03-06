package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SpouseRejectionActivity : AppCompatActivity() {

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
        tvTitle.text = "부부 관계 거절 멘트"
        tvSubtitle.text = "배우자에게 사용할 수 있는 적절한 거절 표현"
    }

    private fun prepareRejectionPhrases() {
        // 부부 관계에서 사용할 수 있는 거절 멘트 추가
        rejectionPhrases.add("오늘은 너무 피곤해서 내일 이야기하면 어떨까요?")
        rejectionPhrases.add("지금은 혼자만의 시간이 필요해요.")
        rejectionPhrases.add("그건 우리 예산에 맞지 않을 것 같아요.")
        rejectionPhrases.add("오늘은 제 컨디션이 좋지 않아서 다음에 함께해요.")
        rejectionPhrases.add("그 문제는 좀 더 생각해보고 결정하고 싶어요.")
        rejectionPhrases.add("지금은 다른 일에 집중하고 있어서 나중에 도와줄게요.")
        rejectionPhrases.add("그건 제 취향이 아니라서 함께하기 어려울 것 같아요.")
        rejectionPhrases.add("오늘은 일찍 자고 싶어서 외출하기 어려워요.")
        rejectionPhrases.add("그 일은 당신이 더 잘할 수 있을 것 같아요.")
        rejectionPhrases.add("지금은 개인 시간이 필요해서 나중에 이야기해요.")
        rejectionPhrases.add("그건 우리 둘 다 원하는 방향이 아닌 것 같아요.")
        rejectionPhrases.add("오늘은 친구와 약속이 있어서 함께하기 어려워요.")
        rejectionPhrases.add("그 결정은 좀 더 시간을 두고 생각해봐야 할 것 같아요.")
        rejectionPhrases.add("지금은 휴식이 필요해서 집안일은 내일 할게요.")
        rejectionPhrases.add("그건 우리 둘 다 원하는 방향으로 다시 생각해봐요.")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rejectionPhrases)
        listView.adapter = adapter
    }
} 