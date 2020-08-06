package com.example.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.R
import com.example.fragment.model.Description
import kotlinx.android.synthetic.main.item_des.view.*

class DescriptionAdapter(var descriptionList: ArrayList<Description>) :
    RecyclerView.Adapter<DescriptionAdapter.DescriptionViewHolder>(){


    class DescriptionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(description : Description){
            itemView.descriptionName.text = description.description
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DescriptionViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_des,
            parent, false
        )
        return DescriptionViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return descriptionList.size

    }

    //position
    override fun onBindViewHolder(holder: DescriptionViewHolder, position: Int) {
        holder.bind(descriptionList[position])
    }


}