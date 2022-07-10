package com.example.barmapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.barmapp.R
import com.example.barmapp.databinding.CocktailListBinding

class CocktailDetailsActivity : AppCompatActivity() {

    private lateinit var binding: CocktailListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CocktailListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        binding.listOfCocktails.layoutManager = manager

        setSupportActionBar(binding.toolbar.toolbarMain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.toolbarMain.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)    }
}