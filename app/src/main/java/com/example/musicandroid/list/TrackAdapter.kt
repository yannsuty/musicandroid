package com.example.musicandroid.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicandroid.R
import com.example.musicandroid.model.Competition

class TrackAdapter(private var dataSet: List<Competition>): RecyclerView.Adapter<TrackAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val trackView: TextView

        init {
            trackView = view.findViewById(R.id.track_view)
        }
    }

    fun setDataSet(list: List<Competition>) {
        dataSet = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_track_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrackAdapter.ViewHolder, position: Int) {
        val competition = dataSet[position]
        holder.trackView.text = competition.toString()
    }

    override fun getItemCount() = dataSet.size

}