package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HumorRejectionActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    private lateinit var listViewHumorPhrases: ListView
    private val humorRejectionPhrases = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_humor_rejection)

        initializeViews()
        setupTitles()
        prepareHumorRejectionPhrases()
        setupListView()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        listViewHumorPhrases = findViewById(R.id.listViewHumorPhrases)
    }

    private fun setupTitles() {
        tvTitle.text = "유머 거절 멘트"
        tvSubtitle.text = "센스 있게 거절하는 유머러스한 표현들"
    }

    private fun prepareHumorRejectionPhrases() {
        // 유머러스한 거절 멘트 추가
        humorRejectionPhrases.add("제 지갑이 다이어트 중이라 지금은 어렵네요 😂")
        humorRejectionPhrases.add("거절하고 싶은데 이유가 생각이 안 나네요. 내일 좋은 이유 갖고 다시 올게요! 👋")
        humorRejectionPhrases.add("제 분신술이 아직 완성되지 않아서 그 시간에는 못 갈 것 같아요 🧙")
        humorRejectionPhrases.add("전 사실 AI라 그런 기능은 지원하지 않습니다 🤖")
        humorRejectionPhrases.add("지금 영혼이 방금 빠져나가는 중이라 다음에... 👻")
        humorRejectionPhrases.add("내 심장이 그런 스릴을 견딜 수 있을지 모르겠어요 💔")
        humorRejectionPhrases.add("지금 영혼이 방금 빠져나가는 중이라 다음에... 👻")
        humorRejectionPhrases.add("그건 제 전문 분야가 아니라서... 저는 전문적으로 아무것도 안 하는 전문가예요 🏆")
        humorRejectionPhrases.add("오늘은 제 게으름이 절정에 달해서 움직일 수가 없네요 🛌")
        humorRejectionPhrases.add("그 제안은 너무 좋아서 현실이 아닌 것 같아요. 꿈에서 만나요! 💤")
        humorRejectionPhrases.add("죄송한데 지금 제 달력을 보니 오늘은 '아니오'라고 말하는 날이네요 📅")
        humorRejectionPhrases.add("그 일은 제 고양이가 허락하지 않을 것 같아요 🐱")
        humorRejectionPhrases.add("지금 배터리가 1%라서 곧 꺼질 예정입니다... 🔋")
        humorRejectionPhrases.add("그건 제 우주적 운명에 반하는 일이라 어렵습니다 🌠")
        humorRejectionPhrases.add("오늘은 제가 투명인간 되는 날이라 아무도 못 만나요 🫥")
        humorRejectionPhrases.add("그 시간에는 제 상상 속 친구와 약속이 있어요 🤝")
        humorRejectionPhrases.add("지금 텔레포트 능력이 고장나서 그곳에 갈 수 없어요 ✨")
        humorRejectionPhrases.add("그건 제 슈퍼히어로 비밀 정체성을 위험에 빠뜨릴 수 있어요 🦸")
        humorRejectionPhrases.add("죄송해요, 오늘은 제 '거절 멘트 연습하는 날'이라서요 🎭")
        humorRejectionPhrases.add("그 제안은 너무 좋아서 현실이 아닌 것 같아요. 꿈에서 만나요! 💤")
    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, humorRejectionPhrases)
        listViewHumorPhrases.adapter = adapter
    }
} 