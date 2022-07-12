package com.example.barmapp.data.dataStructure

import com.example.barmapp.domain.dataStructures.CocktailObject
import com.squareup.moshi.Json

data class Cocktail (
    @Json(name = "idDrink") val id: Int,
    @Json(name = "strDrink") val name: String = "",
    @Json(name = "strDrinkThumb") val imageURL: String = "",
    @Json(name = "strInstructions") val instructions: String = "",
    @Json(name = "strIngredient1") val ingredient1: String? = "",
    @Json(name = "strIngredient2") val ingredient2: String? = "",
    @Json(name = "strIngredient3") val ingredient3: String? = "",
    @Json(name = "strIngredient4") val ingredient4: String? = "",
    @Json(name = "strIngredient5") val ingredient5: String? = "",
    @Json(name = "strIngredient6") val ingredient6: String? = "",
    @Json(name = "strIngredient7") val ingredient7: String? = "",
    @Json(name = "strIngredient8") val ingredient8: String? = "",
    @Json(name = "strIngredient9") val ingredient9: String? = "",
    @Json(name = "strIngredient10") val ingredient10: String? = "",
    @Json(name = "strIngredient11") val ingredients11: String? = "",
    @Json(name = "strIngredient12") val ingredient12: String? = "",
    @Json(name = "strIngredient13") val ingredient13: String? = "",
    @Json(name = "strIngredient14") val ingredient14: String? = "",
    @Json(name = "strIngredient15") val ingredient15: String? = "",
) {

    fun toCocktailObject(): CocktailObject {
        return CocktailObject(id,
                            name,
                            imageURL,
                            instructions,
                            listOfNotNull(
                                ingredient1,
                                ingredient2,
                                ingredient3,
                                ingredient4,
                                ingredient5,
                                ingredient6,
                                ingredient7,
                                ingredient8,
                                ingredient9,
                                ingredient10,
                                ingredients11,
                                ingredient12,
                                ingredient13,
                                ingredient14,
                                ingredient15
                            )
        )
    }
}