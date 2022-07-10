package com.example.barmapp.domain.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.barmapp.domain.dataStructures.Cocktail
import com.example.barmapp.domain.repository.CocktailRepository
import kotlinx.coroutines.launch

class CocktailListViewModel(private val repositoryInstance: CocktailRepository) : ViewModel() {

    private val _cocktails: MutableLiveData<List<Cocktail> > = MutableLiveData(emptyList())
    val cocktails: LiveData<List<Cocktail>> = _cocktails

    init {
        viewModelScope.launch {
            _cocktails.postValue(repositoryInstance.getCocktailsStartingWithA())
        }
    }

}