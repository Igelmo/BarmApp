package com.example.barmapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.barmapp.R
import com.example.barmapp.databinding.CocktailListBinding
import com.example.barmapp.domain.viewmodel.CocktailListViewModel
import com.example.barmapp.ui.adapter.CocktailListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class CocktailListActivity : AppCompatActivity() {

    private lateinit var binding: CocktailListBinding
    private val viewModelInstance: CocktailListViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CocktailListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        binding.listOfCocktails.layoutManager = manager

        setSupportActionBar(binding.toolbar.toolbarMain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.toolbarMain.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)

        viewModelInstance.cocktails.observe(this) {
            val cocktailListAdapter = it?.let { CocktailListAdapter(it) }

            binding.listOfCocktails.adapter = cocktailListAdapter
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}