package com.example.recyclerviewkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        // Dentre os elementos para utilizar um RecyclerView, temos:
        // 1. Um layout para os itens da lista (food_layout.xml)
        // 2. Uma classe de dados para fornecer os dados para o RecyclerView (FoodItem.kt)
        // 3. Um ViewHolder para gerenciar os itens da lista (FoodViewHolder.kt)
        // 4. Um Adapter para vincular os dados ao RecyclerView
        // Observação: também foi necessário alterar coreKtx de "1.19.1" par "1.17.0" em gradle/libs.versions.toml

        // Inicializando o RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.foodRecyclerView);

        val foodItems = listOf(
            FoodItem(R.drawable.ic_launcher_foreground, "Pizza", "300", "1 pedaço"),
            FoodItem(R.drawable.ic_launcher_foreground, "Hamburger", "500", "1 unidade"),
            FoodItem(R.drawable.ic_launcher_foreground, "Salada", "150", "1 tigela"),
            FoodItem(R.drawable.ic_launcher_foreground, "Macarrão", "400", "1 prato"),
            FoodItem(R.drawable.ic_launcher_foreground, "Sorvete", "200", "1 bola"),
            FoodItem(R.drawable.ic_launcher_foreground, "Frango", "250", "1 pedaço"),
            FoodItem(R.drawable.ic_launcher_foreground, "Peixe", "350", "1 filé"),
            FoodItem(R.drawable.ic_launcher_foreground, "Arroz", "180", "1 xícara"),
            FoodItem(R.drawable.ic_launcher_foreground, "Feijão", "220", "1 concha"),
            FoodItem(R.drawable.ic_launcher_foreground, "Batata Frita", "400", "1 porção"),
            FoodItem(R.drawable.ic_launcher_foreground, "Coca-Cola", "150", "1 lata"),
        )

        // Set LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set Adapter
        val adapter = FoodAdapter(foodItems)
        recyclerView.adapter = adapter
    }
}