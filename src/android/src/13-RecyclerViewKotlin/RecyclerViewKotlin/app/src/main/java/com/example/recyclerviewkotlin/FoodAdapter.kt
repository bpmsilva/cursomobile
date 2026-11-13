package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: List<Food>) :
    RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val foodItem = foodList[position]

        holder.foodName.text = foodItem.foodNameTextView
        holder.foodAmount.text = foodItem.foodAmountTextView
        holder.foodCalories.text = foodItem.caloriesTextView

        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(holder.itemView.context.getColor(androidx.cardview.R.color.cardview_dark_background))
            holder.foodName.setTextColor(holder.itemView.context.getColor(android.R.color.white))
            holder.foodAmount.setTextColor(holder.itemView.context.getColor(android.R.color.white))
            holder.foodCalories.setTextColor(holder.itemView.context.getColor(android.R.color.white))
        } else {
            holder.itemView.setBackgroundColor(holder.itemView.context.getColor(R.color.white))
        }

        val imagem = foodItem.foodImageView
        if (imagem != null) {
            holder.foodImage.setImageResource(imagem)
        } else {
            holder.foodImage.setImageDrawable(null)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}