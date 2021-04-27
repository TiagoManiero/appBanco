package com.example.appbanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private lateinit var adapter: MenuItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItensLista()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)
    }

    private fun setItensLista() {
        adapter.setItensList(
            arrayListOf(
                MenuListModel(
                    "cartões"
                ),
                MenuListModel(
                    "Meus investimentos"
                ),
                MenuListModel(
                    "Portabilidade de sálario"
                ),
                MenuListModel(
                    "Investimentos"
                ),
                MenuListModel(
                    "cartões"
                ),
                MenuListModel(
                    "Meus investimentos"
                ),
                MenuListModel(
                    "Portabilidade de sálario"
                ),
                MenuListModel(
                    "Investimentos"
                )
            )
        )
    }
}