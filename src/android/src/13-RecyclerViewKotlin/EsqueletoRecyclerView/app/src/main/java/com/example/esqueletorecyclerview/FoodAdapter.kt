package com.example.esqueletorecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Adapter: conecta a lista de dados às views do RecyclerView.
class FoodAdapter(
    // Lista de comidas que será exibida.
    private val foodList: List<Food>
) : RecyclerView.Adapter<FoodViewHolder>() {

    // Cria a view do item e seu ViewHolder quando necessário.
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FoodViewHolder {
        // Infle o layout XML do item.
        // Depois, crie e retorne um FoodViewHolder com a view inflada.
        //
        // O ViewHolder mantém referências às views internas do item.
        TODO("Criar e retornar o FoodViewHolder")
    }

    // Preenche um item; suas views podem ter exibido outra comida.
    override fun onBindViewHolder(
        holder: FoodViewHolder,
        position: Int
    ) {
        // Obtenha a comida na posição fornecida.
        // Use seus dados para preencher as views do ViewHolder.
        TODO("Preencher as views com os dados da comida")
    }

    // Informa quantos itens existem na lista.
    override fun getItemCount(): Int {
        TODO("Retornar o tamanho da lista")
    }
}
