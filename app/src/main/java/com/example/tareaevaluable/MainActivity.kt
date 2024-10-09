package com.example.tareaevaluable

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    val TAG =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado1 = f1(1.0, -3.0, 2.0)
        Log.d(TAG,"Resultado ecuación 1: ${resultado1[0]}, ${resultado1[1]}, ${resultado1[2]}")
    }

    fun ecuacionSegundoGrado(a: Double, b: Double, c: Double): Array<Double> {
        val resultado = b * b - 4 * a * c

        return when {
            // Dos soluciones reales
            resultado > 0 -> {
                val v1 = (-b + sqrt(resultado)) / (2 * a)
                val v2 = (-b - sqrt(resultado)) / (2 * a)
                arrayOf(1.0, v1, v2)
            }
            // Una única solución
            resultado == 0.0 -> {
                val v = -b / (2 * a)
                arrayOf(1.0, v, v)
            }
            // Sin solución
            else -> arrayOf(0.0, 0.0, 0.0)
        }
    }

    fun f1(a: Double, b: Double, c: Double): Array<Double> {
        val resultado = ecuacionSegundoGrado(a, b, c)

        return when (resultado[0]) {
            //Si hay dos soluciones
            //Math.abs para calcular el valor absoluto
            1.0 -> {
                val primero = Math.abs(resultado[1]) + Math.abs(resultado[2])
                arrayOf(1.0, primero, 0.0)
            }
            //Sin solución
            else -> {
                arrayOf(0.0, 0.0, 0.0)
            }

        }
    }


    fun f2(x1:Double, x2:Double, x3:Double):Double{
        var suma = 0.0
       return suma;
    }
}