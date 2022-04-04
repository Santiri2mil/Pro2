package com.example.pro2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Menu: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        val crear: Button =findViewById<Button>(R.id.crear)//Ir a crear una nota
        val lista: Button=findViewById<Button>(R.id.lista)//Ir a la lista de notas
        val iva: Button=findViewById<Button>(R.id.iva)//Ir a hacer el IVA

        crear?.setOnClickListener{crearNota()}
        lista?.setOnClickListener{listaNotas()}
        iva?.setOnClickListener{irIva()}




    }
    fun crearNota(){
        val cN= Intent(this,MainActivity::class.java)
        startActivity(cN)
    }
    fun listaNotas(){
        val lN= Intent(this,RecyViewLogic::class.java)
        startActivity(lN)
    }
    fun irIva(){
        val irIva= Intent(this,ivaCal::class.java)
        startActivity(irIva)
    }

}