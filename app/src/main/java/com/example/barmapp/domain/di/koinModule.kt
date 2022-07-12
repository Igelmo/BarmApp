package com.example.barmapp.domain.di

import com.example.barmapp.data.CocktailDataBaseRepository
import com.example.barmapp.domain.repository.CocktailRepository
import com.example.barmapp.domain.viewmodel.CocktailListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val koinModule = module {
    single<CocktailRepository> { CocktailDataBaseRepository() }
    viewModel { CocktailListViewModel(get()) }
}
