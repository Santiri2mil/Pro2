package com.example.pro2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecyViewLogic:AppCompatActivity() {
    var conAux: String=""
    var titAux: String=""
    val notasL= listOf(NotaEntry())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerctivity)
        //Boton para regresar al menu
        val regresar: Button =findViewById<Button>(R.id.retM2)
        regresar?.setOnClickListener{startActivity(this , Menu::class.java)}
    }

    

    fun initRecycler(){
        notasRecycler.layoutManager=ConstraintLayoutManager(this)
        val adapter=NotaAdapter(notasL)
        notasRecycler.adapter=adapter


    }
}