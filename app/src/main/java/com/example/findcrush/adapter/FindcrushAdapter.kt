package com.example.findcrush.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.findcrush.R
import com.example.findcrush.model.Findcrushdataclass
import kotlinx.android.synthetic.main.findcrush.view.*

class FindcrushViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
{
    var name=itemview.findViewById<TextView>(R.id.txt_name)
    var profile=itemview.findViewById<ImageView>(R.id.image_profile)
    var post=itemview.findViewById<ImageView>(R.id.image_post)
}

class FindcrushAdapter (val findcrushlist:ArrayList<Findcrushdataclass>): RecyclerView.Adapter<FindcrushViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FindcrushViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.findcrush,parent,false)

        return FindcrushViewHolder(view)
    }

    override fun getItemCount(): Int {
        return findcrushlist.size
    }

    override fun onBindViewHolder(holder: FindcrushViewHolder, position: Int) {
        holder.name.text=findcrushlist[position].name
        holder.profile.setImageResource(findcrushlist[position].profile)
        holder.post.setImageResource(findcrushlist[position].post)
    }
}
