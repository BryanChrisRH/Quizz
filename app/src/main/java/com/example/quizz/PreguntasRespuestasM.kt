package com.example.quizz

class PreguntasRespuestasM {
    companion object{
        val preguntas = arrayOf(
            "¿Cual es el proximo numero en la secuencia 2,4,8,16?",
            "¿Cual es el termino matematico para el resultado de una multiplicacion?",
            "¿Que figura geometrica tiene todos sus lados y angulos iguales?",
            "¿Cuantos grados suman los angulos interiores de un triangulo?",
            "Si un poligo tiene cinco lados, ¿Como se llama?",
            "Si un poligono tiene 6 lados, ¿Como se llama?"
        )

        val corretas = arrayOf(
            "32",
            "Producto",
            "Cuadrado",
            "180°",
            "Pentagono",
            "Hexagono"
        )
        val opciones = arrayOf(
            arrayOf("20", "28", "32", "30"),
            arrayOf("Diferencia", "Cociente", "Suma", "Producto"),
            arrayOf("Rectangulo", "Trapecio", "Cuadrado", "Paralelogramo"),
            arrayOf("90°", "180°", "270°", "370°"),
            arrayOf("Triangulo","Cuadrilatero","Pentagono","Hexagono"),
            arrayOf("Pentagono","Heptagono","Hexagono","Octagono")
        )
    }
}