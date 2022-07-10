package com.example.barmapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.barmapp.R
import com.example.barmapp.databinding.ActivityMainBinding
import com.example.barmapp.domain.di.koinModule
import org.koin.core.context.GlobalContext.startKoin

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewCocktailsButton.setOnClickListener {
            startActivity(Intent(this, CocktailListActivity::class.java))
        }
    }
}