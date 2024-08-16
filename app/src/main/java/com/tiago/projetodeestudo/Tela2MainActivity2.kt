package com.tiago.projetodeestudo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Tela2MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela2_main2)

        val nome = intent.getStringExtra("nome")
        val nomeTextView = findViewById<TextView>(R.id.nome_segunda_tela)
        nomeTextView.text = nome

    }
}