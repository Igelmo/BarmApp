package com.example.barmapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.barmapp.R
import com.example.barmapp.databinding.CocktailListBinding
import com.example.barmapp.ui.adapter.CocktailListAdapter

class CocktailListActivity : AppCompatActivity() {

    private lateinit var binding: CocktailListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CocktailListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        binding.listOfCocktails.layoutManager = manager

        binding.toolbar.toolbarMain.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)

        val listCocktails: List<String>
        listCocktails = mutableListOf("Cocktail 1", "Cocktail 2", "Cocktail 3")
        val cocktailListAdapter = CocktailListAdapter(listCocktails)

        binding.listOfCocktails.adapter = cocktailListAdapter

    }

}