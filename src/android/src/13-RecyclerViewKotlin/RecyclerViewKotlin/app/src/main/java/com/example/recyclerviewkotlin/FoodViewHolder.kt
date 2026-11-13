package com.example.recyclerviewkotlin

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// ViewHolder: guarda as referências às views de um item.
class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val foodName: TextView = itemView.findViewById(R.id.foodNameTextView)
    val foodAmount: TextView = itemView.findViewById(R.id.foodAmountTextView)
    val foodCalories: TextView = itemView.findViewById(R.id.caloriesTextView)
    val foodImage: ImageView = itemView.findViewById(R.id.foodImageView)
}