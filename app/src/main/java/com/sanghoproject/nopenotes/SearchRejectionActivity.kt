package com.sanghoproject.nopenotes

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchRejectionActivity : AppCompatActivity() {

    private lateinit var editTextSearch: EditText
    private lateinit var listViewResults: ListView
    private lateinit var tvNoResults: TextView
    private lateinit var tvTitle: TextView
    private lateinit var tvSubtitle: TextView
    
    private val allRejectionPhrases = ArrayList<String>()
    private val filteredPhrases = ArrayList<String>()
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_rejection)

        initializeViews()
        setupTitles()
        prepareAllRejectionPhrases()
        setupListView()
        setupSearchListener()
    }

    private fun initializeViews() {
        editTextSearch = findViewById(R.id.editTextSearch)
        listViewResults = findViewById(R.id.listViewResults)
        tvNoResults = findViewById(R.id.tvNoResults)
        tvTitle = findViewById(R.id.tvTitle)
        tvSubtitle = findViewById(R.id.tvSubtitle)
    }

    private fun setupTitles() {
        tvTitle.text = "거절 멘트 검색"
        tvSubtitle.text = "필요한 거절 멘트를 빠르게 검색하세요"
    }

    private fun prepareAllRejectionPhrases() {
        // 직장 관계 거절 멘트
        allRejectionPhrases.add("[직장] 현재 진행 중인 업무가 있어 지금은 어렵습니다.")
        allRejectionPhrases.add("[직장] 일정을 확인해보니 해당 시간에는 다른 미팅이 있습니다.")
        allRejectionPhrases.add("[직장] 제 업무 범위를 벗어나는 일이라 도움을 드리기 어렵습니다.")
        allRejectionPhrases.add("[직장] 지금 맡은 프로젝트에 집중해야 해서 추가 업무는 어렵습니다.")
        allRejectionPhrases.add("[직장] 부서 내 규정상 해당 요청은 수락하기 어렵습니다.")

        // 친구 관계 거절 멘트
        allRejectionPhrases.add("[친구] 오늘은 개인적인 일이 있어서 다음에 만나자.")
        allRejectionPhrases.add("[친구] 지금 다른 약속이 있어서 어렵네.")
        allRejectionPhrases.add("[친구] 미안한데 오늘은 컨디션이 안 좋아서 다음에 보자.")
        allRejectionPhrases.add("[친구] 그날은 가족 행사가 있어서 참석하기 어려울 것 같아.")
        allRejectionPhrases.add("[친구] 요즘 바빠서 시간 내기가 어려워. 다음 주에는 어때?")

        // 가족 관계 거절 멘트
        allRejectionPhrases.add("[가족] 지금은 개인 시간이 필요해서 혼자 있고 싶어요.")
        allRejectionPhrases.add("[가족] 오늘은 너무 피곤해서 다음에 도와드릴게요.")
        allRejectionPhrases.add("[가족] 지금 하고 있는 일이 있어서 나중에 부탁드려요.")
        allRejectionPhrases.add("[가족] 그건 제 성향과 맞지 않아서 어려울 것 같아요.")
        allRejectionPhrases.add("[가족] 지금은 다른 계획이 있어서 함께하기 어려워요.")

        // 부부 관계 거절 멘트
        allRejectionPhrases.add("[부부] 오늘은 너무 피곤해서 내일 이야기하면 어떨까요?")
        allRejectionPhrases.add("[부부] 지금은 혼자만의 시간이 필요해요.")
        allRejectionPhrases.add("[부부] 그건 우리 예산에 맞지 않을 것 같아요.")
        allRejectionPhrases.add("[부부] 오늘은 제 컨디션이 좋지 않아서 다음에 함께해요.")
        allRejectionPhrases.add("[부부] 그 문제는 좀 더 생각해보고 결정하고 싶어요.")

        // 연인 관계 거절 멘트
        allRejectionPhrases.add("[연인] 오늘은 컨디션이 안 좋아서 다음에 만나면 어떨까?")
        allRejectionPhrases.add("[연인] 지금은 혼자 있고 싶어서 나중에 연락할게.")
        allRejectionPhrases.add("[연인] 그건 내 취향이 아니라서 함께하기 어려울 것 같아.")
        allRejectionPhrases.add("[연인] 오늘은 친구들과 약속이 있어서 시간이 안 될 것 같아.")
        allRejectionPhrases.add("[연인] 그 문제는 좀 더 생각해보고 결정하고 싶어.")

        // 선배/후배 관계 거절 멘트
        allRejectionPhrases.add("[선후배] 죄송한데 지금은 다른 일정이 있어서 어려울 것 같습니다.")
        allRejectionPhrases.add("[선후배] 오늘은 개인적인 일이 있어서 다음에 함께하면 어떨까요?")
        allRejectionPhrases.add("[선후배] 지금은 시간이 안 될 것 같아서 다음 기회에 참여하겠습니다.")
        allRejectionPhrases.add("[선후배] 그건 제 전공과 맞지 않아서 도움을 드리기 어려울 것 같습니다.")
        allRejectionPhrases.add("[선후배] 죄송하지만 그 날은 이미 다른 약속이 있습니다.")
        
        // 초기 상태에서는 모든 문구 표시
        filteredPhrases.addAll(allRejectionPhrases)
    }

    private fun setupListView() {
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, filteredPhrases)
        listViewResults.adapter = adapter
    }

    private fun setupSearchListener() {
        editTextSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                filterPhrases(s.toString())
            }
        })
    }

    private fun filterPhrases(query: String) {
        filteredPhrases.clear()
        
        if (query.isEmpty()) {
            // 검색어가 없으면 모든 문구 표시
            filteredPhrases.addAll(allRejectionPhrases)
        } else {
            // 검색어가 포함된 문구만 필터링
            for (phrase in allRejectionPhrases) {
                if (phrase.contains(query, ignoreCase = true)) {
                    filteredPhrases.add(phrase)
                }
            }
        }
        
        adapter.notifyDataSetChanged()
        
        // 검색 결과가 없을 때 메시지 표시
        if (filteredPhrases.isEmpty()) {
            tvNoResults.visibility = View.VISIBLE
            listViewResults.visibility = View.GONE
        } else {
            tvNoResults.visibility = View.GONE
            listViewResults.visibility = View.VISIBLE
        }
    }
} 