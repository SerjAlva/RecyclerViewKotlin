package com.example.leserge.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class Adaptador(var lista: ArrayList<Pokemon>): RecyclerView.Adapter<Adaptador.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_item, parent)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: Adaptador.ViewHolder, position: Int) {
        holder.bindItems(lista[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bindItems(data: Pokemon){
            val nombre: TextView=itemView.findViewById(R.id.nombre)
            val pokemonPict: ImageView = itemView.findViewById(R.id.pokemonPict)

            nombre.text = data.nombre

            Glide.with(itemView.context).load(data.pokemonPict).into(pokemonPict)

            itemView.setOnClickListener{
                Toast.makeText(itemView.context, data.rugido, Toast.LENGTH_SHORT)
            }
        }
    }

}