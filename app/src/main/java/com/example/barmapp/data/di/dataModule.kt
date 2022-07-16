package com.example.barmapp.data.di

import com.example.barmapp.data.CocktailDBAPI
import com.example.barmapp.data.CocktailDataBaseRepository
import com.example.barmapp.domain.repository.CocktailRepository
import org.koin.dsl.module

val dataModule = module {
    single<CocktailRepository> { CocktailDataBaseRepository(CocktailDBAPI.retrofitService) }
}