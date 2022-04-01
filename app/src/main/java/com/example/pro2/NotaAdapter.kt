package com.example.pro2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NotaAdapter (val nota: List<NotaEntry>):RecyclerView.Adapter<NotaAdapter.NotaHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotaHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return NotaHolder(layoutInflater.inflate(R.layout.nota_layout,parent,false))
    }

    override fun onBindViewHolder(holder: NotaHolder, position: Int) {
        holder.render(nota[position])
    }

    override fun getItemCount(): Int =nota.size

    class NotaHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(nota: NotaEntry){
            val textTitulo:TextView?=view.findViewById(R.id.tituloNota)
            val textContenido:TextView?=view.findViewById(R.id.contenidoNota)
        }
    }

}