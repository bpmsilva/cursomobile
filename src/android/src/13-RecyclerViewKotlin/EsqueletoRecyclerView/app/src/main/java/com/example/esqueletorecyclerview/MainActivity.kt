package com.example.esqueletorecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Localize o RecyclerView pelo ID definido em activity_main.xml.
        // val recyclerView = findViewById<RecyclerView>(R.id.foodRecyclerView)

        // Adicione objetos Food à lista abaixo.
        // Os argumentos devem corresponder ao construtor da classe Food.
        val foods = listOf<Food>(
            // Adicione os alimentos aqui.
        )

        // Configure o layoutManager do RecyclerView:
        // use LinearLayoutManager para organizar os itens em uma lista.

        // Crie um FoodAdapter passando a lista foods.

        // Atribua o adapter criado à propriedade adapter do RecyclerView.

    }
}