package com.sanghoproject.nopenotes

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class WorkRejectionActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    
    private lateinit var cardBossEmployee: CardView
    private lateinit var cardSupervisorSubordinate: CardView
    private lateinit var cardColleague: CardView
    private lateinit var cardOtherDepartment: CardView
    private lateinit var cardSeniorJunior: CardView
    private lateinit var cardClient: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_rejection)

        initializeViews()
        setupTitles()
        setupClickListeners()
    }

    private fun initializeViews() {
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
        
        // 카드뷰 초기화
        cardBossEmployee = findViewById(R.id.cardBossEmployee)
        cardSupervisorSubordinate = findViewById(R.id.cardSupervisorSubordinate)
        cardColleague = findViewById(R.id.cardColleague)
        cardOtherDepartment = findViewById(R.id.cardOtherDepartment)
        cardSeniorJunior = findViewById(R.id.cardSeniorJunior)
        cardClient = findViewById(R.id.cardClient)
    }

    private fun setupTitles() {
        tvTitle.text = "직장 관계별 거절 멘트"
        tvSubtitle.text = "직장 내 관계에 따른 적절한 거절 멘트를 찾아보세요"
    }
    
    private fun setupClickListeners() {
        // 각 카드뷰에 클릭 리스너 설정
        cardBossEmployee.setOnClickListener {
            navigateToDetailScreen("사장-직원", "사장님과 직원 간의 거절 상황")
        }
        
        cardSupervisorSubordinate.setOnClickListener {
            navigateToDetailScreen("상사-부하", "상사와 부하 직원 간의 거절 상황")
        }
        
        cardColleague.setOnClickListener {
            navigateToDetailScreen("동료 간의 관계", "같은 팀 동료들과의 거절")
        }
        
        cardOtherDepartment.setOnClickListener {
            navigateToDetailScreen("타 부서와 나의 관계", "다른 부서와의 협업 거절")
        }
        
        cardSeniorJunior.setOnClickListener {
            navigateToDetailScreen("선배-후배", "직장 내 선후배 관계에서의 거절")
        }
        
        cardClient.setOnClickListener {
            navigateToDetailScreen("거래처/고객", "거래처나 고객과의 거절 상황")
        }
    }
    
    private fun navigateToDetailScreen(title: String, subtitle: String) {
        val intent = Intent(this, WorkRejectionDetailActivity::class.java).apply {
            putExtra("TITLE", title)
            putExtra("SUBTITLE", subtitle)
            putExtra("CATEGORY", title)
        }
        startActivity(intent)
    }
} 