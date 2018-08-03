package com.ryut2208.recyclerviewsample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * RecyclerViewAdapter.kt
 * RecyclerViewSample
 *
 * Created by RyutaTanaka on 2018/08/02
 */
class RecyclerViewAdapter(val context: Context, var items: List<String>) :
        RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.holder_view_recycler, parent, false)

        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.text.text = items.get(position)
    }
}
