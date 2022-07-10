package com.example.barmapp.domain.repository

import android.media.Image
import com.example.barmapp.domain.dataStructures.Cocktail

interface CocktailRepository {
    suspend fun getCocktailsStartingWithA() : List<Cocktail>
    fun getCocktailDescription(id: Int) : String
    fun getCocktailIngredients(id: Int) : List<String>
    fun getImage(id: Int): String
}