package com.example.pro2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView



class RecyViewLogic:AppCompatActivity() {


    var conAux:String?=""
    var titAux: String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerctivity)
        //Boton para regresar al menu
        val regresar: Button =findViewById<Button>(R.id.retM2)
        regresar?.setOnClickListener{cambairVentana2()}
        val RecyRef:RecyclerView=findViewById<RecyclerView>(R.id.nR)

        conAux= savedInstanceState?.getString("contenidoK")
        titAux= savedInstanceState?.getString("tituloK")

        val notasL= mutableListOf(NotaEntry())
        val titles: Array<String> = titAux
        val cont: Array<String> = conAux

        for((i, element) in notasL.size()){
            var not = NotaEntry()
            not.titulo=titAux
            not.contenido=conAux

        }


    }


    fun cambairVentana2(){
        val re= Intent(this,Menu::class.java)
        startActivity(re)
    }
}