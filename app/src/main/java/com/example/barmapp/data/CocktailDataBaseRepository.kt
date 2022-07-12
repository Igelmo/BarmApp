package com.example.barmapp.data

import com.example.barmapp.data.dataStructure.Cocktail
import com.example.barmapp.domain.dataStructures.CocktailObject
import com.example.barmapp.domain.repository.CocktailRepository

class CocktailDataBaseRepository : CocktailRepository{
    //TODO: Add with dependency injection the retrofit service later on
    override suspend fun getCocktailsStartingWithA() : List<CocktailObject> {
        val cocktailList = CocktailDBAPI.retrofitService.getCocktailsStartingWithA().drinks
        val cocktailObjectList = mutableListOf<CocktailObject>()
        cocktailList.forEach(){
            cocktailObjectList.add(it.toCocktailObject())
        }
        return cocktailObjectList
    }
}