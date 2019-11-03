package com.example.android.trackmysleepquality.sleeptracker

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter: RecyclerView.Adapter<SleepNightAdapter.TextItemViewHolder>() {

    var data = listOf<SleepNight>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val item = data.get(position)

        holder.textView.text = item.sleepQualityRating.toString()
    }

    class TextItemViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView) {

    }
}