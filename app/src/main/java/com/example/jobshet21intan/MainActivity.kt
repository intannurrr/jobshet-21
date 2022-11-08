package com.example.jobshet21intan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<siswa>()
    val listnama = arrayOf(
        "Ibnu Rif'an",
        "Jihan Salwa Fitriani",
        "Khotimatus Sa'adah",
        "Lada'ardi Sachio Lawidyath",
        "Latifah Irsyadiah",
        "Maulida Intan Nur Aini",
        "Miftakhul Jannah",
        "Muh Asa Farikh Sakti",
        "Muhammad Haikal",
        "Muhammad Rifqil Khanif",
        "Nabhan Aflahu Syafiq",

    )
    lateinit var makananView: RecyclerView
    lateinit var  makananAdapter: makananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.nama)
        makananView.layoutManager = LinearLayoutManager( this)

        for (i in listnama.indices){
            list.add(siswa(listnama[i],))
        }

        makananAdapter = makananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}