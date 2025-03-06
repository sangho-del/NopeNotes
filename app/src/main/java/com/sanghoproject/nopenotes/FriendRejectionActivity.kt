package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FriendRejectionActivity : AppCompatActivity() {

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
        tvTitle.text = "친구 관계 거절 멘트"
        tvSubtitle.text = "친구에게 사용할 수 있는 적절한 거절 표현"
    }

    private fun prepareRejectionPhrases() {
        // 친구 관계에서 사용할 수 있는 거절 멘트 추가
        rejectionPhrases.add("오늘은 개인적인 일이 있어서 다음에 만나자.")
        rejectionPhrases.add("지금 다른 약속이 있어서 어렵네.")
        rejectionPhrases.add("미안한데 오늘은 컨디션이 안 좋아서 다음에 보자.")
        rejectionPhrases.add("그날은 가족 행사가 있어서 참석하기 어려울 것 같아.")
        rejectionPhrases.add("요즘 바빠서 시간 내기가 어려워. 다음 주에는 어때?")
        rejectionPhrases.add("그건 내 스타일이 아니라서 함께하기 어려울 것 같아.")
        rejectionPhrases.add("미안한데 지금 여유가 없어서 다음에 도와줄게.")
        rejectionPhrases.add("그 시간에는 이미 다른 약속이 있어.")
        rejectionPhrases.add("솔직히 그건 내가 관심 있는 분야가 아니라서 패스할게.")
        rejectionPhrases.add("요즘 경제적으로 좀 빠듯해서 다음에 함께하자.")
        rejectionPhrases.add("그날은 집에서 쉬고 싶어서 나가기 어려울 것 같아.")
        rejectionPhrases.add("미안한데 그건 내가 잘 모르는 분야라 도움이 안 될 것 같아.")
        rejectionPhrases.add("다른 친구들과 약속이 있어서 합류하기 어려울 것 같아.")
        rejectionPhrases.add("그 날은 집에 일찍 들어가야 해서 늦게까지 있기 어려워.")
        rejectionPhrases.add("미안한데 그건 내 취향이 아니라서 함께하기 어려울 것 같아.")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rejectionPhrases)
        listView.adapter = adapter
    }
} 