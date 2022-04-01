package com.example.pro2

class NotaEntry {
    val titulo:String=""
    val contenido:String=""

    override fun toString():String{
        return """
            titulo=$titulo
            contenido=$contenido
        """.trimIndent()
    }
}