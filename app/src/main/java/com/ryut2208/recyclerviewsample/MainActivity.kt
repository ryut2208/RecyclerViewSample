package com.ryut2208.recyclerviewsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        val sampleList = mutableListOf<String>()
        for (i in 0..10) {
            sampleList.add(i.toString())
        }
        val adapter = RecyclerViewAdapter(this, sampleList)
        recycler_view.adapter = adapter
        recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
