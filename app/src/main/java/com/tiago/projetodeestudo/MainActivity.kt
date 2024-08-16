package com.tiago.projetodeestudo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<EditText>(R.id.nome)
        val botaoExibir = findViewById<Button>(R.id.botao)
        botaoExibir.setOnClickListener {
            val nomeInformado = nome.text.toString().uppercase()
            Toast.makeText(this, nomeInformado, Toast.LENGTH_SHORT).show()
        }
    }
}