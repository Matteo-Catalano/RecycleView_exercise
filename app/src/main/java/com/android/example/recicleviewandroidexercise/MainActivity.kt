package com.android.example.recicleviewandroidexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecycleView : RecyclerView
    private lateinit var newArrayList : ArrayList<Hero>
    lateinit var listImage : ArrayList<Int>
    lateinit var listDescription : ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listImage = arrayListOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d
        )

        listDescription = arrayListOf(
            "Braccio di ferro",
            "Olivia",
            "Mario",
            "Braccobaldo"
        )

        newRecycleView = findViewById(R.id.recycleView)
        newRecycleView.layoutManager = LinearLayoutManager(this)
        newRecycleView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserdata()
    }
    private fun getUserdata(){
        for(i in listImage.indices){
            val news = Hero(listImage[i], listDescription[i])
            newArrayList.add(news)
        }
        newRecycleView.adapter = MyAdapter(newArrayList)
    }
}