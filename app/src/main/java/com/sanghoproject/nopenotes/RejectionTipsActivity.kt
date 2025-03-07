package com.sanghoproject.nopenotes

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RejectionTipsActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    private lateinit var listViewRejectionTips: ListView
    private val rejectionTipsList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rejection_tips)

        initializeViews()
        setupTitles()
        prepareRejectionTips()
        setupListView()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        listViewRejectionTips = findViewById(R.id.listViewRejectionTips)
    }

    private fun setupTitles() {
        tvTitle.text = "거절 팁 & 분위기 풀기"
        tvSubtitle.text = "거절 후에도 관계를 유지하는 방법"
    }

    private fun prepareRejectionTips() {
        // 화제 전환하기
        rejectionTipsList.add("🔄 화제 전환하기")
        rejectionTipsList.add("거절한 후 바로 다른 주제로 대화를 전환합니다. 예를 들어, '오늘 저녁은 못 갈 것 같은데, 그런데 지난번에 추천해줬던 그 영화 봤어. 정말 재미있더라고!'")
        rejectionTipsList.add("• '지금은 어려울 것 같아요. 그런데 혹시 지난 주말에 개봉한 그 영화 보셨어요?'")
        rejectionTipsList.add("• '오늘은 시간이 안 될 것 같네요. 그나저나 요즘 날씨가 정말 좋아졌죠?'")
        
        // 공통 관심사 언급하기
        rejectionTipsList.add("👥 공통 관심사 언급하기")
        rejectionTipsList.add("둘 다 관심 있는 주제로 대화를 돌려보세요. '이번 주말 약속은 어렵지만, 우리 다음 주에 나오는 그 영화 같이 보는 건 어때?'")
        rejectionTipsList.add("• '지금 그 프로젝트는 참여하기 어렵지만, 다음에 계획 중인 마케팅 캠페인에는 꼭 함께하고 싶어요.'")
        rejectionTipsList.add("• '오늘 저녁 약속은 못 지킬 것 같은데, 우리가 좋아하는 그 카페에서 다음 주에 만날까요?'")
        
        // 질문으로 대화 이어가기
        rejectionTipsList.add("❓ 질문으로 대화 이어가기")
        rejectionTipsList.add("상대방에게 질문을 던져 대화를 이어갑니다. '내가 못 가서 미안한데, 너는 어떤 계획 있어?'")
        rejectionTipsList.add("• '제가 지금 도와드리기 어려운데, 혹시 다른 분께 문의해보셨나요?'")
        rejectionTipsList.add("• '이번에는 참석하기 어려울 것 같아요. 그런데 행사 준비는 잘 되어가고 있나요?'")
        
        // 유머 사용하기
        rejectionTipsList.add("😄 유머 사용하기")
        rejectionTipsList.add("가벼운 농담으로 어색한 분위기 풀기")
        rejectionTipsList.add("• '오늘은 제 에너지가 바닥났어요. 충전기를 두고 와서 그런가 봐요!'")
        rejectionTipsList.add("• '지금은 안 되지만, 다음에는 슈퍼맨처럼 날아갈게요!'")
        
        // 대안 제시하기
        rejectionTipsList.add("🔄 대안 제시하기")
        rejectionTipsList.add("거절하면서 다른 대안을 제시하여 상대방의 실망감을 줄입니다.")
        rejectionTipsList.add("• '오늘 저녁은 어렵지만, 내일 점심은 어떠세요?'")
        rejectionTipsList.add("• '제가 직접 도와드릴 순 없지만, 이 문제에 대해 잘 아는 김 대리를 소개해 드릴게요.'")
    }

    private fun setupListView() {
        // 커스텀 어댑터를 사용하여 이모티콘이 포함된 텍스트의 색상을 남색으로 변경
        val adapter = object : ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            rejectionTipsList
        ) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<TextView>(android.R.id.text1)
                val text = rejectionTipsList[position]
                
                // 이모티콘이 포함된 텍스트인지 확인
                if (text.contains(Regex("[\uD83C-\uDBFF\uDC00-\uDFFF]|[\u2600-\u27FF]"))) {
                    textView.setTextColor(Color.parseColor("#000080")) // 남색
                    textView.setTypeface(textView.typeface, android.graphics.Typeface.BOLD) // 진하게
                } else {
                    textView.setTextColor(Color.parseColor("#666666")) // 연한 검은색
                }
                
                return view
            }
        }
        
        listViewRejectionTips.adapter = adapter
    }
} 