package com.example.barmapp.ui.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.barmapp.R
import com.example.barmapp.databinding.CocktailItemBinding
import com.example.barmapp.ui.inflate

class CocktailListAdapter(private val cocktailList: List<String>): RecyclerView.Adapter<CocktailListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.cocktail_item))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cocktail = cocktailList[position]
        holder.bind(cocktail)
    }

    override fun getItemCount() = cocktailList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var binding =  CocktailItemBinding.bind(itemView)
        fun bind(cocktail: String)  {
            binding.cocktailName.text = cocktail
            binding.cocktailImage.setImageResource(R.drawable.cocktail)
        }
    }
}

