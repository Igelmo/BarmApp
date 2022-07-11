package com.example.barmapp.domain.repository

import android.media.Image
import com.example.barmapp.domain.dataStructures.Cocktail

interface CocktailRepository {
    suspend fun getCocktailsStartingWithA() : List<Cocktail>
}