package com.example.pro2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView


class NotaEntry {
    var titulo:String?=""
    var contenido:String?=""

    override fun toString():String{
        return """
            titulo=$titulo
            contenido=$contenido
        """.trimIndent()
    }
}
class RecyViewLogic:AppCompatActivity() {

    val notasL= mutableListOf(NotaEntry())
    var conAux:String?=""
    var titAux: String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerctivity)
        conAux= savedInstanceState?.getString("contenidoK")
        titAux= savedInstanceState?.getString("tituloK")
        //Boton para regresar al menu
        val regresar: Button =findViewById<Button>(R.id.retM2)
        regresar?.setOnClickListener{cambairVentana2()}
        val RecyRef:RecyclerView=findViewById<RecyclerView>(R.id.nR)

        notasL.add(Nota())

        fun initRecycler(){


            RecyRef?.layoutManager
            val adapter=NotaAdapter(notasL)
            RecyRef.adapter=adapter
        }
    }

    fun Nota():NotaEntry {
        var not = NotaEntry()
        not?.titulo=titAux
        not?.contenido=conAux
        return not
    }
    fun cambairVentana2(){
        val re= Intent(this,Menu::class.java)
        startActivity(re)
    }
}