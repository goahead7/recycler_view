package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(getNetworkList(),getLoginList())
    }
    private fun getNetworkList(): List<String> {
        return this.resources.getStringArray(R.array.network).toList()
    }
    private fun getLoginList(): List<String> {
        return this.resources.getStringArray(R.array.login).toList()
    }
}