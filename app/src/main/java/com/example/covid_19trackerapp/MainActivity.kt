package com.example.covid_19trackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    lateinit var worldCasesTV:TextView
    lateinit var worldRecoveredTV:TextView
    lateinit var worldDeathsTV:TextView
    lateinit var countryCasesTV:TextView
    lateinit var countryRecoveredTV:TextView
    lateinit var countryDeathsTV:TextView
    lateinit var stateRecyclerView: RecyclerView
    lateinit var stateRVAdapter: StateRVAdapter
    lateinit var stateList: List<StatesModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        worldCasesTV = findViewById(R.id.WorldCases)
        worldRecoveredTV = findViewById(R.id.WorldRecovered)
        worldDeathsTV = findViewById(R.id.WorldDeaths)
        countryCasesTV = findViewById(R.id.IndianCases)
        countryDeathsTV = findViewById(R.id.IndianDeaths)
        countryRecoveredTV = findViewById(R.id.IndianRecovered)
        stateRecyclerView = findViewById(R.id.RcdStates)
        stateList = ArrayList<StatesModel>()
        getStateInfo()
        getWorldInfo()

    }

    private fun getStateInfo(){
        val url = "https://api.rootnet.in/covid19-in/stats/latest"
        val queue = Volley.newRequestQueue(this@MainActivity)
        val request = JsonObjectRequest(Request.Method.GET,url, jsonRequest: null,{
            response            
        })

    }

    private fun getWorldInfo(){

    }

}