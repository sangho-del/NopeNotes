package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var menuAdapter: MenuAdapter
    private val menuItems = ArrayList<MenuItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prepareMenuItems()
        setupRecyclerView()
    }

    private fun prepareMenuItems() {
        // 1. 카테고리별 거절
        menuItems.add(
            MenuItem(
                1,
                "카테고리별 거절",
                "관계별 & 상황별 거절 멘트 모음",
                R.drawable.ic_list // 실제로는 카테고리 아이콘으로 변경해야 함
            )
        )

        // 2. 거절 멘트 검색
        menuItems.add(
            MenuItem(
                2,
                "거절 멘트 검색",
                "필요한 거절 멘트를 빠르게 검색",
                R.drawable.ic_category // 돋보기 아이콘
            )
        )

        // 3. 거절 멘트 추천
        menuItems.add(
            MenuItem(
                3,
                "거절 멘트 추천",
                "AI가 상황에 맞는 거절 멘트 추천",
                R.drawable.ic_light // 실제로는 AI 로봇 또는 전구 아이콘으로 변경해야 함
            )
        )

        // 4. 유머 거절
        menuItems.add(
            MenuItem(
                4,
                "유머 거절",
                "센스 있는 거절 멘트 모음",
                R.drawable.ic_smile // 실제로는 웃는 얼굴 아이콘으로 변경해야 함
            )
        )

        // 5. 거절 팁 & 분위기 풀기
        menuItems.add(
            MenuItem(
                5,
                "거절 팁 & 분위기 풀기",
                "거절 후 자연스럽게 넘기는 법",
                R.drawable.ic_tip // 실제로는 말풍선 또는 전구 아이콘으로 변경해야 함
            )
        )

        // 6. 감정별 거절 멘트
        menuItems.add(
            MenuItem(
                6,
                "감정별 거절 멘트",
                "부드럽게 vs 단호하게 vs 유머",
                R.drawable.ic_bad // 실제로는 감정 아이콘으로 변경해야 함
            )
        )
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)

        // 3x3 그리드 레이아웃 매니저 설정 (2개 아이템 추가 시 3x3 그리드)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        menuAdapter = MenuAdapter(menuItems) { menuItem ->
            // 아이템 클릭 이벤트 처리
            when (menuItem.id) {
                1 -> navigateToCategoryRejection()
                2 -> navigateToSearchRejection()
                3 -> navigateToAIRecommendation()
                4 -> navigateToHumorRejection()
                5 -> navigateToRejectionTips()
                6 -> navigateToEmotionRejection()
            }
        }

        recyclerView.adapter = menuAdapter
    }

    // 각 메뉴 아이템별 화면 이동 함수
    private fun navigateToCategoryRejection() {
        val intent = Intent(this, CategoryRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSearchRejection() {
        val intent = Intent(this, SearchRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToAIRecommendation() {
        val intent = Intent(this, RecommendRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHumorRejection() {
        val intent = Intent(this, HumorRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToRejectionTips() {
        val intent = Intent(this, RejectionTipsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToEmotionRejection() {
        val intent = Intent(this, EmotionRejectionActivity::class.java)
        startActivity(intent)
    }
}