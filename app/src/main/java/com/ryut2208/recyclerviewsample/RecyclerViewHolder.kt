package com.ryut2208.recyclerviewsample

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.holder_view_recycler.view.*

/**
 * RecyclerViewHolder.kt
 * RecyclerViewSample
 *
 * Created by RyutaTanaka on 2018/08/02
 */
class RecyclerViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
    val text: TextView = view.text
}
