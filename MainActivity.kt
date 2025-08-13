package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.btnClique)

        botao.setOnClickListener {
            Toast.makeText(this, "Olá, Keteline! 🚀", Toast.LENGTH_SHORT).show()
        }
    }
}