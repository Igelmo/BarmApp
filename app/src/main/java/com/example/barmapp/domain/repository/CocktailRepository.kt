package com.example.barmapp.domain.repository

import com.example.barmapp.domain.dataStructures.CocktailObject

interface CocktailRepository {
    suspend fun getCocktailsStartingWithA() : List<CocktailObject>
}