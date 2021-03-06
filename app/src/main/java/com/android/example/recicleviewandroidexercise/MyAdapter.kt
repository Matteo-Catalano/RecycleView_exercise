package com.android.example.recicleviewandroidexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val heroList : ArrayList<Hero>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        val currentItem = heroList [position]
        holder.titleImage.setImageResource(currentItem.image)
        holder.imageHeading.text = currentItem.description
    }

    override fun getItemCount(): Int {
        return heroList.size
    }


    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.profilemage)
        val imageHeading : TextView = itemView.findViewById(R.id.textDescription)

    }

}