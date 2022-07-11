package com.example.barmapp.data

import android.media.Image
import com.example.barmapp.domain.dataStructures.Cocktail
import com.example.barmapp.domain.repository.CocktailRepository
import retrofit2.Retrofit
import retrofit2.http.GET

class CocktailDataBaseRepository : CocktailRepository{
    //TODO: Add with dependency injection the retrofit service later on
    override suspend fun getCocktailsStartingWithA() = CocktailDBAPI.retrofitService.getCocktailsStartingWithA().drinks
}