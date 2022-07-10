package com.example.barmapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.barmapp.R
import com.example.barmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.toolbarMain.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        binding.viewCocktailsButton.setOnClickListener {
            startActivity(Intent(this, CocktailListActivity::class.java))
        }
    }
}