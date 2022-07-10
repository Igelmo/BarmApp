package com.example.barmapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.barmapp.R
import com.example.barmapp.databinding.CocktailListBinding
import com.example.barmapp.domain.repository.CocktailRepository
import com.example.barmapp.domain.viewmodel.CocktailListViewModel
import com.example.barmapp.ui.adapter.CocktailListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.java.KoinJavaComponent.inject

class CocktailListActivity : AppCompatActivity() {

    private lateinit var binding: CocktailListBinding
    val viewModelInstance: CocktailListViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CocktailListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        binding.listOfCocktails.layoutManager = manager

        setSupportActionBar(binding.toolbar.toolbarMain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.toolbarMain.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)

        val listCocktails: List<String>
        listCocktails = mutableListOf("Cocktail 1", "Cocktail 2", "Cocktail 3")
        val cocktailListAdapter = CocktailListAdapter(listCocktails)

        binding.listOfCocktails.adapter = cocktailListAdapter

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}