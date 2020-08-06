package com.example.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.R
import com.example.fragment.model.Header
import kotlinx.android.synthetic.main.item_header.view.*


class HeaderAdapter(var headerList: ArrayList<Header>) :
    RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>(){

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(header : Header){
            itemView.headerName.text = header.name
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_header,
            parent, false
        )
        return HeaderViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return headerList.size

    }

    //position
    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bind(headerList[position])
    }



}