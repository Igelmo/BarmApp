package com.example.barmapp.domain.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.barmapp.domain.dataStructures.Cocktail
import com.example.barmapp.domain.repository.CocktailRepository

class CocktailListViewModel(private val repositoryInstance: CocktailRepository) : ViewModel() {
    private val cocktails: MutableLiveData<List<Cocktail> > by lazy {
        MutableLiveData<List<Cocktail> >().also { repositoryInstance.getCocktailsStartingWithA() }
    }

    fun getCocktails() : LiveData<List<Cocktail>> {
        return cocktails
    }

}