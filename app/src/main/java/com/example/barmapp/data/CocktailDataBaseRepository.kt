package com.example.barmapp.data

import com.example.barmapp.data.service.CocktailDBAPIService
import com.example.barmapp.domain.dataStructures.CocktailObject
import com.example.barmapp.domain.repository.CocktailRepository

class CocktailDataBaseRepository(private val cocktailDBAPIService: CocktailDBAPIService) : CocktailRepository{
    override suspend fun getCocktailsStartingWithA() : List<CocktailObject> {
        val cocktailList = cocktailDBAPIService.getCocktailsStartingWithA().drinks
        val cocktailObjectList = mutableListOf<CocktailObject>()
        cocktailList.forEach {
            cocktailObjectList.add(it.toCocktailObject())
        }
        return cocktailObjectList
    }
}