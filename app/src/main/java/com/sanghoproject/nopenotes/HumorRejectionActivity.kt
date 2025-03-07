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
//        humorRejectionPhrases.add("제 지갑이 다이어트 중이라 지금은 어렵네요 😂")
//        humorRejectionPhrases.add("거절하고 싶은데 이유가 생각이 안 나네요. 내일 좋은 이유 갖고 다시 올게요! 👋")
//        humorRejectionPhrases.add("제 분신술이 아직 완성되지 않아서 그 시간에는 못 갈 것 같아요 🧙")
//        humorRejectionPhrases.add("전 사실 AI라 그런 기능은 지원하지 않습니다 🤖")
//        humorRejectionPhrases.add("지금 영혼이 방금 빠져나가는 중이라 다음에... 👻")
//        humorRejectionPhrases.add("내 심장이 그런 스릴을 견딜 수 있을지 모르겠어요 💔")
//        humorRejectionPhrases.add("지금 영혼이 방금 빠져나가는 중이라 다음에... 👻")
//        humorRejectionPhrases.add("그건 제 전문 분야가 아니라서... 저는 전문적으로 아무것도 안 하는 전문가예요 🏆")
//        humorRejectionPhrases.add("오늘은 제 게으름이 절정에 달해서 움직일 수가 없네요 🛌")
//        humorRejectionPhrases.add("그 제안은 너무 좋아서 현실이 아닌 것 같아요. 꿈에서 만나요! 💤")
//        humorRejectionPhrases.add("죄송한데 지금 제 달력을 보니 오늘은 '아니오'라고 말하는 날이네요 📅")
//        humorRejectionPhrases.add("그 일은 제 고양이가 허락하지 않을 것 같아요 🐱")
//        humorRejectionPhrases.add("지금 배터리가 1%라서 곧 꺼질 예정입니다... 🔋")
//        humorRejectionPhrases.add("그건 제 우주적 운명에 반하는 일이라 어렵습니다 🌠")
//        humorRejectionPhrases.add("오늘은 제가 투명인간 되는 날이라 아무도 못 만나요 🫥")
//        humorRejectionPhrases.add("그 시간에는 제 상상 속 친구와 약속이 있어요 🤝")
//        humorRejectionPhrases.add("지금 텔레포트 능력이 고장나서 그곳에 갈 수 없어요 ✨")
//        humorRejectionPhrases.add("그건 제 슈퍼히어로 비밀 정체성을 위험에 빠뜨릴 수 있어요 🦸")
//        humorRejectionPhrases.add("죄송해요, 오늘은 제 '거절 멘트 연습하는 날'이라서요 🎭")
//        humorRejectionPhrases.add("그 제안은 너무 좋아서 현실이 아닌 것 같아요. 꿈에서 만나요! 💤")

        // 먹을 거 나눠 달라고 할 때
        humorRejectionPhrases.add("🍔먹을 거 나눠 달라고 할 때🍔")
        humorRejectionPhrases.add("미안, 이 음식이 나랑 사랑에 빠져서 너한테 못 가!")
        humorRejectionPhrases.add("한 입 주면 나랑 이 음식 사이의 신뢰가 깨져!")
        humorRejectionPhrases.add("이거 내 위장이랑 사전 계약된 거라 양도 불가야!")
        humorRejectionPhrases.add("미안! 이 음식이 나한테 '주인님만 먹어요'라고 속삭였어!")
        // 영화/드라마 같이 보자는 요청 거절할 때
        humorRejectionPhrases.add("📺영화/드라마 같이 보자는 요청 거절할 때📺")
        humorRejectionPhrases.add("내 감정선이 요즘 바빠서 드라마까지 감당 못 해")
        humorRejectionPhrases.add("같이 보면 스포일러 못 참고 먼저 얘기할 수도 있어, 위험해")
        humorRejectionPhrases.add("지금 내 집중력 상태로 보면 10분 만에 잘 자신 있어")
        humorRejectionPhrases.add("이거 같이 보면 나 리액션 너무 심해서 극장에서 쫓겨날 수도 있어!")
        // 뭔가 같이 사자고 할 때 (공동 구매, 단체 비용 부담 등)
        humorRejectionPhrases.add("💸뭔가 같이 사자고 할 때💸")
        humorRejectionPhrases.add("지금 내 지갑이 '살려줘...'라고 속삭이고 있어")
        humorRejectionPhrases.add("요즘 내 통장에 가을이 찾아와서 낙엽이 우수수 떨어지는 중이야!")
        humorRejectionPhrases.add("이번 달 카드값이 나한테 '넌 이제 끝났다'라고 협박하고 있어!")
        humorRejectionPhrases.add("나는 공동 구매가 아니라, 혼자 살아남는 구매만 가능해!")
        // 운동 같이 하자는 요청 거절할 때
        humorRejectionPhrases.add("🚴‍♂️운동 같이 하자는 요청 거절할 떄🚴‍♂️‍")
        humorRejectionPhrases.add("지금 내 몸이 근육 생성보다 체지방 보호에 집중하고 있어서 힘들어")
        humorRejectionPhrases.add("운동? 내 심장이 '너 그거 하면 위험해'라고 경고했어!")
        humorRejectionPhrases.add("내 운동 목표는 하루 10,000보가 아니라 10,000시간 앉아있기야!")
        humorRejectionPhrases.add("내 몸이 에너지 절약 모드라서 움직이면 자동으로 꺼질 수도 있어!")
        // 도와달라는 요청 거절할 때
        humorRejectionPhrases.add("🔧도와달라는 요청 거절할 때🔧")
        humorRejectionPhrases.add("내 손재주는 마이너스라 도와주면 일이 더 커질 수도 있어!")
        humorRejectionPhrases.add("내가 도우면 네 문제 해결하는 게 아니라, 새 문제 생길 걸?")
        humorRejectionPhrases.add("이거 내가 도와주면 뉴스에 나올 수도 있는데 괜찮아?")
        humorRejectionPhrases.add("내 도움을 원하면, 그전에 응급처치 키트부터 준비해!")
        // 노래방 가자는 요청 거절할 때
        humorRejectionPhrases.add("🎤노래방 가자는 요청 거절할 때🎤")
        humorRejectionPhrases.add("내 목소리는 자동 음치 모드라, 고막이 위험할 수 있어!")
        humorRejectionPhrases.add("내 노래 들으면 기계도 음정 못 잡고 도망갈 걸?")
        humorRejectionPhrases.add("가고 싶긴 한데, 내 고막이 먼저 '안 돼!'라고 외쳤어!")
        humorRejectionPhrases.add("내 목소리 때문에 마이크가 충격받아서 꺼질 수도 있어!")
        // 게임 같이 하자는 요청 거절할 때
        humorRejectionPhrases.add("🎮게임 같이 하자는 요청 거절할 때🎮")
        humorRejectionPhrases.add("내 게임 실력으로 팀킬 가능성이 너무 높아!")
        humorRejectionPhrases.add("내가 하면 우리 팀이 아니라 적 팀이 유리해질 수도 있어!")
        humorRejectionPhrases.add("나랑 하면 게임이 아니라 생존 서바이벌 될 텐데 괜찮아?")
        humorRejectionPhrases.add("내 컨트롤 실력? 키보드가 나한테 도망갈 수준이야!")
        // 연애 조언/연애 상담 요청 거절할 때
        humorRejectionPhrases.add("💖연애 조언/연애 상담 요청 거절할 때💖")
        humorRejectionPhrases.add("내 연애 상담은 '연애하면 안 되는 법'에 더 가까워!")
        humorRejectionPhrases.add("내 조언 듣고 따라 하면... 솔로 탈출이 아니라 솔로 확정될 걸?")
        humorRejectionPhrases.add("내 연애 경험? 로딩 중인데 아직 0%야!")
        humorRejectionPhrases.add("네 연애 고민 듣다가 내가 더 마음의 상처 받을 수도 있어!")
        // 여행 같이 가자는 요청 거절할 때
        humorRejectionPhrases.add("🧳여행 같이 가자는 요청 거절할 때🧳")
        humorRejectionPhrases.add("여행 가고 싶긴 한데, 내 지갑이 공항 검색대에서 걸릴 것 같아!")
        humorRejectionPhrases.add("여행 가면 좋겠지만, 지금 내 통장이 '넌 집에 있어야 해'라고 말하고 있어!")
        humorRejectionPhrases.add("나랑 가면 여행이 아니라 체력 고갈 서바이벌 될 수도 있어!")
        humorRejectionPhrases.add("비행기표 예매보다 내 체력이 먼저 예매 취소할 듯!")
        // 책/공부 같이 하자는 요청 거절할 때
        humorRejectionPhrases.add("📖책/공부 같이 하자는 요청 거절할 때📖")
        humorRejectionPhrases.add("책을 펼치면 내 두뇌가 '전원 꺼짐' 모드로 자동 전환돼!")
        humorRejectionPhrases.add("공부? 내 머리가 먼저 도망가는 거 봤어!")
        humorRejectionPhrases.add("책을 읽는 게 아니라, 책이 날 읽는 기분이 들어서 무서워!")
        humorRejectionPhrases.add("공부하려면 먼저 내 두뇌 시스템을 업데이트해야 하는데, 서버 점검 중이야!")
        // 야식 같이 먹자는 요청 거절할 때
        humorRejectionPhrases.add("🍜야식 같이 먹자는 요청 거절할 때🍜")
        humorRejectionPhrases.add("야식이 위험한 게 아니라, 내 내일 체중계가 더 위험해!")
        humorRejectionPhrases.add("먹고 싶은데 내 위장이 '한 번만 참자'라고 간절히 부탁하고 있어!")
        humorRejectionPhrases.add("야식은 행복하지만, 내 아침 거울이 '너 후회할 거야'라고 속삭이고 있어!")
        humorRejectionPhrases.add("내 다이어트 앱이 울면서 '제발 그만!'이라고 알림 보내고 있어!")
        // 술자리 거절 멘트
        humorRejectionPhrases.add("🍺술자리 거절 멘트🍺")
        humorRejectionPhrases.add("오늘은 술보다 물이 더 맛있는 날이야!")
        humorRejectionPhrases.add("술 마시면 내 흑역사가 실시간 업데이트될 것 같아서 패스!")
        humorRejectionPhrases.add("오늘 마시면 내일 난 '누가 나 데려가 줘...' 상태 될 걸?")
        humorRejectionPhrases.add("술을 마시면 즐거운 게 아니라, 내 정신이 먼저 나가버려!")
        humorRejectionPhrases.add("내 간이 '오늘은 출근 안 합니다'라고 공지 올렸어!")
        // 전화/영상통화 요청 거절 멘트
        humorRejectionPhrases.add("📞전화/영상통화 요청 거절 멘트📞")
        humorRejectionPhrases.add("지금 내 목소리가 ASMR 모드라... 자장가 될 수도 있는데 괜찮아?")
        humorRejectionPhrases.add("지금 영상통화하면 내 얼굴이 '초상권 침해'신고할 수도 있어!")
        humorRejectionPhrases.add("오늘은 '채팅 전용' 모드라서 전화 기능이 고장 났어!")
        humorRejectionPhrases.add("화면에 잡히면 난생처음 내 모습에 놀랄 수도 있어, 조심해!")
        humorRejectionPhrases.add("오늘 내 말빨이 약해서 전화하면 '음.. 어.. 그래..'만 할 수도 있어!")
        // 돈 빌려달라는 요청 거절 멘트
        humorRejectionPhrases.add("💲돈 비렬달라는 요청 거절 멘트💲")
        humorRejectionPhrases.add("나도 요즘 통장한테 용돈 달라고 하고 싶은데, 걔가 씹어!")
        humorRejectionPhrases.add("돈 빌려주면 내 통장이 나한테 절교 선언할 것 같아!")
        humorRejectionPhrases.add("돈보다 중요한 건 우정인데... 돈을 빌려주면 그게 사라질 수도 있어!")
        humorRejectionPhrases.add("내 지갑이 요즘 '텅장'이라 바람만 들어와!")
        humorRejectionPhrases.add("빌려주면 너는 기분 좋겠지만, 난 통장과 이별할 듯!")
        // 차/물건 빌려달라는 요청 거절 멘트
        humorRejectionPhrases.add("🚗차/물건 빌려달라는 요청 거절 멘트🚗")
        humorRejectionPhrases.add("내 차는 나 아니면 시동도 안 걸리는 설격이라 미안!")
        humorRejectionPhrases.add("이 물건이 나랑 정이 들어서 떨어지면 외로워할 거야!")
        humorRejectionPhrases.add("빌려줬다가 돌아올 때 상테가 달라지면 내 심장이 무너질 듯!")
        humorRejectionPhrases.add("내 물건은 '렌탈 불가' 시스템이라 메뉴얼에도 없어!")
        humorRejectionPhrases.add("차를 빌려주면, 같이 내 멘탈도 떠나버릴 것 같아!")
        // 심부름 부탁 거절 멘트
        humorRejectionPhrases.add("🙅‍♂️심부름 부탁 거절 멘트🙅‍♂️")
        humorRejectionPhrases.add("심부름 퀘스트는 요즘 하루 OFF 상태라 접수 불가야!")
        humorRejectionPhrases.add("내 다리가 오늘 '출장 금지' 명령을 내려서 못 움직여!")
        humorRejectionPhrases.add("이거 해주면 내 하루 일정이 다 엉켜서 미안!")
        humorRejectionPhrases.add("지금 이 심부름 하면 내 남은 체력이 5% 미만이 될 수도 있어!")
        humorRejectionPhrases.add("내 심부름 스킬 레벨이 1이라, 결과 보장 못 해!")
        // 다이어트 같이 하자는 요청 거절 멘트
        humorRejectionPhrases.add("🏋️‍♂️다이어트 같이 하자는 요청 거절 멘트🏋️‍♂️")
        humorRejectionPhrases.add("내 몸이 아직 '체중 감량' 업데이트를 지원하지 않는 버전이야!")
        humorRejectionPhrases.add("운동이 중요한 거 아는데, 난 '맛집 탐방'에 더 소질이 있는 듯!")
        humorRejectionPhrases.add("다이어트는 내일의 나에게 맡기기로 했어. 근데 그 내일이 안 와!")
        humorRejectionPhrases.add("먹을 때 가장 행복한데, 왜 그 행복을 빼앗으려 해?")
        humorRejectionPhrases.add("내 위장이 '나 배신할 거야?'라고 울고 있어!")
        // 소개팅 요청 거절 멘트
        humorRejectionPhrases.add("💞소개팅 요청 거절 멘트💞")
        humorRejectionPhrases.add("지금 내 연애력은 '초보자' 단계라 실전 투입 불가!")
        humorRejectionPhrases.add("난 아직 '혼자가 편한 모드'라 연애 업데이트는 보류 중!")
        humorRejectionPhrases.add("소개팅보다 내 연애운이 먼저 활성화돼야 할 듯!")
        humorRejectionPhrases.add("소개팅보다 편한 게 집에서 넷플릭스 보는 거야!")
        humorRejectionPhrases.add("지금 내 마음이 '연애 말고 돈 벌기' 모드라서 미안!")
        // 갑작스러운 약속 요청 거절 멘트
        humorRejectionPhrases.add("📆갑작스러운 약속 요청 거절 멘트📆")
        humorRejectionPhrases.add("내 사회적 배터리가 방전 상태라 충전이 필요해!")
        humorRejectionPhrases.add("오늘 나가면 내 집이 나한테 '배신자'라고 할 것 같아!")
        humorRejectionPhrases.add("내 일정표에 '혼자만의 시간'이라고 굵게 적혀 있어서,,")
        humorRejectionPhrases.add("지금 나감녀 내 침대랑 이별해야 하는데, 그건 못 해!")
        humorRejectionPhrases.add("약속 잡을 땐 미리 공문을 보내줘야 해!")
        // 집 방문 요청 거절 멘트
        humorRejectionPhrases.add("🏠집 방문 요청 거절 멘트🏠")
        humorRejectionPhrases.add("우리 집은 현재 '방문 금지 구역'으로 지정됐어!")
        humorRejectionPhrases.add("지금 내 방 상태는 자연재해 수준이라 출입이 위험해!")
        humorRejectionPhrases.add("집이 아니라 탐험해야 할 던전이 돼서 방문이 불가능!")
        humorRejectionPhrases.add("집 상태가 내가 봐도 '이건 아니다'싶어서 다음 기회에!")
        humorRejectionPhrases.add("이 집의 주인이 나긴 한데, 현재 통제권이 없는 상태라...")


    }

    private fun setupListView() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, humorRejectionPhrases)
        listViewHumorPhrases.adapter = adapter
    }
} 