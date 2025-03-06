package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoverRejectionActivity : AppCompatActivity() {

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
        tvTitle.text = "연인 관계 거절 멘트"
        tvSubtitle.text = "연인에게 사용할 수 있는 적절한 거절 표현"
    }

    private fun prepareRejectionPhrases() {
        // 연인 관계에서 사용할 수 있는 거절 멘트 추가
        rejectionPhrases.add("오늘은 컨디션이 안 좋아서 다음에 만나면 어떨까?")
        rejectionPhrases.add("지금은 혼자 있고 싶어서 나중에 연락할게.")
        rejectionPhrases.add("그건 내 취향이 아니라서 함께하기 어려울 것 같아.")
        rejectionPhrases.add("오늘은 친구들과 약속이 있어서 시간이 안 될 것 같아.")
        rejectionPhrases.add("그 문제는 좀 더 생각해보고 결정하고 싶어.")
        rejectionPhrases.add("지금은 개인적인 시간이 필요해서 나중에 이야기하자.")
        rejectionPhrases.add("그건 우리 관계에 맞지 않을 것 같아.")
        rejectionPhrases.add("오늘은 가족 모임이 있어서 만나기 어려울 것 같아.")
        rejectionPhrases.add("그 일은 내가 결정하고 싶은 부분이야.")
        rejectionPhrases.add("지금은 다른 일에 집중하고 있어서 방해받고 싶지 않아.")
        rejectionPhrases.add("그건 내가 불편해하는 부분이라 함께하기 어려워.")
        rejectionPhrases.add("오늘은 피곤해서 일찍 자고 싶어.")
        rejectionPhrases.add("그 결정은 좀 더 시간을 두고 생각해보고 싶어.")
        rejectionPhrases.add("지금은 경제적으로 여유가 없어서 다음에 하자.")
        rejectionPhrases.add("그건 우리 둘 다 원하는 방향으로 다시 생각해보자.")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rejectionPhrases)
        listView.adapter = adapter
    }
} 