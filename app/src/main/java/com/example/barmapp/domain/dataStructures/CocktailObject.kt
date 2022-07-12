package com.example.barmapp.domain.dataStructures

import com.example.barmapp.data.dataStructure.Cocktail
import com.squareup.moshi.Json

data class CocktailObject(
    @Json(name = "idDrink") val id: Int,
    @Json(name = "strDrink") val name: String = "",
    @Json(name = "strDrinkThumb") val imageURL: String = "",
    @Json(name = "strInstructions") val instructions: String = "",
    @Json(name = "strIngredient1") val ingredients: List<String> = emptyList()
)