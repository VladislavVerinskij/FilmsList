package com.bignerdranch.android.filmslist.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.filmslist.MAIN
import com.bignerdranch.android.filmslist.R
import com.bignerdranch.android.filmslist.models.Photo
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    private var listMovies = emptyList<Photo>()


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.item_title.text = listMovies[position].title

        Glide.with(MAIN)
            .load(listMovies[position].url_s)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.itemView.item_img)
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }
}