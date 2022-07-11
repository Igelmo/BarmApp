package com.example.barmapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import com.example.barmapp.R
import com.example.barmapp.databinding.ActivityCocktailDetailsBinding
import com.example.barmapp.databinding.CocktailListBinding

class CocktailDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCocktailDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCocktailDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cocktailNameTitle.text = intent.getStringExtra("cocktailName")
        binding.headerCocktailImage.load(intent.getStringExtra("cocktailImageURI"))
        binding.cocktailInstructions.text = intent.getStringExtra("cocktailInstructions")

        setSupportActionBar(binding.toolbar.toolbarMain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.toolbarMain.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}