package com.example.pro2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG="MainActivity"
private val TEXT="TEXT_CONTENT"
class MainActivity : AppCompatActivity() {
    private var contenido: EditText?=null
    private var titulo: EditText?=null
     var conAux: String=""
     var titAux: String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guardar: Button =findViewById<Button>(R.id.button)
        val borrar: Button =findViewById<Button>(R.id.button2)

        contenido=findViewById<EditText>(R.id.contenido)
        titulo=findViewById<EditText>(R.id.nota)


        guardar?.setOnClickListener{GuardarNota()}
        borrar?.setOnClickListener{BorrarNota()}

    }

     fun GuardarNota(){
        conAux=contenido?.text.toString()
        titAux=titulo?.text.toString()
         setContenido()
         setTitulo()


    }
    fun BorrarNota(){
        Log.d(TAG, "se borro la nota")
        contenido?.setText("")
        titulo?.setText("")
    }
    fun setContenido(): String {//entrega el contenido de la nota
        Log.d(TAG, "se envio el contenido")
        return conAux
    }
    fun setTitulo(): String{//entrega el titulo de la nota
        Log.d(TAG, "se envio el titulo")
        return  titAux
    }

    //Metodos pre hechos
    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG,"onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }
    override fun onResume(){
        Log.d(TAG,"onResume")
        super.onResume()
    }
    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"onSaveInstanceState")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT,contenido?.text.toString())
    }
    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }
    override fun onRestart() {
        Log.d(TAG,"onRestart")
        super.onRestart()
    }
    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }
}
