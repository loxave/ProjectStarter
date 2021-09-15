package com.zen4r17.projectstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zen4r17.projectstarter.Adapter.ListCeoAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rvCeo: RecyclerView
    private var list: ArrayList<CEO> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCeo = findViewById(R.id.rv_ceo)
        rvCeo.setHasFixedSize(true)

        list.addAll(CeoData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCeo.layoutManager = LinearLayoutManager(this)
        val listCeoAdapter = ListCeoAdapter(list)
        rvCeo.adapter = listCeoAdapter

    }
}