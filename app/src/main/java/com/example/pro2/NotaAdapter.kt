package com.example.pro2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NotaAdapter (context: Context, NotaEntry:ArrayList<NotaEntry>):RecyclerView.Adapter<NotaAdapter.NotaHolder>(){


    private  var localContex:Context?=null
    private var localNotaEntry:ArrayList<NotaEntry>?=null
    init {
        localContex=context
        localNotaEntry=NotaEntry
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):NotaAdapter.NotaHolder {
        val layoutInflater=LayoutInflater.from(localContex)
        return NotaHolder(layoutInflater.inflate(R.layout.nota_layout,parent,false))
    }

    override fun onBindViewHolder(holder: NotaAdapter.NotaHolder, position: Int) {
        val currentNotaEntry:NotaEntry=localNotaEntry!![position]
        holder.textTitulo?.text=currentNotaEntry.titulo
        holder.textContenido?.text=currentNotaEntry.contenido
    }

    override fun getItemCount(): Int {
        return  localNotaEntry?.size?:0
    }

    class NotaHolder(val view: View):RecyclerView.ViewHolder(view){

        val textTitulo:TextView?=view.findViewById(R.id.tituloNota)
        val textContenido:TextView?=view.findViewById(R.id.contenidoNota)

    }

}