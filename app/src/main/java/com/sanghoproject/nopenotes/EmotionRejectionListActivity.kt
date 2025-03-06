package com.sanghoproject.nopenotes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmotionRejectionListActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RejectionMessageAdapter

    private var emotionType: String = "SOFT" // 기본값

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_rejection_list)

        // 인텐트에서 데이터 가져오기
        intent.extras?.let {
            val title = it.getString("TITLE", "부드럽게 거절")
            emotionType = it.getString("EMOTION_TYPE", "SOFT")
            
            // 제목 설정
            tvTitle = findViewById(R.id.tvTitle)
            tvTitle.text = title
        }

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        // 선택한 감정 타입에 맞는 거절 멘트 목록 가져오기
        val messages = getMessagesForEmotionType(emotionType)
        
        adapter = RejectionMessageAdapter(messages)
        recyclerView.adapter = adapter
    }

    private fun getMessagesForEmotionType(type: String): List<RejectionMessage> {
        return when (type) {
            "SOFT" -> getSoftRejectionMessages()
            "FIRM" -> getFirmRejectionMessages()
            "HUMOR" -> getHumorRejectionMessages()
            else -> emptyList()
        }
    }

    private fun getSoftRejectionMessages(): List<RejectionMessage> {
        return listOf(
            RejectionMessage(
                "죄송합니다만, 지금은 다른 일정이 있어서 참석하기 어려울 것 같습니다.",
                "모임 초대 거절",
                "SOFT"
            ),
            RejectionMessage(
                "정말 감사한 제안이지만, 현재 상황에서는 수락하기 어렵네요. 다음 기회에 함께하고 싶습니다.",
                "프로젝트 참여 거절",
                "SOFT"
            ),
            RejectionMessage(
                "제안해 주셔서 감사합니다. 하지만 지금은 다른 업무로 인해 시간을 내기 어려울 것 같아요.",
                "업무 요청 거절",
                "SOFT"
            ),
            RejectionMessage(
                "고민해 봤는데, 지금은 개인적인 사정으로 도움을 드리기 어려울 것 같습니다. 양해 부탁드립니다.",
                "도움 요청 거절",
                "SOFT"
            ),
            RejectionMessage(
                "좋은 제안 감사합니다만, 지금은 다른 계획이 있어 함께하기 어렵습니다. 다음에 기회가 되면 좋겠네요.",
                "여행 초대 거절",
                "SOFT"
            )
        )
    }

    private fun getFirmRejectionMessages(): List<RejectionMessage> {
        return listOf(
            RejectionMessage(
                "아니요, 참석할 수 없습니다. 이미 다른 일정이 확정되어 있습니다.",
                "모임 초대 거절",
                "FIRM"
            ),
            RejectionMessage(
                "해당 프로젝트에 참여할 수 없습니다. 현재 다른 업무에 집중하고 있어 추가 업무를 맡을 여력이 없습니다.",
                "프로젝트 참여 거절",
                "FIRM"
            ),
            RejectionMessage(
                "요청하신 업무는 수행할 수 없습니다. 현재 우선순위가 높은 다른 업무가 있습니다.",
                "업무 요청 거절",
                "FIRM"
            ),
            RejectionMessage(
                "도움을 드릴 수 없습니다. 개인적인 사정으로 인해 불가능합니다.",
                "도움 요청 거절",
                "FIRM"
            ),
            RejectionMessage(
                "여행에 함께할 수 없습니다. 이미 다른 계획을 세워두었습니다.",
                "여행 초대 거절",
                "FIRM"
            )
        )
    }

    private fun getHumorRejectionMessages(): List<RejectionMessage> {
        return listOf(
            RejectionMessage(
                "오늘 모임에 가면 내 침대가 외로워할 것 같아서... 다음에 함께해요!",
                "모임 초대 거절",
                "HUMOR"
            ),
            RejectionMessage(
                "새 프로젝트요? 지금 제 뇌는 이미 오버부킹 상태라 한 개의 뉴런도 더 쓸 수 없네요!",
                "프로젝트 참여 거절",
                "HUMOR"
            ),
            RejectionMessage(
                "지금 제 할 일 목록은 에베레스트산만큼 높아져서, 더 추가하면 산사태가 날 것 같아요!",
                "업무 요청 거절",
                "HUMOR"
            ),
            RejectionMessage(
                "도움을 드리고 싶지만, 오늘은 제 슈퍼히어로 망토를 세탁소에 맡겨서요...",
                "도움 요청 거절",
                "HUMOR"
            ),
            RejectionMessage(
                "여행이요? 지금 제 지갑이 '비상금 보존 모드'라서... 다음에 함께해요!",
                "여행 초대 거절",
                "HUMOR"
            )
        )
    }
} 