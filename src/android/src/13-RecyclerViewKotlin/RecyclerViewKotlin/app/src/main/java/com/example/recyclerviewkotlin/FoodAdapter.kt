package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: List<FoodItem>) :
    RecyclerView.Adapter<FoodAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val foodItem = foodList[position]

        holder.foodName.text = foodItem.foodNameTextView
        holder.foodAmount.text = foodItem.foodAmountTextView
        holder.foodCalories.text = foodItem.caloriesTextView

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

    // ViewHolder class
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodName: TextView = itemView.findViewById(R.id.foodNameTextView)
        val foodAmount: TextView = itemView.findViewById(R.id.foodAmountTextView)
        val foodCalories: TextView = itemView.findViewById(R.id.caloriesTextView)
        val foodImage: ImageView = itemView.findViewById(R.id.foodImageView)
    }
}