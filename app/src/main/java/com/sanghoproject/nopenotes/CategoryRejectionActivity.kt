package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryRejectionActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter
    private val categoryItems = ArrayList<CategoryItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_rejection)

        prepareCategoryItems()
        setupRecyclerView()
    }

    private fun prepareCategoryItems() {
        // 1. 직장 관계
        categoryItems.add(
            CategoryItem(
                1,
                "직장",
                "상사, 동료, 부하직원과의 거절",
                R.drawable.ic_category
            )
        )

        // 2. 친구 관계
        categoryItems.add(
            CategoryItem(
                2,
                "친구",
                "친구, 지인과의 거절",
                R.drawable.ic_smile
            )
        )

        // 3. 가족 관계
        categoryItems.add(
            CategoryItem(
                3,
                "가족",
                "부모님, 형제자매와의 거절",
                R.drawable.ic_bad
            )
        )

        // 4. 부부 관계
        categoryItems.add(
            CategoryItem(
                4,
                "부부",
                "배우자와의 거절",
                R.drawable.ic_light
            )
        )

        // 5. 연인 관계
        categoryItems.add(
            CategoryItem(
                5,
                "연인",
                "애인, 데이트 상대와의 거절",
                R.drawable.ic_list
            )
        )

        // 6. 선배/후배 관계
        categoryItems.add(
            CategoryItem(
                6,
                "선배/후배",
                "학교, 동아리 선후배와의 거절",
                R.drawable.ic_tip
            )
        )
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerViewCategories)

        // 2열 그리드 레이아웃 매니저 설정
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        categoryAdapter = CategoryAdapter(categoryItems) { categoryItem ->
            // 아이템 클릭 이벤트 처리
            when (categoryItem.id) {
                1 -> navigateToWorkRejection()
                2 -> navigateToFriendRejection()
                3 -> navigateToFamilyRejection()
                4 -> navigateToSpouseRejection()
                5 -> navigateToLoverRejection()
                6 -> navigateToSeniorJuniorRejection()
            }
        }

        recyclerView.adapter = categoryAdapter
    }

    // 각 카테고리별 화면 이동 함수
    private fun navigateToWorkRejection() {
        Toast.makeText(this, "직장 관계 거절 멘트 화면으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, WorkRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToFriendRejection() {
        Toast.makeText(this, "친구 관계 거절 멘트 화면으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, FriendRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToFamilyRejection() {
        Toast.makeText(this, "가족 관계 거절 멘트 화면으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, FamilyRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSpouseRejection() {
        Toast.makeText(this, "부부 관계 거절 멘트 화면으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SpouseRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToLoverRejection() {
        Toast.makeText(this, "연인 관계 거절 멘트 화면으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, LoverRejectionActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSeniorJuniorRejection() {
        Toast.makeText(this, "선배/후배 관계 거절 멘트 화면으로 이동합니다", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SeniorJuniorRejectionActivity::class.java)
        startActivity(intent)
    }
} 