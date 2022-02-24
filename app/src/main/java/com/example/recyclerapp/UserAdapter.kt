package com.example.recyclerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class UserAdapter(var myList : ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {


    override fun getItemCount(): Int {

        return myList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var infoUser = myList[position]
        holder.userName.text = infoUser.mUserName
        holder.userPhoto.setImageResource(infoUser.mUserPhoto)
        holder.timesPost.text = infoUser.mPostTime
        holder.postPhoto.setImageResource(infoUser.mUserPost)
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val userName = itemView.findViewById(R.id.userName) as TextView
        val userPhoto = itemView.findViewById(R.id.userPhoto) as CircleImageView
        val timesPost = itemView.findViewById(R.id.timesPost) as TextView
        val postPhoto = itemView.findViewById(R.id.postPhoto) as ImageView

    }
}