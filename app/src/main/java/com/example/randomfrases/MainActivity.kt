package com.example.randomfrases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = listOf<String>(
            "A gratidão é a memória do coração.",
            "Não importa o que você decidiu. O que importa é que isso te faça feliz.",
            "Deixe pra trás o que não te leva pra frente.",
            "Viver não é esperar a tempestade passar, é aprender a dançar na chuva.",
            "O segredo é ter fé em Deus.",
            "Falo nada, só observo.",
            "Insista, persista e nunca desista.",
            "As crises não afastam os amigos. Apenas selecionam.",
            "Se for pra desistir, desista de ser fraco.",
            "Queira o bem. Faça o bem. O resto vem."
        )
        val random = Random.toString()
        val botao = findViewById<Button>(R.id.button)
        var texto = findViewById<TextView>(R.id.textView)

        botao.setOnClickListener {
            texto.text = lista.random()
        }
    }
}