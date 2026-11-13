package com.example.recyclerviewkotlin

class Food {
    var foodImageView: Int? = null
    var foodNameTextView: String? = null
    var caloriesTextView: String? = null
    var foodAmountTextView: String? = null

    constructor(
        foodImageView: Int?,
        foodNameTextView: String?,
        caloriesTextView: String?,
        foodAmountTextView: String?
    ) {
        this.foodImageView = foodImageView
        this.foodNameTextView = foodNameTextView
        this.caloriesTextView = caloriesTextView
        this.foodAmountTextView = foodAmountTextView
    }
}