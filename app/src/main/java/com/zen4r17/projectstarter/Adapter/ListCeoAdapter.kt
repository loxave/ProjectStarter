package com.zen4r17.projectstarter.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.zen4r17.projectstarter.CEO
import com.zen4r17.projectstarter.R

class ListCeoAdapter(private val listCeo: ArrayList<CEO>) :
    RecyclerView.Adapter<ListCeoAdapter.ListViewHolder>() {


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val parent: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_ceo, parent, false)
        return ListViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val ceo = listCeo[position]

        Glide.with(holder.itemView.context)
            .load(ceo.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = ceo.name
        holder.tvDetail.text = ceo.detail
    }

    override fun getItemCount(): Int {
        return listCeo.size
    }
}