package com.example.pro2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ivaCal : AppCompatActivity() {
    private var input: EditText?=null
    var valor=0.0
    val ivaP=0.16
    var iva:TextView?=null
    var precio:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iva_cal)
        //Buttons
        val regresar: Button =findViewById<Button>(R.id.retM3)
        regresar?.setOnClickListener{cambairVentana3()} // para regresar al menu
        val cal:Button=findViewById<Button>(R.id.calcular)
        cal?.setOnClickListener{Calculos()}
        val del:Button = findViewById<Button>(R.id.delete)
        del?.setOnClickListener{Borrar()}

        input=findViewById<EditText>(R.id.input)
        iva=findViewById<TextView>(R.id.iva)
        precio=findViewById<TextView>(R.id.precioF)

        iva?.text=""
        precio?.text=""

    }

    private fun Calculos() {
        var aux:Double?=null
        var aux2:Double?=null
        valor=input?.text.toString().toDouble()
        aux=valor*ivaP//iva del producto
        aux2=valor+aux//valor con iva
        //mostramos los resultados
        iva?.append(aux.toString())
        precio?.append(aux2.toString())

    }
    private fun Borrar(){
        input?.setText("")
        iva?.setText("")
        precio?.setText("")
    }
    fun cambairVentana3(){
        val re= Intent(this,Menu::class.java)
        startActivity(re)
    }


}