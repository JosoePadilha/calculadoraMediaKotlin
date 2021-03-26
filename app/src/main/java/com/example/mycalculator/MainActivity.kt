package com.example.mycalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val resultado = resultado

        btnCalcular.setOnClickListener {
            val nota1 = Integer.parseInt (nota1.text.toString())
            val nota2 = Integer.parseInt (nota2.text.toString())
            val media = (nota1 + nota2)/2

            if (media >= 7){
                resultado.setText("O aluno foi aprovado com média" + "\n" + media)
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("O aluno foi reprovado com média" + "\n" + media)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}