package com.example.barmapp.domain.dataStructures

import android.media.Image

data class Cocktail (
    val name: String = "",
    val image: Image,
    val description: String = "",
    val ingredients: List<String> = emptyList()
)

