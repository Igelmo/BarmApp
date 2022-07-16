package com.example.barmapp.data

import com.example.barmapp.data.dataStructure.CocktailResponse
import com.example.barmapp.data.service.CocktailDBAPIService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


private val moshi = Moshi.Builder()
                            .add(KotlinJsonAdapterFactory())
                            .build()

private const val BASE_URL = "https://thecocktaildb.com/api/json/v1/1/"

private val retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(MoshiConverterFactory.create(moshi))
                        .build()

object CocktailDBAPI {
    val retrofitService : CocktailDBAPIService by lazy {
        retrofit.create(CocktailDBAPIService::class.java)
    }
}