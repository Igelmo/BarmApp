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

class CocktailList : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: CocktailListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CocktailListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val manager = LinearLayoutManager(this)
        binding.listOfCocktails.layoutManager = manager
        val listCocktails: List<String>
        listCocktails = mutableListOf("Cocktail 1", "Cocktail 2", "Cocktail 3")
        val cocktailListAdapter = CocktailListAdapter(listCocktails)

        binding.listOfCocktails.adapter = cocktailListAdapter

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}