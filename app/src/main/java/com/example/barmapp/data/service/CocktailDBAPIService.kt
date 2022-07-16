package com.example.barmapp.data.service

import com.example.barmapp.data.dataStructure.CocktailResponse
import retrofit2.http.GET

interface CocktailDBAPIService {
    @GET("search.php?f=a")
    suspend fun getCocktailsStartingWithA() : CocktailResponse
}