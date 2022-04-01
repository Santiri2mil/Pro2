package com.example.pro2

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

        crear?.setOnClickListener{startActivity(this , MainActivity::class.java)}
        lista?.setOnClickListener{startActivity(this , RecyViewLogic::class.java)}
        iva?.setOnClickListener{startActivity(this , ivaCal::class.java)}




    }

}