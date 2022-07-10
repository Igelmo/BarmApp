package com.example.barmapp.ui.adapter

import android.net.Uri
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.barmapp.R
import com.example.barmapp.databinding.CocktailItemBinding
import com.example.barmapp.domain.dataStructures.Cocktail
import com.example.barmapp.ui.inflate

class CocktailListAdapter(private val cocktailList: List<Cocktail>): RecyclerView.Adapter<CocktailListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.cocktail_item))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cocktail = cocktailList[position]
        holder.bind(cocktail)
    }

    override fun getItemCount() = cocktailList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var binding =  CocktailItemBinding.bind(itemView)
        fun bind(cocktail: Cocktail)  {
            binding.cocktailName.text = cocktail.name
            binding.cocktailImage.setImageURI(Uri.parse(cocktail.imageURL))
        }
    }
}

