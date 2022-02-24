package com.example.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var userArrayList = ArrayList<User>()

        userArrayList.add(User("Faten Ali",
                                R.drawable.aileen,
                                "30 minutes ago",
                                R.drawable.pexels1))

        userArrayList.add(User("Ahmed Ali",
                                R.drawable.avatar1,
                                "15 minutes ago",
                                R.drawable.pexels2))

        userArrayList.add(User("Mazen Wael",
                                R.drawable.avatar2,
                                "45 minutes ago",
                                R.drawable.pexels3))

        userArrayList.add(User("Sara Ali",
                                R.drawable.avatar3,
                                "20 minutes ago",
                                R.drawable.pexels4))

        userArrayList.add(User("Khaled Atef",
                                R.drawable.avatar4,
                                "40 minutes ago",
                                R.drawable.pexels5))

        userArrayList.add(User("Maged Anwar",
                                R.drawable.avatar5,
                                "1 hour ago",
                                R.drawable.pexels6))
        var myRecyclerView: RecyclerView = findViewById(R.id.mRecyclerView)
        myRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )

        val userAdapter = UserAdapter(userArrayList)
        var mRecyclerView: RecyclerView = findViewById(R.id.mRecyclerView)
        mRecyclerView.adapter = userAdapter




    }
}