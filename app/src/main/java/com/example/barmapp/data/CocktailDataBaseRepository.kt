package com.example.barmapp.data

import android.media.Image
import com.example.barmapp.domain.dataStructures.Cocktail
import com.example.barmapp.domain.repository.CocktailRepository
import retrofit2.Retrofit
import retrofit2.http.GET

class CocktailDataBaseRepository : CocktailRepository{
    override fun getCocktailsStartingWithA() = CocktailDBAPI.retrofitService.getCocktailsStartingWithA()

    override fun getCocktailDescription(id: Int): String {
        TODO("Not yet implemented")
    }

    override fun getCocktailIngredients(id: Int): List<String> {
        TODO("Not yet implemented")
    }

    override fun getImage(id: Int): Image {
        TODO("Not yet implemented")
    }
}