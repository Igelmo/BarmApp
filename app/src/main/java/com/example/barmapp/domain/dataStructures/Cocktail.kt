package com.example.barmapp.domain.dataStructures

import android.media.Image
import com.squareup.moshi.Json

data class Cocktail (
    @Json(name = "idDrink") val id: Int,
    @Json(name = "strDrink") val name: String = "",
    @Json(name = "strDrinkThumb") val imageURL: String = "",
    @Json(name = "strInstructions") val instructions: String = "",
    @Json(name = "strIngredient1") val ingredients: String = ""
)

