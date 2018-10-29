package com.example.leserge.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val pokemones = ArrayList<Pokemon>()
        pokemones.add(Pokemon("Bulbasaur", R.drawable.bulbasaur, "Bulba, Bulba, Bulbasaur"))
        pokemones.add(Pokemon("Charmander", R.drawable.charmander, "Char, Char"))
        pokemones.add(Pokemon("Squirtle", R.drawable.squirtle, "Squirtle Squirtle"))

        val adaptador = Adaptador(pokemones)
        recyclerView.adapter=adaptador

    }
}
